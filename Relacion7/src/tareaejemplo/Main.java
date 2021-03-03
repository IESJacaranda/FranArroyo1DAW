package tareaejemplo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1=new Persona();
		persona1.NecesidadesBasicas();
		System.out.println(persona1);
		Futbolista messi=new Futbolista();
		messi.setPosicion("DC");
		messi.NecesidadesBasicas();
		messi.setNombre("Lionel");
		messi.setPeso(68.2);
		messi.setAltura(42);
		System.out.println(messi);
		Entrenador simeone=new Entrenador();
		simeone.Acciones();
		simeone.NecesidadesBasicas();
		
	}

}
