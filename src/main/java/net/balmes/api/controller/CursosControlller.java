package net.balmes.api.controller;

import net.balmes.api.objects.Cursos;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CursosControlller {

    @GetMapping("Cursos")
    public List<Cursos> getCursos() {
        List<Cursos> CursosCFGS = new ArrayList<>();
        CursosCFGS.add(new Cursos("ASIX", "ASIX1", "21","1"));
        CursosCFGS.add(new Cursos("ASIX", "ASIX1", "23","1"));
        CursosCFGS.add(new Cursos("DAM", "DAM1", "24","1"));
        CursosCFGS.add(new Cursos("DAM", "DAM2", "25","1"));
        CursosCFGS.add(new Cursos("DAW", "DAW1", "26","1"));
        CursosCFGS.add(new Cursos("DAW", "DAW2", "27","1"));
        CursosCFGS.add(new Cursos("ASIX", "ASIX1", "21","2"));
        CursosCFGS.add(new Cursos("ASIX", "ASIX1", "23","2"));
        CursosCFGS.add(new Cursos("DAM", "DAM1", "24","2"));
        CursosCFGS.add(new Cursos("DAM", "DAM2", "25","2"));
        CursosCFGS.add(new Cursos("DAW", "DAW1", "26","2"));
        CursosCFGS.add(new Cursos("DAW", "DAW2", "27","2"));

        //Grupo 1 = diurno
        //Grupo 2 = nocturno

        return CursosCFGS;
    }


}
