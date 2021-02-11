
package lecturas;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lecturas {

    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(isr);

    public static int entero() {
        try {
            return Integer.parseInt(br.readLine());
        } catch (Exception error) {
            System.out.println("Error...se esperaba un entero");
            return 0;
        }
    }

    public static int entero(boolean b) {
        int r = -1;
        do {
            try {
                r = Integer.parseInt(br.readLine());
                b = false;
            } catch (Exception error) {
                System.out.println("Error...se esperaba un entero, volver a capturar");
            }
        } while (b);
        return r;
    }

    public static double doble() {
        try {
            return Double.parseDouble(br.readLine());
        } catch (Exception error) {
            System.out.println("Error...se esperaba un doble " + error.getMessage());
            return 0;
        }
    }

    public static double doble(boolean b) {
        double r = -1;
        do {
            try {
                r = Double.parseDouble(br.readLine());
                b = false;
            } catch (Exception error) {
                System.out.println("Error...se esperaba un nÃºmero con decimal, volver a capturar");
            }
        } while (b);
        return r;
    }

    public static String cadenas() {
        try {
            return br.readLine();
        } catch (Exception error) {
            System.out.println("Error...se esperaba una cadena");
            return "";
        }
    }

    public static char caracter() {
        char c;
        try {
            c = (char) br.read();
            String cad = br.readLine();
        } catch (Exception error) {
            System.out.println("Error...se esperaba un caracter");
            c = ' ';
        }
        return c;
    }
}
