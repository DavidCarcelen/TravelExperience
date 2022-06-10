package org.deep.servicios;

import org.deep.models.Recomendacion;
import org.deep.models.Usuario;
import org.deep.persistence.AlmacenRecomendaciones;
import org.deep.persistence.AlmacenUsuarios;

public class GestorRecomendaciones {

    private AlmacenRecomendaciones listaReco;

    public Recomendacion (String cuerpo) {
        if(cuerpo != null ){
            return listaReco.addRecomendacion(cuerpo);
        }else{
            return null;
        }
}


