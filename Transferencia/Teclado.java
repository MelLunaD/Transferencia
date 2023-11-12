import java.util.Scanner;

public class Teclado {
    final static private Scanner teclado = new Scanner(System.in);

    // Ingresa texto por teclado
    public static String obtenerString() {
        return teclado.nextLine();
    }

    // Ingresa un entero por teclado
    public static int obtenerInt() {
        int n = teclado.nextInt();
        teclado.nextLine();
        return n;
    }

    // Ingresa un double por teclado
    public static double obtenerDouble() {
        return teclado.nextDouble();
    }
    
    // Limpia la pantalla
    public static void limpiarPantalla()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    // Salta una línea
    public static void saltarLinea()
    {
        System.out.println();
    }

    public static void cerrarTeclado()
    {
        teclado.close();
    }
}