package net.balmes.api.objetos;

import java.time.LocalDate;

public class Alumnos {

	private String name;
    private String surname;
    private LocalDate since;

    public Alumnos(String name, String surname, LocalDate since) {
        this.name = name;
        this.surname = surname;
        this.since = since;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "Client [name=" + name + ", since=" + since + ", surname=" + surname + "]";
    }
}
