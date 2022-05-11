package cl.bancochile.proyecto.model;

import cl.bancochile.proyecto.dto.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ApiModel {
    private String version;
    private String autor;
    private LocalDate fecha;
    private UfDto uf;
    private IvpDto ivp;
    private DolarDto dolar;
    @JsonProperty("dolar_intercambio")
    private DolarIntercambioDto dolarIntercambioDto;
    private EuroDto euro;
    private IpcDto ipc;
    private UtmDto utm;
    private ImacecDto imacec;
    private TpmDto tpm;
    @JsonProperty("libra_cobre")
    private LibraCobreDto libraCobreDto;
    @JsonProperty("tasa_desempleo")
    private TasaDesempleoDto tasaDesempleoDto;
    private BitcoinDto bitcoin;

}
