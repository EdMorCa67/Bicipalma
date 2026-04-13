package com.teamrocket.bicipalma.domain.bicicleta;

public class Bicicleta implements Movil {

	private final Integer id;

	public Bicicleta(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return this.id.intValue();
	}

	@Override
	public String toString() {
		return this.id.toString();
	}
}