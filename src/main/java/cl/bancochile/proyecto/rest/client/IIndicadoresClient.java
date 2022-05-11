package cl.bancochile.proyecto.rest.client;

import cl.bancochile.proyecto.model.ApiModel;
import cl.bancochile.proyecto.model.IndicadorModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "IIndicadoresClient", url = "https://mindicador.cl")
public interface IIndicadoresClient {

    @GetMapping(value ="/api")
    ApiModel indicadores();

    @GetMapping(value ="/api/{indicador}")
    IndicadorModel getIndicador(@PathVariable(name = "indicador", required = true) String indicador);

}
