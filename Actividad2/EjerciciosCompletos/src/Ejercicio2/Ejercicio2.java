package Ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static int calcularBuses(int sillasBus, int gordos, int flacos) {
        int totalSillasNecesarias = gordos * 2 + flacos;
        return (int) Math.ceil((double) totalSillasNecesarias / sillasBus);
    }

    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog("Bienvenido, ¿Quieres hacer el cálculo? (sí/no)");

        if (opcion == null || opcion.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó una respuesta válida. Saliendo...");
            System.exit(0);
        }

        opcion = opcion.trim().toLowerCase();

        switch (opcion) {
            case "sí":
            case "si":
                int sillasBus = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de sillas por bus:"));
                int gordos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes gordos:"));
                int flacos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes flacos:"));

                int buses = calcularBuses(sillasBus, gordos, flacos);
                JOptionPane.showMessageDialog(null, "Se necesitan " + buses + " buses.");
                break;

            case "no":
                JOptionPane.showMessageDialog(null, "El cálculo no se realizará.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Respuesta no válida. Hasta luego");
                System.exit(0);
                break;
        }
    }
}

