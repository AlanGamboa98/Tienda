/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static double calcularLongitudEscalera(double altura, double angulo) {
        return altura / Math.sin(Math.toRadians(angulo));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null, "Buen dia, Realizaremos el calculo de la escalera por consola.");

        System.out.print("Ingrese la altura de la escalera: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el angulo de inclinación (en grados): ");
        double angulo = scanner.nextDouble();

        double longitud = calcularLongitudEscalera(altura, angulo);
        System.out.println("La longitud de la escalera es: " + longitud);
    }
}


