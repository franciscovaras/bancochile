package cl.bancochile.proyecto.model;

import cl.bancochile.proyecto.dto.Serie;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class IndicadorModel {
    private String version;
    private String autor;
    private String codigo;
    private String nombre;
    @JsonProperty("unidad_medida")
    private String unidadDeMedida;
    private List<Serie> serie;

}
