package ejemplo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona=new Bebe();
		persona.desplazarse();
		persona.obtenerHabitos();
		persona=new Adulto();
		persona.desplazarse();
		persona.obtenerHabitos();
		((Adulto)persona).Conducir();
		//
		Bebe bebe1=new Bebe();
		bebe1.desplazarse();
		bebe1.obtenerHabitos();
		//
		Persona persona1=new Persona();
		persona1.desplazarse();
		
		persona1.obtenerHabitos();
		//
		Adulto adulto1=new Adulto();
		adulto1.desplazarse();
		adulto1.obtenerHabitos();
		adulto1.Conducir();
		//
		Anciano anciano1=new Anciano();
		anciano1.Conducir();
		anciano1.obtenerHabitos();
		anciano1.desplazarse();
	}

}
