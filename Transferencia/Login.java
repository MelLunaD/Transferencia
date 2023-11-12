public class Login {

    //Se puede hacer un AList con varios usuarios y contraseñas
    private static String usuario = "User1";
    private static String contrasena = "1234";
    

    public static void iniciarSesion() {

        Teclado.limpiarPantalla();
        System.out.println("---- Bienvenido ----");
        Teclado.saltarLinea();
        System.out.println("Ingrese su nombre de usuario:");
        String usuarioIngresado = Teclado.obtenerString();
        Teclado.saltarLinea();
        System.out.println("Ingrese su contraseña:");
        String contrasenaIngresada = Teclado.obtenerString(); 

        if (usuarioIngresado.equals(usuario) && contrasenaIngresada.equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Las credenciales son incorrectas, por favor vuelva a ingresarlas");
            iniciarSesion();
        }
    
    }

}
  