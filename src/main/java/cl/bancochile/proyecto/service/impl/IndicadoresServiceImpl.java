package cl.bancochile.proyecto.service.impl;

import cl.bancochile.proyecto.model.ApiModel;
import cl.bancochile.proyecto.model.IndicadorModel;
import cl.bancochile.proyecto.rest.client.IIndicadoresClient;
import cl.bancochile.proyecto.service.IIndicadores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndicadoresServiceImpl implements IIndicadores {

    @Autowired
    IIndicadoresClient iIndicadoresClient;

    @Override
    public ApiModel getAllIndicators() {
        return iIndicadoresClient.indicadores();
    }

    @Override
    public IndicadorModel getOnlyAIndicators(String indicador) {
        return iIndicadoresClient.getIndicador(indicador);
    }
}
