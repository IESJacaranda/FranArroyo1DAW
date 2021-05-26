package es.iesjacaranda.corona;

public class Informacion {
	private int Agno;
	private String Periodo;
	private long Valor;
	
	
	public Informacion(int agno, String periodo, long valor) {
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

	

	@Override
	public String toString() {
		return "Informacion [Agno=" + Agno + ", Periodo=" + Periodo + ", Valor=" + Valor + "]";
	}


	public long getValor() {
		return Valor;
	}
	
	
	
	
	

}
