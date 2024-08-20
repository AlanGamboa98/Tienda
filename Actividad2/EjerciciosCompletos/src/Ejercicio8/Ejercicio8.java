/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author alanp
 */


import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static int calcularSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    public static int calcularPisos(int numSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Realizaremos el Calulo necesario");
        int numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes:"));
        int capacidadSalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de un salón:"));
        int salonesPorPiso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de salones por piso:"));

        int numSalones = calcularSalones(numEstudiantes, capacidadSalon);
        int numPisos = calcularPisos(numSalones, salonesPorPiso);

        JOptionPane.showMessageDialog(null, "Número de salones necesarios: " + numSalones +
                "\nNúmero de pisos necesarios: " + numPisos);
    }
}
