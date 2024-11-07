// Importamos la clase Scanner para capturar la entrada del usuario desde el teclado
import java.util.Scanner;

// Declaración de la clase principal del programa
public class M2_Ejercicio_3_Plus {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        /*
         * Este programa es un conversor de divisas entre dólar y euro. Al iniciar, el
         * usuario puede seleccionar si desea convertir de dólares a euros o de euros a
         * dólares. Luego, se solicita la cantidad a convertir y se muestra el resultado.
         * El programa continúa hasta que el usuario decide salir.
         */

        System.out.println("Convertidor de divisas 🪙"); 

        // Creamos un objeto Scanner para capturar la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Definimos una variable booleana como "bandera" para controlar el bucle
        // `continuar` es true mientras el usuario no elija salir
        boolean continuar = true;

        // Bucle do-while que se ejecuta hasta que el usuario elija salir (opción 3)
        do {
            // Muestra las opciones de conversión disponibles al usuario
            System.out.println("1 - Dólar a Euro");
            System.out.println("2 - Euro a Dólar");
            System.out.println("3 - Salir");

            // Captura la opción ingresada por el usuario como una cadena
            String opciones = teclado.nextLine();

            // Estructura de control `switch` para procesar la opción elegida por el usuario
            switch (opciones) {
                case "1": // Caso de conversión de dólares a euros
                    System.out.println("Ingrese la cantidad a convertir");
                    String cantidad = teclado.nextLine(); // Captura la cantidad a convertir
                    float numero = Float.parseFloat(cantidad); // Convierte la cadena de texto a tipo float
                    float resultado = (float) (numero * 0.91); // Realiza la conversión a euros
                    System.out.println("Te llevas " + resultado + " € "); 
                    System.out.println("--------------------------------------");
                    break;

                case "2": // Caso de conversión de euros a dólares
                    System.out.println("Ingrese la cantidad a convertir");
                    String cantidad2 = teclado.nextLine(); // Captura la cantidad a convertir
                    float numero2 = Float.parseFloat(cantidad2); // Convierte la cadena de texto a tipo float
                    float resultado2 = (float) (numero2 * 1.07); // Realiza la conversión a dólares
                    System.out.println("Te llevas " + resultado2 + " Dólares "); 
                    System.out.println("--------------------------------------");
                    break;

                case "3": // Caso para finalizar el programa
                    System.out.println("Gracias por usar el programa..."); 
                    continuar = false; // Cambia la bandera a `false` para terminar el bucle
                    break;

                default: // Caso en que la entrada del usuario no coincide con ninguna opción
                    System.out.println("Error, vuelva a intentar"); 
                    System.out.println("--------------------------------------");
            }
        } while (continuar); // El bucle continúa mientras `continuar` sea `true`

        teclado.close();// Cierra el objeto Scanner para liberar recursos
    }
}
