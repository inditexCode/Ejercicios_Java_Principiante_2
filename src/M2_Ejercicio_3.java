import java.util.Scanner;

public class M2_Ejercicio_3 {

	public static void main(String[] args) {
		
/*  Realiza una aplicación que funcione como conversor de monedas entre dos divisas 
 *  (dólar y euro). Al iniciar la aplicación se presentarán al usuario las dos opciones
 *  (pasar de dólares a euros y viceversa) y el usuario tendrá que seleccionar
 *  una de las dos. A continuación se solicitará la cantidad.
 *  Para finalizar el programa mostrará al usuario por pantalla la cantidad convertida
 *  a la divisa que proceda
*/
		System.out.println("Conversor de Monedas:");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Dolar a Euro");
		System.out.println("2 - Euro a Dolar");		
		System.out.println("3 - Salir");
		String opcion = teclado.nextLine();
		
		switch(opcion) {
		case "1":
			System.out.println("Ingrese la cantidad a convertir");
			String cantidad = teclado.nextLine();
			float numero = Float.parseFloat(cantidad);
			float resultado = (float) (numero * 0.91);
			System.out.println("Te llevas " + resultado + " € ");
			break;
		case "2":
			System.out.println("Ingrese la cantidad a convertir");
			String cantidad2 = teclado.nextLine();
			float numero2 = Float.parseFloat(cantidad2);
			float resultado2 = (float) (numero2 * 1.07);
			System.out.println("Te llevas " + resultado2 + " Dolares ");
			break;
		case "3":
			System.out.println("Gracias por usar el programa...");
			break;
			default:
				System.out.println("Error vuelva a intentar");
		}
		teclado.close();
		
	}

}
