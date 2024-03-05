package poo;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        int entero, entero1;

        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        entero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        System.out.println("La suma de los dos numeros es: " + (entero + entero1));

    }

}
