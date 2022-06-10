package org.deep.persistence;

import org.deep.models.Recomendacion;

import java.util.ArrayList;
import java.util.List;

public class AlmacenRecomendaciones {

    private List<Recomendacion> listaRecomendaciones = new ArrayList<>();

    public AlmacenRecomendaciones() {
        listaRecomendaciones.add(new Recomendacion("Bob", "me encanta"));
        listaRecomendaciones.add(new Recomendacion("Mike", "horrible"));

        public void addRecomendacion(Recomendacion reco){
            listaRecomendaciones.add(reco);
        }

    }
}
