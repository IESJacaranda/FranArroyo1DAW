package ejercicioDias;

public enum Dia {
	//Creo enumerado de los dias de la semana
	LUNES(1),MARTES(2), MIERCOLES(3),JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
		
	private int diaSemana;
	
	Dia(int dia){
		this.diaSemana=dia;
	}
	public int getDiaSemana() {
		return diaSemana;
	}
	
}
