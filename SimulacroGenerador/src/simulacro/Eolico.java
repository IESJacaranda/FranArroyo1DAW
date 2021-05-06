package simulacro;

public class Eolico extends AbstractGenerador {
	
	protected int numAspas;

	public Eolico(String localidad, double potencia, int numAspas) {
		super(localidad, potencia);
		this.codigo = "Gen-"+CONTADOR_GENERADORES;
		this.numAspas = numAspas;
		CONTADOR_GENERADORES++;
		
	}

	public int getNumAspas() {
		return numAspas;
	}

	public void setNumAspas(int numAspas) {
		this.numAspas = numAspas;
	}

	@Override
	public String toString() {
		
		return super.toString() +
				"\nGENERADOR EÓLICO:"
				+ "\nNúmero de aspas: "+ getNumAspas() + ".";
	}

	@Override
	public double dinero(double precio) {
		
		return precio*getPotencia()*getNumAspas();
	}

	@Override
	public int compareTo(AbstractGenerador g) {
		int compareResult = 0;
		
		if(this.fecha.isAfter(g.getFecha())) {
			compareResult = 1;
		}else if(this.fecha.isBefore(g.getFecha())) {
			compareResult = -1;
		}
		
		return compareResult;
	}
	
	

}
