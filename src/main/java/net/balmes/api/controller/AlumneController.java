package net.balmes.api.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import net.balmes.api.objects.Alumnos;

@RestController
public class AlumneController {

	@GetMapping("alumnos/{nAlumnos}")
	public Alumnos getClient(@PathVariable int nAlumnos) {
		List<Alumnos> listaAlumnos = new ArrayList<>();
		Alumnos Javi = new Alumnos("Javi", "Miranda", LocalDate.of(2001, 06, 18));
        Alumnos Raul = new Alumnos("Raul", "Rufo", LocalDate.of(2003, 9, 28));
        Alumnos Miguel = new Alumnos("Miguel", "Luis", LocalDate.of(1892, 7, 1));
        Alumnos Felipe = new Alumnos("Felipe", "Garcia", LocalDate.of(1842, 06, 8));

		listaAlumnos.add(Javi);
        listaAlumnos.add(Raul);
        listaAlumnos.add(Miguel);
        listaAlumnos.add(Felipe);

		return listaAlumnos.get(nAlumnos -1);
	}

	@GetMapping("clients")
	public List<Alumnos> getClients() {
		List<Alumnos> clients = new ArrayList<>();
		clients.add(new Alumnos("Joana", "Petita", LocalDate.of(2000, Month.APRIL, 23)));
		clients.add(new Alumnos("Joan", "Petit", LocalDate.of(2000, Month.MARCH, 22)));
		clients.add(new Alumnos("Luis", "Garcia", LocalDate.of(2000, Month.APRIL, 23)));
		clients.add(new Alumnos("Mercedes", "Benz", LocalDate.of(2000, Month.MARCH, 22)));
		return clients;
	}

}
