package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void addPersona (Persona per);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
    
    public void updatePersona (Persona per);
}
