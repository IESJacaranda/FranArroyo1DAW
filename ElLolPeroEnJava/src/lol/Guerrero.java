package lol;

public class Guerrero extends Jugador {

	public Guerrero(char simbolo, int fuerza, int magia, int velocidad, int col, int dinero, int pociones, int gemas) {
		super(simbolo, fuerza, magia, velocidad, col, dinero, pociones, gemas);
		this.setVelocidad(5);
		this.setMagia(5);
		this.setFuerza(6);	
		
	}
}
