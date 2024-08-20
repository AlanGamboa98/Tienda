/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void convertirSegundos(int segundosTotales) {
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de segundos: ");
        int segundosTotales = scanner.nextInt();

        convertirSegundos(segundosTotales);
    }
}
