package control;

public class Producto {
//EJERCICIO 1 Crear una clase que represente Producto con las siguientes características: 
//Tienen un código que los identifica de manera única y que se asigna automáticamente en 
//el momento de la creación. 
//Guardan la descripción y el precio sin IVA.
//Todos los productos comparten el mismo IVA (supongamos el 20%),
//que puede variar en función de las decisiones del gobierno.    (Hecho)
//La clase Producto debe proporcionar los métodos adecuados: 
//Constructor. (Hecho)
//Métodos para consulta y modificación de los atributos.  
//Método para calcular el precio de venta del producto que se obtiene 
//sumándole al precio el IVA correspondiente. 
//Realizar un programa principal que 
//pruebe la clase anterior
	private int codigo;
	private String descripcion;
	private final int IVA=20;
	private double precio;
	//Constructor
	public Producto(int codigo, String descripcion,double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio=precio;
	}
	//Getter y Setters

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIVA() {
		return IVA;
	}
	public double getPrecio() {
		double descuento;
		descuento=precio*IVA/100;
		precio=precio-descuento;
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//Precio
	public double Precio(String codigo) {
		this.precio=precio*IVA;
		return precio;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
}
