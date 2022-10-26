package net.balmes.api.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // Añade los Getters y Setters
@AllArgsConstructor // Añade un Constructor completo
@NoArgsConstructor // Añade un Constructor vacio
@ToString // Añade un ToString

public class FP {
    final String asix = "ASIX";
    final String daw = "DAW";
    final String dam = "DAM";
    final String smix = "SMIX";
    private String name;
    private String surname;
    private String email;
    
}
