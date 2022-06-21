package org.deep.persistence;

import org.deep.models.Fotografia;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AlmacenFotosTest {

    AlmacenFotos repo = new AlmacenFotos();

    @Test
    public void addFotos() {
        Fotografia foto1 = new Fotografia("Foto3", "2020-07-02", "Suiza","https://www.foto3");
        repo.addFotos(foto1);
        System.out.println(repo.getAllPhotos());
    }

    @Test
    public void numeroFotos() {
    }

    @Test
    public void getAllPhotos() {
    }
}