package lol;

public class Ogro extends Jugador {

	public Ogro(char simbolo, int fuerza, int magia, int velocidad, int col, int dinero, int pociones, int gemas) {
		super(simbolo, fuerza, magia, velocidad, col, dinero, pociones, gemas);
		this.setVelocidad(4);
		this.setMagia(4);
		this.setFuerza(7);
	}



}
