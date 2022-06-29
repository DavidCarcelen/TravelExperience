package org.deep.api;

import org.deep.models.Fotografia;
import org.deep.models.Message;
import org.deep.servicios.GestorFotografias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/fotos")
public class FotoController {

    @Autowired
    GestorFotografias fotoServ;

    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Fotografia> getAllFotos() {
        return fotoServ.getListaFotos();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Message> postNewPhoto(@Valid @RequestBody Fotografia foto) {
        System.out.println(foto);
        fotoServ.storePhoto(foto);
        return new ResponseEntity<>(new Message("OK"), HttpStatus.CREATED);
    }


}
