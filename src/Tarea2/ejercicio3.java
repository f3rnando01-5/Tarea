package Tarea2;
 import java.util.Scanner;
public class ejercicio3 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio del círculo/esfera
        System.out.print("Ingresa el radio del círculo/esfera: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo (A = πr^2)
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + areaCirculo);

        // Calcular la circunferencia del círculo (C = 2πr)
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es: " + circunferencia);

        // Calcular el volumen de la esfera (V = 4/3πr^3)
        double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumenEsfera);

        // Resolver una ecuación cuadrática de la forma ax^2 + bx + c = 0
        System.out.println("\nAhora vamos a resolver una ecuación cuadrática.");
        System.out.print("Ingresa el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingresa el valor de c: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante (Δ = b^2 - 4ac)
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Verificar la naturaleza de las raíces usando el discriminante
        if (discriminante > 0) {
            // Dos raíces reales y diferentes
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces de la ecuación cuadrática son reales y diferentes.");
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else if (discriminante == 0) {
            // Dos raíces reales e iguales
            double raiz = -b / (2 * a);
            System.out.println("Las raíces de la ecuación cuadrática son reales e iguales.");
            System.out.println("Raíz: " + raiz);
        } else {
            // Raíces complejas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las raíces de la ecuación cuadrática son complejas.");
            System.out.println("Raíz 1: " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raíz 2: " + parteReal + " - " + parteImaginaria + "i");
        }

        scanner.close();
    }
}

