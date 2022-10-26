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
public class Horarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    private int hEntrada;
    private int hSalida;
    private String fp;
}
