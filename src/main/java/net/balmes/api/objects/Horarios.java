package net.balmes.api.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // Añade los Getters y Setters
@AllArgsConstructor // Añade un Constructor completo
@NoArgsConstructor // Añade un Constructor vacio
@ToString // Añade un ToString

public class Horarios {
    private int hEntrada;
    private int hSalida;
    private String fp;
}
