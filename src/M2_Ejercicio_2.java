import java.util.Scanner;

public class M2_Ejercicio_2 {

	public static void main(String[] args) {

//Escribe un programa que indique si un número introducido por el usuario es par o impar.

		System.out.println("Ingrese un número para comprobar si es PAR o IMPAR");
		// INGRESAMOS POR TECLADO
		Scanner teclado = new Scanner(System.in);
		
		String valorIngresado = teclado.nextLine();
		
		// ponemos una dificultad mas, a traves de expresiones regulares comprobamos si 
		// se introducen números o texto
		
		if((!valorIngresado.matches("[0-9]*"))) {
			System.out.println("El número introducido no es correcto, vuelva a intentar");
		// salimos del programa
			System.exit(0);
		}
		
		
		// convertimos a entero
		int numero = Integer.parseInt(valorIngresado);
		
		// A NÚMERO SI EL RESTO DE LA DIVISIÓN ES 0 SIGNIFICA QUE ES PAR
		// DE LO CONTRARIO ES IMPAR
		
		if(numero % 2 == 0) {
			System.out.println("El número ingresado " + numero + " es PAR");
		}else {
			System.out.println("El número ingresado " + numero + " es IMPAR");
		}
		teclado.close();// cerrar el programa

	}

}
