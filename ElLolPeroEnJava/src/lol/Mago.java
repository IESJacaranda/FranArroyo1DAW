package lol;

public class Mago extends Jugador {

	public Mago(char simbolo, int fuerza, int magia, int velocidad, int col, int dinero, int pociones, int gemas) {
		super(simbolo, fuerza, magia, velocidad, col, dinero, pociones, gemas);
		this.setVelocidad(6);
		this.setMagia(7);
		this.setFuerza(4);
	}



}
