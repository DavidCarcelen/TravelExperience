package org.deep.config;

import org.deep.persistence.*;
import org.deep.servicios.GestorFotografias;
import org.deep.servicios.GestorUsuarios;
import org.deep.servicios.GestorViajes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.inject.Inject;

@Configuration
public class Configuracion {

    @Bean
    public AlmacenUsuarios createAlamcenBean(){
        return new AlmacenUsuarios();
    }

    @Inject
    @Lazy
    AlmacenUsuarios almacen;

    @Bean
    public UsuariosManager createUsuariosManager(){
        return new UsuariosManager();
    }

    @Inject
    @Lazy
    UsuariosManager usuariosManager;

    @Bean
    public GestorUsuarios createGestorBean() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.setRepo(usuariosManager);
        return gestor;
    }

    @Bean
    public AlmacenFotos createAlamcenFotosBean(){
        return new AlmacenFotos();
    }

    @Inject
    @Lazy
    AlmacenFotos almacenFotos;


    @Bean
    public GestorFotografias createGestorFotosBean(){
        GestorFotografias gestorFotografias = new GestorFotografias();
        gestorFotografias.setListaFotos(almacenFotos);
        return gestorFotografias;
    }

    @Bean
    public AlmacenViajes createAlamcenViajesBean(){
        return new AlmacenViajes();
    }

    @Inject
    @Lazy
    AlmacenViajes almacenViajes;


    @Bean
    public GestorViajes createGestorViajesBean() {
        GestorViajes gestorViajes = new GestorViajes();
        gestorViajes.setRepo(almacenViajes);
        return gestorViajes;
    }


}
