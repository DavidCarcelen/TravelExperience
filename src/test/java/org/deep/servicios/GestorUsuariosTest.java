package org.deep.servicios;

import org.deep.models.Usuario;
import org.deep.persistence.AlmacenUsuarios;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorUsuariosTest {

    GestorUsuarios gestor1 = new GestorUsuarios();
    AlmacenUsuarios repo = new AlmacenUsuarios();

    @Before
    public void before(){
        gestor1.setAlmacenUsuarios(repo);
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void storeUser() {
        Usuario usu1 = new Usuario(0L,"nombre23", "nom23@email.com", "descripcion3", 35);
        gestor1.storeUser(usu1);
        System.out.println(repo.getAll());
    }

    @Test
    public void getUserByName() {
    }
}