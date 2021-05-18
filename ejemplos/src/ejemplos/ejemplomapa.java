
package ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ejemplomapa {

	public static void main(String[] args) {

		Map<String, String> diccionario = new HashMap<String, String>();;
		
		diccionario.put("perro", "Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueño.");
		diccionario.put("vida", "Fuerza o actividad esencial mediante la que obra el ser que la posee.");
		
		System.out.println("IMPRIMIMOS TODO");
		System.out.println(diccionario); //nos devuelve todos los valores separados por una coma
		System.out.println("IMPRIMIMOS GET() QUE DA EL VALOR");
		System.out.println(diccionario.get("perro")); //nos da la definicion de perro
		System.out.println("IMPRIMIMOS KEYSET() QUE DA TODAS LAS CLAVES EXISTENTES");
		for (String clave : diccionario.keySet()) {
			System.out.println(clave);
		}
		System.out.println("IMPRIMIMOS VALUES() QUE DA TODOS LOS VALORES EXISTENTES");
		for (String valor : diccionario.values()) {
			System.out.println(valor);
		}
		
		//PUT introduce contenido
		//GET nos da un valor
		//KEYSET nos da todas las claves (columna izquierda)
		//KEY VALUES nos da todos los valore (columna derecha)
	
	
		Map<String, List<Integer>> numeros = new HashMap<String, List<Integer>>();
		
		List<Integer> primerosPrimos;
		primerosPrimos = new ArrayList<>();
		List<Integer> primerosPares;
		primerosPares = new ArrayList<>();
		List<Integer> primerosImpares;
		primerosImpares = new ArrayList<>();
		
		for (int i = 1; i < 101; i++) {
			int contador = 0;
			if(i%2==0) {
				primerosPares.add(i);
			}
			else if (i%2!=0) {
				primerosImpares.add(i);
			}
			for (int j = 1; j < 101; j++) {
				if(i%j==0) {
					contador++;
					
				}
			}
			if (contador==2) {
				primerosPrimos.add(i);
			}
		}
		
		numeros.put("primos", primerosPrimos);
		numeros.put("pares", primerosPares);
		numeros.put("impares", primerosImpares);
		
		System.out.println(diccionario);
		
		
	}

}
