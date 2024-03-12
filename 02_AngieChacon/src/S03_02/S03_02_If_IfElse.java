package S03_02;

/**
 *
 * @author AngieChacon
 */
public class S03_02_If_IfElse {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean a = false;
        int b = 5;

        //If simple        
        if (a) {
            System.out.println("Hola");
        }

        //If else
        if (a) {
            System.out.println("Ejecucion false");
        }

        if (b == 10) {
            System.out.println("b vale 10");
        } else if (b == 20) {
            System.out.println("b vale 20");
        } else if (b == 30) {
            System.out.println("b vale 30");
        } else {
            System.out.println("No cumple");
        }
    }
}
