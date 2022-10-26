package net.balmes.api.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import net.balmes.api.objects.Asix;
import net.balmes.api.objects.Dam;
import net.balmes.api.objects.Daw;
import net.balmes.api.objects.Smix;

@RestController
public class FPController {

    @GetMapping("FP/Asix")
    public List<Asix> getAsix() {
        List<Asix> alumnosAsix = new ArrayList<>();
        alumnosAsix.add(new Asix("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosAsix.add(new Asix("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosAsix.add(new Asix("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosAsix.add(new Asix("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosAsix;
    }

    @GetMapping("FP/Dam")
    public List<Dam> getDam() {
        List<Dam> alumnosDam = new ArrayList<>();
        alumnosDam.add(new Dam("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDam.add(new Dam("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDam.add(new Dam("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDam.add(new Dam("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosDam;
    }

    @GetMapping("FP/Daw")
    public List<Daw> getDaw() {
        List<Daw> alumnosDaw = new ArrayList<>();
        alumnosDaw.add(new Daw("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDaw.add(new Daw("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDaw.add(new Daw("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDaw.add(new Daw("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosDaw;
    }

    @GetMapping("FP/Smix")
    public List<Smix> getSmix() {
        List<Smix> alumnosSmix = new ArrayList<>();
        alumnosSmix.add(new Smix("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosSmix.add(new Smix("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosSmix.add(new Smix("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosSmix.add(new Smix("Antonio", "Machado", "mMachado@gmail.com"));

        return alumnosSmix;
    }

}
