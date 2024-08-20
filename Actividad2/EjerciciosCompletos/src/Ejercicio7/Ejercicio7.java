/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author alanp
 */
import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada x1:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada y1:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada x2:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada y2:"));

        double distancia = calcularDistancia(x1, y1, x2, y2);
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        JOptionPane.showMessageDialog(null, "La distancia entre los puntos es: " + distancia +
                "\nLa pendiente de la recta que une los puntos es: " + pendiente);
    }
}

