package org.deep.persistence;

import org.deep.config.Configuracion;
import org.deep.models.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(Configuracion.class)
class UsuariosManagerTest {
    @Autowired
    private UsuariosManager usuariosManager;

    @Test
    void getUsuarios() {

        List<Usuario> allUsers = null;
        try {
            allUsers = usuariosManager.getAll();
            System.out.println(allUsers);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}