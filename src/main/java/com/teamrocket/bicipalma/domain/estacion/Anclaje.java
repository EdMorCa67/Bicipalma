package com.teamrocket.bicipalma.domain.estacion;
import com.teamrocket.bicipalma.domain.bicicleta.Movil;

class Anclaje {

    private boolean ocupado = false;
    private Movil bici = null;

    Anclaje () {};

    boolean ocupado() {
        return this.ocupado;
    }

    Movil getbici() {
        return this.bici;
    }


}