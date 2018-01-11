package metodos;

public class Cadena {

	public static String CadenaCaracteres(String simbolo, int tamano) {
		String cadena="";
		for(int i=0;i<tamano;i++)
		{
			cadena=String.format(cadena+simbolo);
		}
		
		return cadena;
	}
	
	public static int tamanoMaximoVector(String [] vector) {
		int max=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i].length()>max)
				max=vector[i].length();
		}
		
		return max;
	}
	
}

