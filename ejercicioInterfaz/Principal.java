package ejercicioInterfaz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iedificio casa=new Edificio(30, 10, 3, 2);
		System.out.println(casa.getSuperficieEdificio());
		System.out.println(casa.getPredioEdificio());
		Tienda mediamarkt=new Tienda(2, 5, "barbacoas");
		LocalComercial mem=new Tienda(2, 5, "barbacoas");
		Tienda memmm=new Tienda(2, 5, "barbacoas");
	}

}
