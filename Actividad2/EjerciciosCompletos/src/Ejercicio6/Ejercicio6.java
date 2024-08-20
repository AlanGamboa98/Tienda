/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alanp
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularHipotenusa(double catetoA, double catetoB) {
        return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión del lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la dimensión del lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la dimensión del lado C: ");
        double ladoC = scanner.nextDouble();

        double areaRectangulo = calcularAreaRectangulo(ladoA, ladoB);
        double areaTriangulo = calcularAreaTriangulo(ladoB, ladoC);
        double perimetro = calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        System.out.println("El area del terreno es: " + (areaRectangulo + areaTriangulo));
        System.out.println("El perimetro del terreno es: " + perimetro);
    }
}
