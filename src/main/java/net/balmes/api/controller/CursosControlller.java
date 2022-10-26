package net.balmes.api.controller;

import net.balmes.api.objects.Cursos;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CursosControlller {

    @GetMapping("cursos")
    public List<Cursos> getCursos() {
        List<Cursos> CursosCFGS = new ArrayList<>();
        CursosCFGS.add(new Cursos("ASIX", "ASIX1",1, "21","diurn"));
        CursosCFGS.add(new Cursos("ASIX", "ASIX2",2, "23","diurn"));
        CursosCFGS.add(new Cursos("DAM", "DAM1",1, "24","diurn"));
        CursosCFGS.add(new Cursos("DAM", "DAM2",2, "25","diurn"));
        CursosCFGS.add(new Cursos("DAW", "DAW1",1, "26","diurn"));
        CursosCFGS.add(new Cursos("DAW", "DAW2",2, "27","diurn"));
        CursosCFGS.add(new Cursos("ASIX", "ASIX1",1, "21","nocturn"));
        CursosCFGS.add(new Cursos("ASIX", "ASIX2",2, "23","nocturn"));
        CursosCFGS.add(new Cursos("DAM", "DAM1",1,"24","nocturn"));
        CursosCFGS.add(new Cursos("DAM", "DAM2",2, "25","nocturn"));
        CursosCFGS.add(new Cursos("DAW", "DAW1",1,"26","nocturn"));
        CursosCFGS.add(new Cursos("DAW", "DAW2",2, "27","nocturn"));

        // Horario 1 = diurno
        // Horario 2 = nocturno

        return CursosCFGS;
    }


}
