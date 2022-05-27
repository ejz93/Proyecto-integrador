package com.portfolio.ejz.Controller;

import com.portfolio.ejz.Entity.Persona;
import com.portfolio.ejz.Service.IPersonaService;
import com.portfolio.ejz.Service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {
    @Autowired PersonaService persoServ;
    
    
    @PostMapping("/add")
    public String addPersona(@RequestBody Persona per) {
        persoServ.addPersona(per);
        return "La persona fue creada correctamente";
    }
    
    @GetMapping("/get")
    public List<Persona> getPersona(){
        return persoServ.getPersona();
    }
    
    @DeleteMapping("/delete/{id}")
    public void deletePersona (@PathVariable Long id){
        persoServ.deletePersona(id);
    }
    
    @PutMapping("/update")
    public String updatePersona(@RequestBody Persona per){
        persoServ.updatePersona(per);
        return "Cambios realizados";
    }
    
    @GetMapping("/traer/perfil")
    public Persona findPersona(){
        return persoServ.findPersona((long)1);
    }
}
