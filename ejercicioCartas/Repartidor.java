package ejercicioCartas;

public class Repartidor {
	  
	private Mazo mazo;
	  
	  public Repartidor(Mazo mazo){
	    this.mazo = mazo;
	  }
	  public void mezclarBaraja(int cantidad){
	    this.mazo.mezclar(cantidad);
	  }
	  public Carta darCarta(){
	    return this.mazo.getCarta();
	  }
	  public String mostrarBaraja(){
	    return this.mazo.toString();
	  }
	  public int getNumeroCartas(){
	    return this.mazo.getNumeroCartas();
	  }
	}
