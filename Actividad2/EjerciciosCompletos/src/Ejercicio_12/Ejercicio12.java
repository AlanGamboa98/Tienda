/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio12 {
    public static int obtenerDiasDelMes(int mes, int año) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
 case 4, 6, 9, 11 -> {
     return 30;
            }
 case 2 ->  {
     if (esBisiesto(año)) {
         return 29;
     } else {
         return 28;
     }
            }
 default -> {
     return -1;  // Error en caso de un mes inválido
            }
        }
    }

    public static boolean esBisiesto(int año) {
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero del mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        int dias = obtenerDiasDelMes(mes, año);
        if (dias == -1) {
            System.out.println("Mes invalido.");
        } else {
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        }
    }
}
