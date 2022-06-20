package org.deep.persistence;

import org.deep.models.Recomendacion;
import org.deep.models.Usuario;


import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class AlmacenRecomendaciones {

    private List<Recomendacion> listaRecomendaciones= new ArrayList<>();

    private AlmacenRecomendaciones() {
        listaRecomendaciones.add(new Recomendacion("Barcelona", "muy bueno", 5));
        listaRecomendaciones.add(new Recomendacion("Cuenca", "está lejos",  4));
    }
    public void addRecomendacion(Recomendacion recom) {

        listaRecomendaciones.add(recom);
    }


    public Recomendacion getRecomLugar(String lugar) {
        for (Recomendacion recomendacion : listaRecomendaciones) {
            if (recomendacion.getLugar() == lugar) {
                return recomendacion;
            }
        }
        return null;
    }

}
