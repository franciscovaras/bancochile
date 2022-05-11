package cl.bancochile.proyecto.controller;

import cl.bancochile.proyecto.model.ApiModel;
import cl.bancochile.proyecto.model.IndicadorModel;
import cl.bancochile.proyecto.service.IIndicadores;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndicadoresController {

    @Autowired
    IIndicadores indicadores;

    @GetMapping()
    ResponseEntity<Object> getAllIndicators(){
        try {
            ApiModel response = indicadores.getAllIndicators();
            return ResponseEntity.ok().body(response);
        } catch (FeignException e) {
            if (e.contentUTF8() != null && !e.contentUTF8().isEmpty()) System.out.println(e.contentUTF8());
            return ResponseEntity.status(e.status()).build();
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{indicador}")
    ResponseEntity<Object> getOnlyAIndicators(@PathVariable String indicador){
        try {
            IndicadorModel response = indicadores.getOnlyAIndicators(indicador);
            return ResponseEntity.ok().body(response);
        } catch (FeignException e) {
            if (e.contentUTF8() != null && !e.contentUTF8().isEmpty()) System.out.println(e.contentUTF8());
            return ResponseEntity.status(e.status()).build();
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
