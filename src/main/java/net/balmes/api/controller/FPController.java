package net.balmes.api.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import net.balmes.api.objects.FP;

@RestController
public class FPController {

    @GetMapping("FP/Asix")
    public List<FP> getAsix() {
        List<FP> alumnosAsix = new ArrayList<>();
        alumnosAsix.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosAsix.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosAsix.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosAsix.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosAsix;
    }

    @GetMapping("FP/Dam")
    public List<FP> getDam() {
        List<FP> alumnosDam = new ArrayList<>();
        alumnosDam.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDam.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDam.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDam.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosDam;
    }

    @GetMapping("FP/Daw")
    public List<FP> getDaw() {
        List<FP> alumnosDaw = new ArrayList<>();
        alumnosDaw.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDaw.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDaw.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDaw.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosDaw;
    }

    @GetMapping("FP/Smix")
    public List<FP> getSmix() {
        List<FP> alumnosSmix = new ArrayList<>();
        alumnosSmix.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosSmix.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosSmix.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosSmix.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosSmix;
    }

}
