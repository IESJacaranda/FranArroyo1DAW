package productocorreccion;

public class Main {
	
	public static void main(String[] args) {
	
		Producto tv=new Producto("Television Samsung -3x",500.0);
		Producto radio=new Producto("Radio",20.0);
		Producto pc=new Producto("Ordenador",2000.0);
		Producto tv2=new Producto("Television Samsung -3x",500.0);

		System.out.println(tv);
		System.out.println(radio);
		System.out.println(pc);
		System.out.println(Producto.IVA);
		System.out.println(tv.hashCode());
		System.out.println(tv2.hashCode() );
		System.out.println(radio.equals(radio));
	}
}

