package ejercicioCartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {
	  private List<Carta> mazo;
	  public Mazo(){
	    this.construirMazo();
	  }
	  private void construirMazo(){
	    this.mazo = new ArrayList();
	    for(Figuras f : Figuras.values()){
	      for(Numeros n : Numeros.values()){
	        this.mazo.add(new Carta(f, n));
	      }
	    }
	  }
	  public void mezclar(int cantidad){
	    int nVeces = cantidad * this.mazo.size();
	    Random random = new Random();
	    int index = 0;
	    Carta carta;
	    for(int i = 0; i < nVeces; i++){
	      index = random.nextInt(this.mazo.size());
	      carta = this.mazo.remove(index);
	      index = random.nextInt(this.mazo.size());
	      this.mazo.add(index, carta);
	    }
	  }
	  public Carta getCarta(){
	    return this.mazo.remove(0);
	  }
	  public boolean estaVacia(){
	    return this.mazo.isEmpty();
	  }
	  public int getNumeroCartas(){
		  return this.mazo.size();
	  }
	  @Override
	  public String toString(){
	    return this.mazo.toString();
	  }
}