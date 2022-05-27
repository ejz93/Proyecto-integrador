package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Educacion;
import com.portfolio.ejz.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepository educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepository educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> getEducaciones(){
        return educacionRepo.findAll();
    }
    public Educacion updateEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void deleteEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}
