import java.util.Scanner;

public class Login {
    private static boolean estaLogueado = false;
    private static String usuario = "juancasla777";
    private static String contrasena = "jojox2456";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // se llama a la funcion de inicio de cesion    
        realizarLogin(teclado);

        // despues del incio se puede raealizar otras funciones dentro del loggin
        if (estaLogueado) {
            
            System.out.println("¡Bienvenido al sistema de HomeBanking de la comision 23596!");
        }
    }

    private static void realizarLogin(Scanner teclado) {
        boolean datosCorrectos = false;

        do {
            System.out.println("Ingrese su nombre de usuario:");
            String usuarioIngresado = teclado.nextLine();

            System.out.println("Ingrese su contraseña:");
            String contrasenaIngresada = teclado.nextLine();

            datosCorrectos = validarCredenciales(usuarioIngresado, contrasenaIngresada);

            if (datosCorrectos) {
                estaLogueado = true;
                System.out.println("Inicio de sesión exitoso");
            } else {
                System.out.println("Las credenciales son incorrectas, por favor vuelva a ingresarlas");
            }
        } while (!datosCorrectos);
    }

    private static boolean validarCredenciales(String usuarioIngresado, String contrasenaIngresada) {
        return usuarioIngresado.equals(usuario) && contrasenaIngresada.equals(contrasena);
    }
}