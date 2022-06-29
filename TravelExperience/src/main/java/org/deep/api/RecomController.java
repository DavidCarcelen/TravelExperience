package org.deep.api;

import org.deep.models.Fotografia;
import org.deep.models.Message;
import org.deep.models.Viaje;
import org.deep.servicios.GestorViajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
    @RequestMapping(
            method = RequestMethod.POST,
            value = "",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Message> postNewRecom(@Valid @RequestBody Viaje viaje) {
        System.out.println(viaje);
        viajeSrv.storeViaje(viaje);
        return new ResponseEntity<>(new Message("OK"), HttpStatus.CREATED);
    }
}
