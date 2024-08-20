/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author alanp
 */
import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static int encontrarMayor(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Ingresa dos numeros y te dire cual es el mayor");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        int mayor = encontrarMayor(num1, num2);
        JOptionPane.showMessageDialog(null, "El mayor número es: " + mayor);
        
        JOptionPane.showMessageDialog(null, "Que tengas buen dia, hasta luego.");
    }
}
