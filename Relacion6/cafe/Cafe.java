package cafe;

public class Cafe {
	public final static double PRECIO_CAFE_SOLO=1;
	public final static double PRECIO_CAFE_LECHE=1.5;
	public final static double PRECIO_LECHE=1;
	private String tipocafe;
	private String vaso;
	private int numerovasos;
	private double monedero;
	private double preciocafe;
	private int leche;
	private int capsula;
	public Cafe() {

		this.monedero=30;

	}
	public void vaciarmonedero(){
		this.monedero=0;

	}
	public void llenardeposito(){
		this.numerovasos=30;
		this.capsula=30;
		this.leche=30;
	}
	public void darCambio() {
		
	}
	public int getCapsula() {
		return capsula;
	}
	public int getLeche() {
		return leche;
	}
	public void setLeche(int leche) {
		this.leche = leche;
	}
	public void setCapsula(int capsula) {
		this.capsula = capsula;
	}
	public double getPreciocafe() {
		return preciocafe;
	}
	public void setPreciocafe(double preciocafe) {
		this.preciocafe = preciocafe;
	}
	public String getTipocafe() {
		return tipocafe;
	}
	public void setTipocafe(String tipocafe) {
		this.tipocafe = tipocafe;
	}
	public String getVaso() {
		return vaso;
	}
	public void setVaso(String vaso) {
		this.vaso = vaso;
	}
	public int getNumerovasos() {
		return numerovasos;
	}
	public void setNumerovasos(int numerovasos) {
		this.numerovasos = numerovasos;
	}
	public double getMonedero() {
		return monedero;
	}
	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}
	public String EstadoMaquina() {
		return "Hay"+this.numerovasos+"y "+this.capsula;
	}
	public String EstadoMonedero() {
		return "Hay"+this.monedero;	
	}
	public void ServirCafe() throws Exception {
		if (capsula>0 && numerovasos>0) {
			numerovasos=numerovasos-1;
			capsula=capsula-1;
			monedero=monedero+PRECIO_CAFE_SOLO;
		}else {
			throw new Exception("No disponible");
		}

	}
	public void ServirCafeConLeche() throws Exception {
		if (capsula>0 && numerovasos>0 && leche>0) {
		numerovasos=numerovasos-1;
		capsula--;
		leche--;
		monedero+=PRECIO_CAFE_LECHE;
		}else {
			throw new Exception("No disponible");
		}
	}
	public void ServirLeche() throws Exception {
		if (leche>0 && numerovasos>0) {
			numerovasos=numerovasos-1;
			leche--;
			monedero+=PRECIO_LECHE;
		}else {
			throw new Exception("No disponible");
		}

	}
}
