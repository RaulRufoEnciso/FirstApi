package net.balmes.api.objects;

import java.time.LocalDate;

public class Alumnos {

	private String nombre;
    private String surnombre;
    private LocalDate since;

    public Alumnos(String nombre, String surnombre, LocalDate since) {
        this.nombre = nombre;
        this.surnombre = surnombre;
        this.since = since;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSurnombre() {
        return surnombre;
    }

    public void setSurnombre(String surnombre) {
        this.surnombre = surnombre;
    }

    public LocalDate getSince() {
        return since;
    }

    public void setSince(LocalDate since) {
        this.since = since;
    }

    @Override
    public String toString() {
        return "Client [nombre=" + nombre + ", since=" + since + ", surnombre=" + surnombre + "]";
    }
}
