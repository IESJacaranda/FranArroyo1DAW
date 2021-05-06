package relacion11.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Buzon {
	
	protected List<Mensaje> buzon;
	
	public Buzon() {
		this.buzon = new ArrayList<Mensaje>();
	}
	
	public void addMensaje(Mensaje mens) {
		buzon.add(mens);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(buzon.size() != 0) {
			sb = new StringBuilder("Los mensajes del buzón son: ");
			for(Mensaje i: buzon) {
				sb.append(i+"\n");			}
		}else {
			sb.append("No tiene mensajes");
		}
		return sb.toString();
	}
	
	public String muestraOrdenadosPorNombre() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(buzon);
		for(Mensaje i: buzon) {
			sb.append(i+"\n");
		}
		return sb.toString();
	}
	
	public void borraMensaje(int cod) throws Exception {
		int cont = 0;
		for(Mensaje i: buzon) {
			if(i.getCodigo() == cod) {
				buzon.remove(i);
				cont++;
			}
		}
		if(cont == 0) {
			throw new Exception("No se ha encontrado nungún mensaje con ese código");
		}
	}
	
	public String encuentraMensajePorFrase(String frase) throws Exception {
		int cont = 0;
		StringBuilder sb = new StringBuilder();
		for(Mensaje i: buzon) {
			if(i.getText().contains(frase)){
				sb.append(i+"\n");
				cont++;
			}
		}
		if(cont == 0) {
			throw new Exception("No se encuentra ningún mensaje con esa frase");
		}
		return sb.toString();
	}
}
