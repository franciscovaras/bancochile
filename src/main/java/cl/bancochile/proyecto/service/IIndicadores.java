package cl.bancochile.proyecto.service;

import cl.bancochile.proyecto.model.ApiModel;
import cl.bancochile.proyecto.model.IndicadorModel;

public interface IIndicadores {
    ApiModel getAllIndicators();
    IndicadorModel getOnlyAIndicators(String indicador);
}
