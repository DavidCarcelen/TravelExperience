package org.deep.servicios;

import org.deep.config.Configuracion;
import org.deep.models.Fotografia;
import org.deep.models.Viaje;
import org.deep.persistence.ViajesManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(Configuracion.class)
class GestorViajesTest {

    @Autowired
    private ViajesManager viajesManager;

    @Test
    void getAllViajes() {
        List<Viaje> viajes;
        try {
            viajes = viajesManager.getAll();
            System.out.println(viajes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}