package Tarea2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del estudiante
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer cada nota del estudiante
        System.out.print("Ingresa la primera nota de pragramacion (entre 0 y 20): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingresa la segunda nota de programacion (entre 0 y 20): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingresa la tercera nota de programadores (entre 0 y 20): ");
        double nota3 = scanner.nextDouble();

        System.out.print("Ingresa la cuarta nota de programacion (entre 0 y 20): ");
        double nota4 = scanner.nextDouble();

        System.out.print("Ingresa la quinta nota (entre 0 y 20): ");
        double nota5 = scanner.nextDouble();

        // Calcular el promedio de las 5 notas del estudiante
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        // Mostrar el promedio
        System.out.println("El promedio de las 5 notas es: " + promedio);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    }


