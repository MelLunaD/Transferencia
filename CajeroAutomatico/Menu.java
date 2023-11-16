public class Menu {

    // Datos del usuario (Hacer otro AList para acomodar los datos) y Agregar un limpiar Pantalla
    public final static String nombre = "Jemina";
    public final static String apellido = "Rodriguez";
    public final static String dni = "1234567890";

    // Saldo
    public static double saldo = 350000;

    public static double descontarSaldo (double valor)
    {   
        saldo -= valor;
        return saldo;
    }

    public static void menuOSalir()
    {
        Teclado.saltarLinea();
        System.out.println("¿Deseas volver al menú principal (1) o salir del homebanking (2)?");
        int res = Teclado.obtenerInt();

        if (res == 1) {
            menuPrincipal();
        }
        else if ( res == 2 ){
            Teclado.cerrarTeclado();
            System.exit(0);
        }else{
            System.out.println("Opción no válida. Inténtelo nuevamente...");
            menuOSalir();
        }
    }

     public static void menuOCerrarSesion()
    {
        Teclado.saltarLinea();
        System.out.println("¿Deseas volver al menú principal (1) o cerrar sesión(2)?");
        int res = Teclado.obtenerInt();

        if (res == 1) {
            menuPrincipal();
        }
        else if ( res == 2 ){
            Login.iniciarSesion();
            menuPrincipal();
        }else {
            System.out.println("Opción no válida. Inténtelo nuevamente...");
            menuOCerrarSesion();
        };
    }
    
    public static void menuPrincipal()
    {
        Teclado.limpiarPantalla();
        System.out.println("---- Menú principal ----");
        System.out.println("1. Datos del usuario");
        System.out.println("2. Saldo");
        System.out.println("3. Transferencia");
        System.out.println("4. Pago online");
        System.out.println("5. Salir");
        int opcion = Teclado.obtenerInt();

        switch (opcion) { // Datos personales
            case 1:
                System.out.println("Datos del usuario:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("DNI: " + dni);
                menuOSalir();
                break;
            case 2: // saldo disponible
                System.out.println("Saldo disponible: " + saldo);
                menuOSalir();
                break;    
            case 3: 
                Transferencia.transferir(saldo);
                menuOSalir();
                break;
            case 4:
                PagoOnline.Servicios(saldo);
                menuOSalir();
                break;
            case 5: //Salir
                Teclado.cerrarTeclado();
                System.exit(0);
                return;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                menuPrincipal();
        }
    }

    
}