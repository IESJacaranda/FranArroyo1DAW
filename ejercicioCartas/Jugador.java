package ejercicioCartas;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	  private List<Carta> mano;
	  private String nombre;
	  public Jugador(String nombre){
	    this.nombre = nombre;
	    this.mano = new ArrayList();
	  }
	  public void anadirCarta(Carta carta){
	    this.mano.add(carta);
	  }
	  public Carta soltarCarta(int index){
	    return this.mano.remove(index);
	  }
	  @Override
	  public String toString(){
	    StringBuilder info = new StringBuilder();
	    info.append("Jugador 1: ")
	      .append(this.nombre)
	      .append("\n").append(this.mano.toString());
	    return info.toString();
	  }
	}
