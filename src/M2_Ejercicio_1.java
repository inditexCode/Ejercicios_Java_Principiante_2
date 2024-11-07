import java.util.Scanner;

public class M2_Ejercicio_1 {

	public static void main(String[] args) {
		
		// 1 - Escribe un programa que indique, para dos números dados, cuál es mayor.
  
		System.out.println("Verificando que número ingresado es mayor");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("===> Ingrese el primer número <===");
		// ESTAMOS INGRESANDO -- STRING -- ES DECIR TEXTO
		String ingreso1 = teclado.nextLine();
		
		System.out.println("===> Ingrese el segundo número <===");
		// ESTAMOS INGRESANDO -- STRING -- ES DECIR TEXTO
		String ingreso2 = teclado.nextLine();
		
		// ACA CONVERTIMOS --STRING-- EN --INT-- ES DECIR ENTEROS
		int numero1 = Integer.parseInt(ingreso1);
		int numero2 = Integer.parseInt(ingreso2);

		// uso de condicionales --------------
		if(numero1==numero2) {
			System.out.println("Los valores introducidos son iguales");
		}else if(numero1>numero2) {
			System.out.println("El primer número ingresado " + numero1 + " es mayor a " + numero2);
		}else if(numero1<numero2){
			System.out.println("El segundo número ingresado " + numero2 + " es mayor a " + numero1);

		}
       teclado.close();// cerrar el programa

	}

}
