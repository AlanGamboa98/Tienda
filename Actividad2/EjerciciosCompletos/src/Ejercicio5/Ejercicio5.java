/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularAreaCorona(double radioMayor, double radioMenor) {
        return calcularAreaCirculo(radioMayor) - calcularAreaCirculo(radioMenor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio mayor (R): ");
        double radioMayor = scanner.nextDouble();

        System.out.print("Ingrese el radio menor (r): ");
        double radioMenor = scanner.nextDouble();

        double areaCorona = calcularAreaCorona(radioMayor, radioMenor);
        System.out.println("El área de la corona circular es: " + areaCorona);
    }
}
