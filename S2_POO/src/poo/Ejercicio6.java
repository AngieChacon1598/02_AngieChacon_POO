package poo;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        int x;
        int y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));

        JOptionPane.showMessageDialog(null, "La suma es: " + (x + y) + "\nLa resta es: " + (x - y) + "\nLa multiplicación es: " + (x * y) + "\nLa división es: " + (x / y));

    }

}
