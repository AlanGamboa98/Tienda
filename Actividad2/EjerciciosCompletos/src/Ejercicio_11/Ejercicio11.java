/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static boolean esBisiesto(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();

        if (esBisiesto(year)) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " no es bisiesto.");
        }
    }
}
