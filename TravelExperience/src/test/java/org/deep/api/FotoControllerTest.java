package org.deep.api;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;
import org.deep.servicios.GestorFotografias;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc //Simula peticiones Web
class FotoControllerTest {

    @Autowired
    private FotoController fotoController;

    @Autowired
    private GestorFotografias fotosServices;

    @Autowired
    private AlmacenFotos repoFotos;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllFotos() throws Exception{
        List<Fotografia> lasFotos = fotoController.getAllFotos();
        System.out.println(lasFotos);
        assertTrue(lasFotos.size() > 0);
        assertThat(lasFotos).isNotNull();
        assertThat(lasFotos).isNotEmpty();

        List<Fotografia> lasFotosServices = fotosServices.getListaFotos();
        System.out.println(lasFotosServices);
        assertTrue(lasFotos.equals(lasFotosServices));
        assertThat(lasFotos).isSameAs(lasFotosServices);

        List<Fotografia> lasFotosRepo = repoFotos.getAllPhotos();
        System.out.println(lasFotosRepo);
        assertTrue(lasFotos.equals(lasFotosRepo));
    }

    @Test
    void postNewPhoto() throws Exception{
        Fotografia newFoto = new Fotografia("Foto3", "2022-06-01", "Noruega", "https://www.foto3");
        mockMvc.perform(
                        post("/fotos")
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                                .content(asJsonString(newFoto))
                )
                .andDo(print())
                .andExpect(status().is(201));
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}