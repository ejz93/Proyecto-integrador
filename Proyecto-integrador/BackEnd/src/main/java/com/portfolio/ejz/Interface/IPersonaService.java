package com.portfolio.ejz.Interface;

import com.portfolio.ejz.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una Persona por ID
    public Persona findPersona(Long id);
}
