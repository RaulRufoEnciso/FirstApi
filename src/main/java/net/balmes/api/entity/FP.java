package net.balmes.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data 					// Añade los Getters y Setters
@AllArgsConstructor 	// Añade un Constructor completo
@NoArgsConstructor 		// Añade un Constructor vacio
@ToString 				// Añade un ToString

@Entity
public class FP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    final static String asix = "ASIX";
    final static String daw = "DAW";
    final static String dam = "DAM";
    final static String smix = "SMIX";
    private String name;
    private String surname;
    private String email;
    
}
