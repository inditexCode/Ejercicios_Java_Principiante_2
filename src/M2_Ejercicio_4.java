import java.util.Iterator;
import java.util.Scanner;

public class M2_Ejercicio_4 {

	public static void main(String[] args) {
		
/* 5 - Escribe un programa que escriba por pantalla toda la secuencia entre dos números 
 *     introducidos por el usuario (un valor mínimo y uno máximo).
 *     Realiza las comprobaciones previas sobre los datos introducidos.
 */
		
		System.out.println("Secuencia números ingresados MIN - MAX");
		Scanner teclado = new Scanner(System.in);
		
		// Tomamos el valor minimo como String ( cadena de texto )
		System.out.println("===> Introduzca el valor MINIMO <===");
		String valorMin = teclado.nextLine();
		
		// Tomamos el valor minimo como String ( cadena de texto )
		System.out.println("===> Introduzca el valor MAXIMO <===");
		String valorMax = teclado.nextLine();
		
		// Los convertimos a enteros
		int minimo = Integer.parseInt(valorMin);
		int maximo = Integer.parseInt(valorMax);
		
		// hacemos un bucle for para recorre desde el minimo al maximo
		for (int i = minimo; i < maximo; i++) {
			System.out.println(" -> " + i);
		}
		teclado.close();
	}

}
