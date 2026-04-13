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

    void AnclarBici (Movil bici) {
        this.bici= bici;
        this.ocupado = true;
    }

    void LiberarBici () {
        this.bici = null;
        this.ocupado = false;
    }

    
}