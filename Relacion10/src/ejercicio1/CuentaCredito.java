package ejercicio1;

public class CuentaCredito  extends Cuenta{
	private Cuenta cuenta;
	private Double saldoCredito=new Double(100);
		
	public CuentaCredito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CuentaCredito( Cuenta cuenta,Double saldoCredito) {
		super();
		this.cuenta=cuenta;
		this.saldoCredito=saldoCredito;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldoCredito() {
		return saldoCredito;
	}
	public void setSaldoCredito(double saldoCredito) throws Exception {
		if (saldoCredito>300 || saldoCredito<0) {
			throw new Exception("El saldo del credito es invalido");
		}
		else {
				this.saldoCredito=saldoCredito;
			}
	}
//	public void numerosRojos() throws Exception {
//		double numerosrojos=-100;
//		if (cuenta.getSaldo()-saldoCredito<numerosrojos) {
//			throw new Exception("asd");
//		}
//	}
	public Double CalcularNumerosRojos() {
		double numerosrojos=-(this.getSaldoCredito());
		return numerosrojos;
	}
	@Override
	public void sacarDinero(double dineroaretirar) throws Exception {
		if (dineroaretirar<)
	}
}
