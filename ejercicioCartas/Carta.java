package ejercicioCartas;

public class Carta {
	  private final Figuras figuras;
	  private final Numeros numeros;
	  public Carta(Figuras f, Numeros n){
		this.numeros = n;
		this.figuras = f;
	  }
	  public Figuras getFiguras() {
	    return figuras;
	  }
	  public Numeros getNumeros() {
	    return numeros;
	  }
	  @Override
	  public String toString(){
	    return this.numeros.toString() + "-" + this.figuras.toString();
	  }
	}

