package org.deep.api;

import org.deep.models.Viaje;
import org.deep.servicios.GestorViajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recomendaciones")
public class RecomController {

    @Autowired
    GestorViajes viajeSrv;

    @RequestMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)

    public List<Viaje> getAllViajes() {
        System.out.println("viajes");
        return viajeSrv.getAllViajes();

    }
}