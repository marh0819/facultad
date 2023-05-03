package co.edu.uceva.facultad.model.service;

import co.edu.uceva.facultad.model.entities.Facultad;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementa el servicio de la facultad
 * un servicio es un objeto controlado por el contenedor del spring
 * @return un saludo
 */
@Service
public class FacultadServiceImpl implements IFacultadService{

    @Override
    public Facultad save(Facultad facultad){
        return null;
    }

    @Override
    public void delete(Facultad facultad){

    }

    @Override
    public Facultad update(Facultad facultad){
        return null;
    }

    @Override
    public List<Facultad> findAll(){
        return null;
    }

    @Override
    public Facultad findById(Long id){
        return null;
    }
}
