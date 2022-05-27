package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Skills;
import com.portfolio.ejz.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillsService {
    
    private final SkillsRepository skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepository skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public List<Skills> getSkills(){
        return skillsRepo.findAll();
    }
    public Skills updateSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public void deleteSkills(Long id){
        skillsRepo.deleteById(id);
    }
}
