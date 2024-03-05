package poo;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        int x;
        int y;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));

        JOptionPane.showMessageDialog(null, "La suma es: " + (x + y));
        JOptionPane.showMessageDialog(null, "La resta es: " + (x - y));
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + (x * y));
        JOptionPane.showMessageDialog(null, "La división es: " + (x / y));

    }

}
