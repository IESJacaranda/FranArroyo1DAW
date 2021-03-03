package ejercicio3;

public class Jarra {

	private final int capacidad;
	private int cantidad;
 
	public Jarra(int capacidadInicial) throws Exception {
		if (capacidadInicial<=0) throw new Exception("Capacidad no puede ser menor o igual a cero");
		capacidad = capacidadInicial;
		cantidad = 0;
		}
 
	public int capacidad() {
		return capacidad;	
		}
 
	public int cantidad() {
		return cantidad;	
		}
 
	public void llena() {
		this.cantidad = capacidad;
		}
 
	public void vacia() {
		this.cantidad = 0;
		}
 
	public void llenaDesde(Jarra j){
		int cantidadMinima = Math.min(capacidad-cantidad, j.cantidad);
		cantidad+=cantidadMinima;
		j.cantidad-=cantidadMinima;
		}


 public String toString(){
  String frase = " capacidad de " +capacidad+ " y cantidad de " +cantidad+ " de cerveza.";
  return frase;
 }
}