package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Experiencia;
import com.portfolio.ejz.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {
    
    private final ExperienciaRepository experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public List<Experiencia> getExperiencias(){
        return experienciaRepo.findAll();
    }
    public Experiencia updateExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void deleteExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}
