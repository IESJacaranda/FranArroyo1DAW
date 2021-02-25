package mastermind;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Mastermind {
	private int codigosecreto;
	private int numintentos;

	public Mastermind(int codigosecreto,int numintentos) {
		codigosecreto=ThreadLocalRandom.current().nextInt(1000, 10000);
		numintentos=0;
		this.codigosecreto = codigosecreto;
	}

	public int getCodigosecreto() {
		return codigosecreto;
	}

	public void setCodigosecreto(int codigosecreto) {
		this.codigosecreto = codigosecreto;
	}
	public int getNumintentos() {
		return numintentos;
	}

	public void setNumintentos(int numintentos) {
		this.numintentos = numintentos;
	}
	public String Comprobar(int codigosecreto) {
		Integer codigo=codigosecreto;
		String contrasena=codigo.toString();
		for (int i=0;contrasena.length()>i;i++) {

		}
		return "";
	}
	
	}

