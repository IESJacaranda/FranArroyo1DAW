package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
public class Hotel {
	private String hotel;
	public final double MULTIPLICADORBASE=10.75;
	public Hotel(String hotel) {
		super();
		this.hotel = hotel;
	}

	//creo un array de tipo object ya que sera una lista que tendra distintos tipos de objetos
	
	
	//TO DO
		//Hacer coleccion con todos los objetos
		Object lista[];
	    ArrayList<Instalacion> instalaciones = new ArrayList();
	public void inicializarHotel(Object lista[]) {
		Habitacion hb1=new HabitacionSimple(1,TIPOHABITACION.SIMPLES);
		instalaciones.add(hb1);
		Habitacion hb2=new HabitacionSimple(1,TIPOHABITACION.SIMPLES);
		instalaciones.add(hb2);
	
		Habitacion hb3=new HabitacionSimple(1,TIPOHABITACION.SIMPLES);
		instalaciones.add(hb3);
		Habitacion hb4=new HabitacionSimple(1,TIPOHABITACION.SIMPLES);
		instalaciones.add(hb4);
		Habitacion hb5=new HabitacionSimple(1,TIPOHABITACION.SIMPLES);
		instalaciones.add(hb5);
		Habitacion hd1=new HabitacionDoble(2,TIPOHABITACION.DOBLES);
		instalaciones.add(hd1);
		Habitacion hd2=new HabitacionDoble(2,TIPOHABITACION.DOBLES);
		instalaciones.add(hd2);
		Habitacion hd3=new HabitacionDoble(2,TIPOHABITACION.DOBLES);
		instalaciones.add(hb3);
		Habitacion hs1=new HabitacionSuites(2,TIPOHABITACION.SUITES);
		instalaciones.add(hs1);
		Sala reu1=new SalaReunion(20,TIPOSALAS.REUNION);
		instalaciones.add(reu1);
		Sala reu2=new SalaReunion(20,TIPOSALAS.REUNION);
		instalaciones.add(reu2);
		Sala cel1=new SalaCelebracion(80,TIPOSALAS.CELEBRACION);
		instalaciones.add(cel1);
		Sala cel2=new SalaCelebracion(80,TIPOSALAS.CELEBRACION);
		instalaciones.add(cel2);
		}
	//Con este metodo listo las instalaciones
	public String listarInstalasciones() {
		String mensaje="";
		for (int i = 0; i < instalaciones.size(); i++) {
			mensaje+=instalaciones.get(i).toString();
		}
		return mensaje;
	}
	//Con este metodo calculamos el precio de las habitaciones 
	public Double calcularPrecioHab(Habitacion hab,int numpersonas) throws Exception {
		double precio=0;
		if (hab.getTipohabitacion()==TIPOHABITACION.SIMPLES ||hab.getTipohabitacion()==TIPOHABITACION.DOBLES ) {
			precio=MULTIPLICADORBASE*numpersonas*1.15;
		}
		else if (hab.getTipohabitacion()==TIPOHABITACION.SUITES) {
			precio=MULTIPLICADORBASE*numpersonas*1.9;
		}else if (hab.getTipohabitacion()==TIPOHABITACION.SIMPLES) {
			precio=MULTIPLICADORBASE*numpersonas*1;
		}else{
			throw new Exception("Pum");
		}
		return precio;
	}
	//Con este metodo calculamos el precio de las salas
	public Double calcularPrecioSal(Sala sal,int numpersonas) {
		double precio=0;
		if (sal.getTiposala()==TIPOSALAS.REUNION) {
			precio=MULTIPLICADORBASE*numpersonas*1;
		}
		if (sal.getTiposala()==TIPOSALAS.CELEBRACION) {
			precio=MULTIPLICADORBASE*numpersonas*2.15;
		}
		return precio;
	}

	public void addReserva(Reserva reservarInstalacion) {
		// TODO Auto-generated method stub
		
	}

	public void calcularIngresosGenerados() {
		// TODO Auto-generated method stub
		
	}

	public void listarInstalacionesEnFecha(LocalDate obtenerFecha) {
		// TODO Auto-generated method stub
		
	}

	public void listarReservaInstalaciones() {
		// TODO Auto-generated method stub
		
	}


	
	}

		
	

