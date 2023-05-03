package co.edu.uceva.facultad.controller;

import co.edu.uceva.facultad.model.entities.Facultad;
import co.edu.uceva.facultad.model.service.IFacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("facultad_service")
public class FacultadController {

    @Autowired
    IFacultadService facultadService;

    /**
     * EndPoint para recibir un saludo
     * @param nombre Es el nombre del usuario
     * @return saludo
     */
    @GetMapping("/facultad/{nombre}")
    public String imprimir(@PathVariable("nombre") String nombre){
        return "hola " + nombre;
    }

    @GetMapping("/facultades")
    public List<Facultad> listar(){

        List <Facultad> facultades = new ArrayList<>();
        Facultad facultad1 = new Facultad(1L, "Facultad de ingenieria");
        Facultad facultad2 = new Facultad(2L, "Facultad de ciencias de la salud");
        facultades.add(facultad1);
        facultades.add(facultad2);

        return facultades;
    }
}
