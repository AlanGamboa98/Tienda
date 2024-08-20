/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.4;
    }

    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble();

        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);
    }
}
