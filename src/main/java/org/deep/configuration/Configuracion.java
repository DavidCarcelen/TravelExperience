package org.deep.configuration;

import org.deep.servicios.GestorUsuarios;
import org.deep.servicios.GestorUsuariosInf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;

@Configuration
public class Configuracion {

    @Bean
    public GestorUsuarios createGestorBean() {
        return new GestorUsuarios();
    }

    @Inject
    GestorUsuariosInf gestorUsuarios;



}
