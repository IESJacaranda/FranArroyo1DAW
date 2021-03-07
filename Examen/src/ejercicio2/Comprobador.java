package ejercicio2;

public class Comprobador {
	private String cadenanormal;
	private String cadenaabuscar;
	
	public String getCadenanormal() {
		return cadenanormal;
	}
	public void setCadenanormal(String cadenanormal) {
		this.cadenanormal = cadenanormal;
	}
	public String getCadenaabuscar() {
		return cadenaabuscar;
	}
	public void setCadenaabuscar(String cadenaabuscar) {
		this.cadenaabuscar = cadenaabuscar;
	}
	public boolean EstaLaPalabra(String cadenaabuscar, String cadenanormal) {
		boolean esta=false;
		char c,p;
		int contadorCadenabuscar=0;
		int contCadenanormal=0;
		while (cadenaabuscar.length() < cadenanormal.length() && contCadenanormal < cadenanormal.length()) {
			p = cadenaabuscar.charAt(contadorCadenabuscar);
			c = cadenanormal.charAt(contCadenanormal);
			if (p == c) {
				contadorCadenabuscar++;
				contCadenanormal++;
			} else {
				contCadenanormal++;
			}
			if (contCadenanormal == cadenanormal.length()) {
				esta=true;
			} else {
				esta=false;
			}
		}
		return esta;
	}
}