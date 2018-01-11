package metodos;

public class Calculos {

	public static double Elevar(double numero, int numeroaelevar) {
		double numeroelevado=numero;
		for(int i=1;i<numeroaelevar;i++)
		{
			numeroelevado=numero*numero;
		}
		return numeroelevado;
	}
	
	public static double areaRectangulo(double base, double altura) {
		double area=base*altura;
		return area;
	}
	
}
