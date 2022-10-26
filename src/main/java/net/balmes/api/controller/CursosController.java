package net.balmes.api.controller;

import net.balmes.api.objects.Cursos;
import net.balmes.api.repository.CursosRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping()

public class CursosController {
    @Autowired
    CursosRepository cursosRepository;
    @GetMapping("CURSOS")
    public List<Cursos> getCursos(@PathVariable long id) {

        return (List<Cursos>) cursosRepository.findById(id).get();
    }
    @GetMapping("CURSOS")
    public Iterable<Cursos> getCursos() {

        return cursosRepository.findAll();
    }
    @PostMapping("CURSOS")
    public Cursos altaCursos(@RequestBody Cursos cursos) {
        cursosRepository.save(cursos);

        return cursos;
    }
    @DeleteMapping
    public Cursos deleteCursos(@RequestBody Cursos cursos) {
        cursosRepository.delete(cursos);

        return cursos;
    }
    @PutMapping
    public Cursos putCursos(@RequestBody Cursos cursos) {

        return cursos;
    }



}
