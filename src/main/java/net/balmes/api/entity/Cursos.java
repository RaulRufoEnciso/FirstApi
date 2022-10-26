package net.balmes.api.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data					// Añade los Getters y Setters
@AllArgsConstructor		// Añade un Constructor completo
@NoArgsConstructor		// Añade un Constructor vacio
@ToString				// Añade un ToString

@Entity
public class Cursos {	//Plain Old Java Object (POJO)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	final String group = "Cursos";
    private String cfgs;
    private String año;
    private int curs;
    private String aula;
    private String grupo;

}
