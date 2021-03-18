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
		char caracteracomprobar;
		for (int i=0;i<cadenanormal.length();i++) {
			caracteracomprobar=cadenanormal.charAt(i);
			if (caracteracomprobar==cadenaabuscar.charAt(caracteracomprobar)) {
				for (int j=0;j<cadenaabuscar.length();j++) {
					
				}
			}
			
		}
		return esta;
	}
}
