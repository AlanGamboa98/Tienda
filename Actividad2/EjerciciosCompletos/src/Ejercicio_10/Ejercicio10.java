/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void ordenarNumeros(int a, int b, int c) {
        int mayor, medio, menor;

        if (a > b && a > c) {
            mayor = a;
            if (b > c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            mayor = b;
            if (a > c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a > b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        System.out.println("el orden de mayor a menor es: " + mayor + ", " + medio + ", " + menor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int c = scanner.nextInt();

        ordenarNumeros(a, b, c);
    }
}
