package org.deep.servicios;

import org.deep.models.Recomendacion;
import org.deep.persistence.AlmacenRecomendaciones;

public class GestorRecomencaciones {

    private AlmacenRecomendaciones listaRecomendaciones;

    public Recomendacion getRecomLugar(String lugar){
        if(lugar !=null){
            return listaRecomendaciones.getRecomLugar(lugar);
        }else{
            return null;
        }
    }
    public void storeRecomendacion(Recomendacion recom){
        listaRecomendaciones.addRecomendacion(recom);
    }

}
