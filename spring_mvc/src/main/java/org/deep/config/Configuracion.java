package org.deep.config;

import org.deep.persistence.AlmacenFotos;
import org.deep.persistence.AlmacenUsuarios;
import org.deep.persistence.AlmacenUsuariosInf;
import org.deep.servicios.GestorFotografias;
import org.deep.servicios.GestorUsuarios;
import org.deep.servicios.GestorUsuariosInf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

@Configuration
public class Configuracion {

    @Bean
    public AlmacenUsuarios createAlamcenBean(){
        return new AlmacenUsuarios();
    }

    @Inject
    AlmacenUsuarios almacen;

    @Bean
    public GestorUsuarios createGestorBean() {
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.setAlmacenUsuarios(almacen);
        return gestor;
    }

    @Bean
    public AlmacenFotos createAlamcenFotosBean(){
        return new AlmacenFotos();
    }

    @Inject
    AlmacenFotos almacenFotos;


    @Bean
    public GestorFotografias createGestorFotosBean(){
        GestorFotografias gestorFotografias = new GestorFotografias();
        gestorFotografias.setListaFotos(almacenFotos);
        return gestorFotografias;
    }


}
