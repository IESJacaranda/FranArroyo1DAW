package plataforma;

public class Main {

	public static void main(String[] args) throws Exception{
		Empresa net= new Empresa("JACA");
		//Pruebo metodo addPeliSerie
		net.addPeliSerie(2, "SERIE TOPE", "INTRIGA", 1932, 23, 12);
		net.addPeliSerie(1, "Peli El pepe", "DRAMA", 1900, 23, 120);
		//Esta lanza la excepcion correspondiente
//		try {
//			net.addPeliSerie(3, "Producto raro", "INTRIGA", 1900, 23, 12);
//		} catch (Exception e) {
//			System.out.println("Esto da el fallo");
//		}
		//Prueblo metodo SetDuracion a la pelicula Peli El pepe
		net.SetDuracion("Peli El pepe", 200);
		//Metodo para obtener el menor agno de la pelicula
		System.out.println(net.menorAnno());
		//Ordeno por forma ascendente
		System.out.println(net.listarPelisSeriesPorAgno());
		//Metodo SetTema
		System.out.println(net.setTema("SERIE TOPE", "DRAMA"));
		System.out.println(net.addEpisodio("SERIE TOPE", "Numerooo1", 1));
	}
	

}
