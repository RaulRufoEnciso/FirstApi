package net.balmes.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data					// Añade los Getters y Setters
@AllArgsConstructor		// Añade un Constructor completo
@NoArgsConstructor		// Añade un Constructor vacio
@ToString				// Añade un ToString

@Entity
public class Ufs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String modulo;
	private int tiempo;
	private int alumnosReg;
}
