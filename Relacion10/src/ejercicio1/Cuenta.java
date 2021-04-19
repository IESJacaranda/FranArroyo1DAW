package ejercicio1;

public class Cuenta extends Titular{
		private Titular titular;
		private int numcuenta;
		protected double saldo;
		public Cuenta() {
			super();
		}

		public Cuenta(int numcuenta,double saldo, Titular titular) {
			super();
			this.numcuenta=numcuenta;
			this.saldo=saldo;
			this.titular=titular;
		}
		public Titular getTitular() {
			return titular;
		}
		public void setTitular(Titular titular) {
			this.titular = titular;
		}
		public int getNumcuenta() {
			return numcuenta;
		}
		public void setNumcuenta(int numcuenta) {
			this.numcuenta = numcuenta;
		}
		public double getSaldo() {
			
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = 0;
		}
		@Override
		public String toString() {
			return super.toString()+"Y su numeor de cuenta es:"+numcuenta+" y su saldo es de:"+saldo;
		}
		public void sacarDinero(double dineroaretirar) throws Exception {
			if (dineroaretirar<saldo) {
				throw new Exception("El dinero a retirar es imposible.");
			}else  {
				this.saldo=saldo-dineroaretirar;
				
			}
		}
		
		public void ingresarDinero(double dineroaretirar) throws Exception {
			if (dineroaretirar<saldo) {
				throw new Exception("El dinero a retirar es imposible.");
			}else  {
				this.saldo=saldo-dineroaretirar;
				
			}
		}
		
}
