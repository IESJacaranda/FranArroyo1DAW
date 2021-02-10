package complejos;

public class main {

	public static void main(String[] args) {
		Complejo n1 = new Complejo(9,5);
		Complejo n2 = new Complejo(7,8);
		System.out.print(n1+"-"+n2+"=");
		n1.suma(n2);
		System.out.println(n1);
		
		System.out.print(n1+"+"+n2+"=");
		n1.resta(n2);
		System.out.println(n1);
	}
}