package org.deep.persistence;

import org.deep.config.Configuracion;
import org.deep.models.Fotografia;
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
class FotosManagerTest {

    @Autowired
    private FotosManager fotosManager;

    /**
     * TEst para la lista de fotos
     */
    @Test
    void getFotos() {
        List<Fotografia> listaFotos;
        try {
            listaFotos = fotosManager.getFotos();
            System.out.println(listaFotos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}