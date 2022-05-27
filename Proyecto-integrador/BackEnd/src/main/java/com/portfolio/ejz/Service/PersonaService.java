package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Persona;
import com.portfolio.ejz.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> getPersona() {
        List<Persona> per = persoRepo.findAll();
        return per;
    }

    @Override
    public void addPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void updatePersona(Persona per) {
        persoRepo.save(per);
    }
    
}
