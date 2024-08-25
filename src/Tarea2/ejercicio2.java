  package Tarea2;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar el número de segundos transcurridos
            System.out.print("Ingresa los segundos transcurridos en el partido (0 a 5400): ");
            int segundos = scanner.nextInt();

            // Validar que los segundos estén dentro del rango permitido
            if (segundos < 0 || segundos > 5400) {
                System.out.println("Por favor, ingresa un valor entre 0 y 5400.");
            } else {
                // Calcular el minuto utilizando la función Math.ceil
                int minuto = (int) Math.ceil(segundos / 60.0);

                // Mostrar el resultado
                System.out.println("Nos encontramos en el minuto " + minuto + " del partido.");
            }

            // Preguntar si el usuario quiere continuar
            System.out.print("¿Quieres ingresar otro valor? (si/no): ");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
} 
