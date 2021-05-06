package relacion11.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	
	protected List<PaginaWeb> historial;

	public Historial() {
		this.historial = new ArrayList<PaginaWeb>();
	}
	
	public void addPagina(PaginaWeb pag) throws Exception {
		if(historial.size() > 0 && historial.get(historial.size()-1).getFechaHora().isAfter(pag.getFechaHora())) {
			throw new Exception("No se puede introducir la página web.");
		}else {
			historial.add(pag);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("El historial de páginas web es:\n");
		for(PaginaWeb i: historial) {
			sb.append(i + "\n");
		}
		return sb.toString();
	}
	
	public String consultaHistorialDia(LocalDate dia) {
		StringBuilder sb = new StringBuilder("El historial de páginas web del día " + dia.toString() + " es: \n");
		int cont = 0;
		for(PaginaWeb i: historial) {
			if(i.getFechaHora().getDayOfMonth() == dia.getDayOfMonth() && 
				i.getFechaHora().getMonth() == dia.getMonth() && 
				i.getFechaHora().getYear() == dia.getYear()) {
				sb.append(i + "\n");
				cont++;
			}
		}
		if(cont == 0) {
			sb.append("No se han encontrado páginas consultadas en esa fecha");
		}
		return sb.toString();
	}
	
	public void borraHistorial() {
		historial.removeAll(historial);
	}
	
}
