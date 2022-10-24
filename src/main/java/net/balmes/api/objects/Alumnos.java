package net.balmes.api.objects;

import java.time.LocalDate;

public class Alumnos {
	private String name;
    private String surname;
    private LocalDate since;
    private String dni;
    private String email;
    private String grupo;

    public Alumnos() {
		super();
	}

	public Alumnos(String name, String surname, LocalDate since, String dni, String email, String grupo) {
		super();
		this.name = name;
		this.surname = surname;
		this.since = since;
		this.dni = dni;
		this.email = email;
		this.grupo = grupo;
	}
	
	public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getSince() {
        return since;
    }

    public void setSince(LocalDate since) {
        this.since = since;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Alumnos: \n  Name=" + name + "\n  Apellido=" + surname + "\n  Fecha de nacimiento=" + since + "\n  DNI=" + dni + "\n  Email="
				+ email + "\n Grupo=" + grupo + "\n";
	}


    

}