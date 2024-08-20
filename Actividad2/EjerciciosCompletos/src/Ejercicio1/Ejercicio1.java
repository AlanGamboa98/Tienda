package Ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static double calcularFuncion(double x, double y) {
        return Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido, podras calcular el valor de la funcion solicitada.");
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de y:"));

        double resultado = calcularFuncion(x, y);
        JOptionPane.showMessageDialog(null, "El valor de f(x, y) es: " + resultado);
        JOptionPane.showMessageDialog(null, "Espero te sirviera en tu operacion, hasta luego.");
    }
}
