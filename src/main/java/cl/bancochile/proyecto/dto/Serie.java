package cl.bancochile.proyecto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Serie {
    private LocalDate fecha;
    private Double valor;
}
