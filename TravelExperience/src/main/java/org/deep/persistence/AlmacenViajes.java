package org.deep.persistence;

import org.deep.models.Viaje;

import java.util.ArrayList;
import java.util.List;

public class AlmacenViajes {

    List<Viaje> viajes=new ArrayList<>();

    public AlmacenViajes(){
        viajes.add(new Viaje("Barcelona", "mucho calor", 5));
        viajes.add(new Viaje("La Habana", "mas calor", 4));
        viajes.add(new Viaje("Siberia", "mucho frio", 3));
    }
    public List<Viaje> getAll() {
        return viajes;
    }

    public void addViaje(Viaje viaje) {
       // if (viaje.isValid())
            viajes.add(viaje);

    }
}
