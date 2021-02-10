package banco;

public class Cuenta {
	private double saldo;
	private double ingresos;
	private double reintegros;
	private int contadorRetirada;
	public Cuenta() {
		
	}
	Cuenta(double saldo) {
		this.saldo=saldo;
	}
	public void haceringreso (double valor) throws Exception {
		if (valor>0) {
			this.saldo+=valor;
			this.ingresos++;
		}else {
			throw new Exception("El valor no puede ser negativo");
		}
	}
	public void hacereintegroo (double valor) throws Exception {
		if (valor>0 && this.saldo>=valor) {
			this.saldo+=valor;
			this.reintegros++;
		}else {
			throw new Exception("El valor no puede ser negativo");
		}
	}
	public String getStatus() {
		return "El saldo "+ this.saldo + "el numero de ingresos es"+this.ingresos+"y reintegros"+this.reintegros;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getIngreso() {
		saldo=saldo+ingresos;
		return saldo;
	}
	public void setIngreso(double ingreso) {
		this.ingresos = ingreso;
	}
	public double getRetirada() {
		saldo=saldo-reintegros;
		return saldo;
	}
	public void setRetirada(double retirada) {
		this.reintegros = retirada;
	}
	public int getContadorRetirada() {
		return contadorRetirada;
	}
	public void setContadorRetirada(int contadorRetirada) {
		this.contadorRetirada = contadorRetirada;
	}
	public String retirada(double retirada) {
		if (retirada>saldo) {
			return "Operacion incorrecta";
		}else {
			saldo=saldo-retirada;
		}
		return "Operacion correcta";
	}
	public String ingreso(double ingreso) {
			saldo=saldo+ingreso;
		return "Operacion correcta";
	}
}
