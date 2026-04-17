package com.teamrocket.bicipalma.domain.estacion;

import java.util.concurrent.ThreadLocalRandom;

import com.teamrocket.bicipalma.domain.bicicleta.Movil;

class Anclajes {

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return anclajes;
    }

    int numAnclajes() {
        return anclajes.length;
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        anclajes[posicion].AnclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion) {
        return anclajes[posicion].ocupado();
    }

    void liberarAnclaje(int posicion) {
        anclajes[posicion].LiberarBici();
    }

    Movil getBiciAt(int posicion) {
        return anclajes[posicion].getbici();
    }

    int seleccionarAnclaje() {
        return ThreadLocalRandom.current().nextInt(0, numAnclajes());
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + numAnclajes();
    }
}