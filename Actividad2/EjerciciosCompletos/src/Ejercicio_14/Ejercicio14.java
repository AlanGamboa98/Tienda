/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_14;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio14 {
    public static boolean esTriangulo(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double ladoC = scanner.nextDouble();

        if (esTriangulo(ladoA, ladoB, ladoC)) {
            System.out.println("Los lados ingresados forman un triángulo.");
        } else {
            System.out.println("Los lados ingresados no forman un triángulo.");
        }
    }
}
