package ejercicioCartas;

import java.util.ArrayList;
import java.util.List;

public class Main {
	  private List<Jugador> jugadores;
	  private Repartidor repartidor;
	  public Main(){
	    this.repartidor = new Repartidor(new Mazo());
	    this.repartidor.mezclarBaraja((byte)15);
	    this.jugadores = new ArrayList();
	  }
	  public void addJugador(Jugador jugador){
	    this.jugadores.add(jugador);
	  }
	  public void repartirCartas(byte numeroCartas){
	    for(Jugador j : this.jugadores){
	      for(byte i = 0; i < numeroCartas; i++){
	        j.anadirCarta(this.repartidor.darCarta());
	      } 
	    }
	  }
	  public String mostrarBaraja(){
	    return this.repartidor.mostrarBaraja();
	  }
	  public int getNumeroCartasDealer(){
	    return this.repartidor.getNumeroCartas();
	  }
	  public List<Jugador> getJugadores(){
	    return this.jugadores;
	  }
	  public static void main(String[] args){
	    Main juego = new Main();
	    System.out.println("Baraja Inicial de :" + juego.getNumeroCartasDealer() + " cartas." );
	    System.out.println(juego.mostrarBaraja());
	    juego.addJugador(new Jugador("Jugador-1"));
	    juego.addJugador(new Jugador("Jugador-2"));
	    juego.repartirCartas((byte)5);
	    System.out.println("\n----- Cartas por Jugador ------\n");
	    for(Jugador j : juego.getJugadores()){
	      System.out.println(j.toString());
	    }
	    System.out.println("\n");
	    System.out.println("Baraja Final de:" + juego.getNumeroCartasDealer() + " cartas." );
	    System.out.println(juego.mostrarBaraja());
	  }
}
