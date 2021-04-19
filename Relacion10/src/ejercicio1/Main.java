package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prueba");
		Titular t1=new Titular("JOCE", 23, "32312313Q");
		
		Cuenta c1=new Cuenta(12321313, -99.00, t1);
		
		CuentaCredito cc1=new CuentaCredito(c1,55.00);
		try {
			cc1.setSaldoCredito(120);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cc1.CalcularNumerosRojos());
	}

}
