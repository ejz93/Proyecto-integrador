package com.portfolio.ejz.Controller;

import com.portfolio.ejz.Entity.Skills;
import com.portfolio.ejz.Service.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/skills")
public class SkillsController {
    private final SkillsService skillsService;
    
    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skills> editarEducacion(@RequestBody Skills skills){
        Skills updateSkills=skillsService.updateSkills(skills);
        return new ResponseEntity<>(updateSkills,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkills=skillsService.addSkills(skills);
        return new ResponseEntity<>(nuevaSkills,HttpStatus.CREATED);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills=skillsService.getSkills();
        return new ResponseEntity<>(skills,HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
