package org.deep.servicios;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class GestorFotografiasTest {

    GestorFotografias gestor = new GestorFotografias();
    AlmacenFotos repo = new AlmacenFotos();

    @Before
    public void before(){
        gestor.setListaFotos(repo);
    }

    @Test
    public void getListaFotos() {
    }
    @Test
    public void storePhoto(){
//        Fotografia foto1 = new Fotografia("Foto4", new Date(2021-07-02), "España","https://www.foto4");
        Fotografia foto1 = new Fotografia("Foto4", "2021-07-02", "España","https://www.foto4");
        gestor.storePhoto(foto1);
        System.out.println(repo.getAllPhotos());
        assertTrue(repo.getAllPhotos().size()>0);
        assertTrue(foto1.getLocalizacion().equals("España"));
    }

    @Test
    public void getPhotoByLocalizacion() {
    }
}