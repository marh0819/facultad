package co.edu.uceva.facultad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("facultad_service")
public class FacultadController {
    /**
     * EndPoint para recibir un saludo
     * @param nombre Es el nombre del usuario
     * @return saludo
     */
    @GetMapping("/facultad/{nombre}")
    public String imprimir(@PathVariable("nombre") String nombre){
        return "hola " + nombre;
    }
}
