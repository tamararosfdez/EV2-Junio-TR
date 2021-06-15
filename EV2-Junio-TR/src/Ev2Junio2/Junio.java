package Ev2Junio2;

public class Junio {
	public int miMetodo(int numero1, int numero2) {
		int resultado = metodoTR(numero1, numero2);
		return resultado;
		}

	public int metodoTR(int numero1, int numero2) {
		int resultado = 0;
		if (numero1 < 5) {
		resultado = 55;
		} else if (numero2 > 10) {
		resultado = 100;
		}
		return resultado;
	}

	public static boolean junio(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
