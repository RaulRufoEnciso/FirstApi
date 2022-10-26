package net.balmes.api.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import net.balmes.api.objects.FP;

@RestController
public class FPController {

<<<<<<< HEAD
    @GetMapping("FP/Asix")
    public List<FP> getAsix() {
        List<FP> alumnosAsix = new ArrayList<>();
        alumnosAsix.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosAsix.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosAsix.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosAsix.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));
=======
    @GetMapping("fp/asix")
    public List<Asix> getAsix() {
        List<Asix> alumnosAsix = new ArrayList<>();
        alumnosAsix.add(new Asix("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosAsix.add(new Asix("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosAsix.add(new Asix("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosAsix.add(new Asix("Antonio", "Machado", "mMachado@gmail.com"));
>>>>>>> main

        return alumnosAsix;
    }

<<<<<<< HEAD
    @GetMapping("FP/Dam")
    public List<FP> getDam() {
        List<FP> alumnosDam = new ArrayList<>();
        alumnosDam.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDam.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDam.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDam.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));
=======
    @GetMapping("fp/dam")
    public List<Dam> getDam() {
        List<Dam> alumnosDam = new ArrayList<>();
        alumnosDam.add(new Dam("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDam.add(new Dam("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDam.add(new Dam("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDam.add(new Dam("Antonio", "Machado", "mMachado@gmail.com"));
>>>>>>> main

        return alumnosDam;
    }

<<<<<<< HEAD
    @GetMapping("FP/Daw")
    public List<FP> getDaw() {
        List<FP> alumnosDaw = new ArrayList<>();
        alumnosDaw.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDaw.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDaw.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDaw.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));
=======
    @GetMapping("fp/daw")
    public List<Daw> getDaw() {
        List<Daw> alumnosDaw = new ArrayList<>();
        alumnosDaw.add(new Daw("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosDaw.add(new Daw("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosDaw.add(new Daw("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosDaw.add(new Daw("Antonio", "Machado", "mMachado@gmail.com"));
>>>>>>> main

        return alumnosDaw;
    }

<<<<<<< HEAD
    @GetMapping("FP/Smix")
    public List<FP> getSmix() {
        List<FP> alumnosSmix = new ArrayList<>();
        alumnosSmix.add(new FP("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosSmix.add(new FP("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosSmix.add(new FP("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosSmix.add(new FP("Antonio", "Machado", "mMachado@gmail.com"));
=======
    @GetMapping("fp/smix")
    public List<Smix> getSmix() {
        List<Smix> alumnosSmix = new ArrayList<>();
        alumnosSmix.add(new Smix("Gabriel", "Garcia Marquez", "gMarquez@gmail.com"));
        alumnosSmix.add(new Smix("Federico", "Garcia Lorca", "fedeLorca@gmail.com"));
        alumnosSmix.add(new Smix("Pedro", "Salinas", "panchoSalinas@gmail.com"));
        alumnosSmix.add(new Smix("Antonio", "Machado", "mMachado@gmail.com"));
>>>>>>> main

        return alumnosSmix;
    }

}
