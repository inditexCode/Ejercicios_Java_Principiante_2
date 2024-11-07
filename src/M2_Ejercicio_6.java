// Importamos las librerías necesarias para el programa
import java.util.Random; // Para generar un número aleatorio
import java.util.Scanner; // Para recibir entradas del usuario

// Declaración de la clase principal del programa
public class M2_Ejercicio_6 {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {

        /*
         * Este programa genera un número aleatorio entre 1 y 20, que el usuario debe
         * adivinar. El usuario cuenta con un número limitado de intentos para adivinar
         * el número. Después de cada intento, el programa da una pista indicando si el
         * número a adivinar es mayor o menor que el número ingresado por el usuario.
         * El juego termina cuando el usuario acierta el número o agota sus intentos.
         */

        int intentosMaximo = 5; // Número máximo de intentos permitidos
        int numeroIntentos = 0; // Contador de intentos realizados

        // Mensaje inicial para el usuario
        System.out.println("🎁🎁🎁 ADIVINA QUE NÚMERO ESTOY PENSANDO 🎁🎁🎁");
        System.out.println();

        // Creación de una instancia de Random para generar un número aleatorio
        Random random = new Random();
        int aleatorio = random.nextInt(20) + 1; // Genera un número entre 1 y 20

        // Creación de una instancia de Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Bucle principal del juego que se ejecuta hasta que el usuario agote sus intentos
        while (numeroIntentos < intentosMaximo) {
           // Solicita al usuario que ingrese un número entre 1 y 20
            System.out.println("===> Ingrese un número del 1 al 20  <===");
            System.out.println("Intentos: " + (intentosMaximo - numeroIntentos)); // Muestra los intentos restantes
            int numeroIngresado = teclado.nextInt(); // Lee el número ingresado por el usuario

            // Validación: verifica que el número ingresado esté entre 1 y 20
            if (numeroIngresado < 1 || numeroIngresado > 20) {
                System.out.println(" ⛔ Error - el numero debe ser de 1 a 20");
                continue; // Si el número no es válido, vuelve a pedir otro número
            }

            numeroIntentos++; // Incrementa el contador de intentos tras una entrada válida


            // Condición para verificar si el usuario ha adivinado el número
            if (numeroIngresado == aleatorio) {
                System.out.println("🥳🥳🥳 FELICIDADES ! Ganaste el juego 🥳🥳🥳");
                break; // Termina el juego si el usuario adivina el número
            } else if (numeroIngresado < aleatorio) { // Si el número es menor al aleatorio
                System.out.println("El número es más ALTO."); // Da una pista
            } else { // Si el número es mayor al aleatorio
                System.out.println("El número es más BAJO."); // Da una pista
            }

            // Verifica si el usuario agotó el número máximo de intentos
            if (numeroIntentos == intentosMaximo) {
                System.out.println("Perdiste el juego 😫"); // Informa al usuario que perdió
            } else {
                // Informa al usuario de los intentos restantes y continúa el juego
                System.out.println("Intentos restantes: " + (intentosMaximo - numeroIntentos));
                System.out.println("----------------------------------");
            }
        }

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
