package org.deep.persistence;

import org.deep.models.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlmacenUsuariosTest {

    AlmacenUsuarios repo = new AlmacenUsuarios();
    @Test
    public void addUsuarios() {
        Usuario usu1 = new Usuario("nombre23","nom23@email.com",  "descripcion3", 35, "111");
        repo.addUsuarios(usu1);
        System.out.println(repo.getAll());
    }

    @Test
    public void get() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void numeroUsuarios() {
    }

    @Test
    public void almacenUsuarios() {
    }

    @Test
    public void getUserporId() {
    }
}