package cl.bancochile.proyecto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Atributos {

    private String codigo;
    private String nombre;
    @JsonProperty("unidad_medida")
    private String unidadDeMedida;
    private LocalDate fecha;
    private Double valor;
}
