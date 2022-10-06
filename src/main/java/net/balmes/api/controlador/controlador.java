package net.balmes.api.controlador;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import net.balmes.api.objetos.Alumnos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador {
	
	@GetMapping("hola")
	public String bonaTarda() {
		return "<h1>bona tarda</h1>";
	}
	
	@GetMapping("alumnos")
	public Alumnos getClient() {
		return new Alumnos("Joana", "Petita", 
				LocalDate.of(2000, Month.APRIL, 23));
	}
	
	@GetMapping("clients")
	public List<Alumnos> getClients(){
		ArrayList<Alumnos> clients = new ArrayList<>();
		
		clients.add(new Alumnos("Joana", "Petita", 
				LocalDate.of(2000, Month.APRIL, 23)));
		clients.add(new Alumnos("Joan", "Petit", 
				LocalDate.of(2000, Month.MARCH, 22)));
		
		return clients;
	}

}
