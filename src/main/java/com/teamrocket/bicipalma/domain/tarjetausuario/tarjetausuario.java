package com.teamrocket.bicipalma.domain.tarjetausuario;
import com.teamrocket.bicipalma.domain.tarjetausuario.Autenticacion;

public class tarjetausuario implements Autenticacion {

    private String id;
    private boolean activada = false;

    public TarjetaUsuario (String id , boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    @Override
    public boolean IsActivada() {
        return this.activada;
    }

    public void setActivada (boolean activada) {
        this.activada = activada;
    }

    
	public String toString() {
		return this.id;
	}

}