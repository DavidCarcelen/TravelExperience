package org.deep.servicios;

import org.deep.models.Recomendacion;
import org.deep.models.Usuario;

public class GestorRecomendaciones {

    public Recomendacion (String cuerpo) {
        if(cuerpo != null ){
            return listaRecomendaciones.addRecomendacion(cuerpo);
        }else{
            return null;
}
