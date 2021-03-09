package lol;

public class Jugador extends Elemento {
	private int fuerza;
	private int magia;
	private int velocidad;
	private int col;
	private int dinero;
	private int pociones;
	private int gemas;
	public Jugador(char simbolo) {
		super(simbolo);
		// TODO Auto-generated constructor stub
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public int getPociones() {
		return pociones;
	}
	public void setPociones(int pociones) {
		this.pociones = pociones;
	}
	public int getGemas() {
		return gemas;
	}
	public void setGemas(int gemas) {
		this.gemas = gemas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + dinero;
		result = prime * result + fuerza;
		result = prime * result + gemas;
		result = prime * result + magia;
		result = prime * result + pociones;
		result = prime * result + velocidad;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (col != other.col)
			return false;
		if (dinero != other.dinero)
			return false;
		if (fuerza != other.fuerza)
			return false;
		if (gemas != other.gemas)
			return false;
		if (magia != other.magia)
			return false;
		if (pociones != other.pociones)
			return false;
		if (velocidad != other.velocidad)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Jugador [fuerza=" + fuerza + ", magia=" + magia + ", velocidad=" + velocidad + ", col=" + col
				+ ", dinero=" + dinero + ", pociones=" + pociones + ", gemas=" + gemas + "]";
	}
	
	
}
