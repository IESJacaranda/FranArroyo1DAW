package complejos;

public class Complejo {
//Atributos
	private double real;
	private double imaginaria;
	private double i;
//Constructor
	public Complejo(double real, double imaginaria) {
		this.real=real;
		this.imaginaria=imaginaria;	
	}
//Metodos Getters y Setters
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImaginaria() {
		return imaginaria;
	}
	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	public double getI() {
		return i;
	}
	public void setI(double i) {
		this.i = i;
	}
	

//Para sumar
public void suma(Complejo i){
	this.real = this.getReal()+i.getReal();
	this.imaginaria+=i.getImaginaria();
	}
//Para restar
	public void resta(Complejo i){
		this.real-=i.getReal();
		this.imaginaria-=i.getImaginaria();
	}
//
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if(this==obj) {
			sonIguales=true;
		}
		else if(obj!=null && obj instanceof Complejo){
			if(((Complejo)obj).getImaginaria()==this.getImaginaria() && ((Complejo)obj).getReal()==this.getReal()){
				sonIguales=true;	
			}
		}
		return sonIguales;
	}
//Metodo toString
@Override
public String toString() {
	return "("+real+","+imaginaria+")";
	}
}