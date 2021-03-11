package lol;

public class Elemento {
	protected char simbolo;

	public Elemento(char simbolo) {
		super();
		this.simbolo =simbolo;
	}

	@Override
	public String toString() {
		return "Elemento"+ simbolo;
	}
	
}
