package cadenasjava;

public class frase {
	public String frase;

	public frase(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	public int contarpalabras() {
		int palabras=0;
		this.frase=this.frase.trim();
		while(this.frase!=this.frase.replace("  ", " ")) {
			this.frase=this.frase.replace("  ", " ");
		}
		for (int i=0;i<this.frase.length();i++) {
			if (this.frase.charAt(i)==' '&& this.frase.charAt(i+1)!=' ') {
				palabras++;
			}
		}
		
		return palabras;
	}
}
