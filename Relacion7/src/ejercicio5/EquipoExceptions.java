package ejercicio5;

public class EquipoExceptions extends Exception{
		public EquipoExceptions() {
			super("El nombre del equipo es valido");
		}
		public EquipoExceptions(String msj) {
			super(msj);
		}
}
