package metodos;

public class Utilidades {

	/**
	 * Imprime el vector introducido en consola
	 * y hace un menu con el simbolo "*" 
	 * por defecto.
	 **/
	
	public static void Menu(String[] nombresOpcion) {
		String listadoGenerico="";
		String simbolo="*";
		Menu(nombresOpcion,simbolo,listadoGenerico);
	}
	
	/**
	 * Imprime el vector introducido en consola
	 * y hace un menu con el simbolo introducido.
	 **/
	
	public static void Menu(String[] nombresOpcion, String simbolo) {
		String listadoGenerico="";
		Menu(nombresOpcion,simbolo,listadoGenerico);
	}
	
	/**
	 * Imprime el vector introducido en consola
	 * y hace un menu con el simbolo introducido, 
	 * ademas se introduce un mensaje génerico antes
	 * de cada entrada del vector.
	 **/
	
	public static void Menu(String[] nombresOpcion, String simbolo, String listadoGenerico) {
		
		boolean listadoVacio=false;
		
		int tamanoSimbolo=Cadena.tamanoMaximoVector(nombresOpcion)+listadoGenerico.length()+5;
		int espacios=-(Cadena.tamanoMaximoVector(nombresOpcion));
	
		if(listadoGenerico.equals(""))
		{
			listadoVacio=true;
			espacios--;
			tamanoSimbolo--;
		}
		String filaSimbolos=Cadena.CadenaCaracteres(simbolo,tamanoSimbolo);
			
		System.out.println(filaSimbolos);
		for(int i=0;i<nombresOpcion.length;i++)
		{
			
			if(listadoVacio)
			{
				System.out.printf(simbolo+"%-1s%"+espacios+"s"+simbolo+"\n",listadoGenerico,nombresOpcion[i]);
			}
				else
				{
					System.out.printf(simbolo+" "+"%-1s %"+espacios+"s "+simbolo+"\n",listadoGenerico,nombresOpcion[i]);
				}
		}
		System.out.println(filaSimbolos);
		
	}
	
}
