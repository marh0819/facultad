package co.edu.uceva.facultad.model.service;

import co.edu.uceva.facultad.model.entities.Facultad;

import java.util.List;

public interface IFacultadService
{
    public Facultad save(Facultad facultad);
    public void delete(Facultad facultad);
    public Facultad update(Facultad facultad);
    public List<Facultad> findAll();
    public Facultad findById(Long id);
}
