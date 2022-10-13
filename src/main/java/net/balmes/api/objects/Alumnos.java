package net.balmes.api.objects;

import java.time.LocalDate;

public class Alumnos {

	private String name;
    private String surname;
    private LocalDate since;
    private String dni;

    public Alumnos(String name, String surname, LocalDate since, String dni) {
        this.name = name;
        this.surname = surname;
        this.since = since;
        this.dni = dni;
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

    @Override
    public String toString() {
        return "Alumnos [name=" + name + ", surname=" + surname + ", since=" + since + ", dni=" + dni + "]";
    }

}
