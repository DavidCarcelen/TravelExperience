package org.deep.servicios;

import org.deep.models.Fotografia;
import org.deep.persistence.AlmacenFotos;
import org.deep.persistence.FotosManager;

import java.util.List;

public class GestorFotografias implements GestorFotografiasInf{

    private FotosManager repoFotos;

    //getters y setters
    public void setRepoFotos(FotosManager repoFotos) {
        this.repoFotos = repoFotos;
    }

    //Metodo para guardar fotos, añade las fotos
    public void storePhoto(Fotografia foto){
        repoFotos.addFotos(foto);
    }


    //Metodo de fotos por localizacion
    public Fotografia getPhotoByLocalizacion(String localizacion){
        if(!localizacion.equals("")){
            return repoFotos.getPhotoByLugar(localizacion);
        }else {
            return null;
        }

    }

    /**
     * DEvuelve la lista de fotografias
     * @return
     */
    public List<Fotografia> getListaFotos() {
        try {
            return repoFotos.getFotos();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
}
