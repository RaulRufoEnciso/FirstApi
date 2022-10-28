package net.balmes.api.controller;

import net.balmes.api.entity.*;
import net.balmes.api.repository.CursosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CursosController {
	
	@Autowired
    CursosRepository cursosRep;
    
    public CursosController(CursosRepository userService) {
        this.cursosRep = userService;
    }
    
    @GetMapping("/api/cursos/{id}")
    public Cursos byId(@PathVariable("id") long id) {
        return cursosRep.findById(id).get();
    }
    
    @GetMapping("/api/cursos")
	public Iterable<Cursos> getClient() {
		
		return cursosRep.findAll();
	}
   /*
    @PostMapping("/api/cursos/")
    public Cursos create(@RequestBody Cursos cursos) {
        return cursosRep.create(cursos);
    }

    @PutMapping("/api/cursos/")
    public Cursos update(@RequestBody Cursos cursos) {
        return cursosRep.update(cursos);
    }
    /*
    @PatchMapping("/api/cursos/")
    public Cursos change(@RequestBody Cursos cursos) {
        return cursosRep.change(cursos);
    }

    @DeleteMapping("/api/cursos/{id}")
    public Cursos delete(@PathVariable("id") long id) {
        return cursosRep.deleteById(id).get();
    }
*/
}