package examen;

public enum Prioridad {
	ALTA(24),MEDIA(72),BAJA(168);
    private final int numhoras;

	Prioridad(int numhoras) {
        this.numhoras = numhoras;
    }

    public int getNumhoras() {
		return numhoras;
	}
}

