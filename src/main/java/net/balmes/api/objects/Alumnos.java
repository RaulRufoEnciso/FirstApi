package net.balmes.api.objects;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data					// Añade los Getters y Setters
@AllArgsConstructor		// Añade un Constructor completo
@NoArgsConstructor		// Añade un Constructor vacio
@ToString				// Añade un ToString



public class Alumnos {
	private String name;
    private String surname;
    private LocalDate since;
    private String dni;
    private String email;
	
    
}