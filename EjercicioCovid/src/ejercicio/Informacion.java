package ejercicio;

public class Informacion {
	int Agno;
	String Periodo;
	int Valor;
	public Informacion(int agno, String periodo, int valor) {
		super();
		Agno = agno;
		Periodo = periodo;
		Valor = valor;
	}
	public int getAgno() {
		return Agno;
	}
	public String getPeriodo() {
		return Periodo;
	}
	public int getValor() {
		return Valor;
	}
}
