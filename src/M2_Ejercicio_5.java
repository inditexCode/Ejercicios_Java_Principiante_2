import java.util.Scanner;

public class M2_Ejercicio_5 {

	public static void main(String[] args) {
	 
		// mismo ejercicio que el anterior solo que esta vez imprira los numeros pares
		
		System.out.println("Secuencia números ingresados MIN - MAX.");
		Scanner scanner = new Scanner(System.in);
		
		// Tomamos el valor minimo como String ( cadena de texto )
		System.out.println("===> Introduzca el valor MINIMO <===");
		String Min = scanner.nextLine();
		
		// Tomamos el valor minimo como String ( cadena de texto )
		System.out.println("===> Introduzca el valor MAXIMO <===");
		String Max = scanner.nextLine();
		
		// Los convertimos a enteros
		int minimo = Integer.parseInt(Min);
		int maximo = Integer.parseInt(Max);
		
		// hacemos un bucle for para recorre desde el minimo al maximo
		// pero solo imprimimos los numeros pares 
		
		for (int i = minimo; i < maximo; i+=2) {
			System.out.println(" ==> " + i);
		}
		scanner.close();

	}

}
