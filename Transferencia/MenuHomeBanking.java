import java.util.Scanner;

public class MenuHomeBanking {
    // Datos del usuario
    public final static String nombre = "Jemina";
    public final static String apellido = "Rodriguez";
    public final static String dni = "1234567890";

    // Servicios
    public final static double luz = 2500;
    public final static double gas = 8300;
    public final static double agua = 1500;
    public final static double internet = 12000;

    // Saldo
    public static double saldo = 350000;

    public static double descontarSaldo (double valor){   
        saldo -= valor;
        return saldo;
    }

    public static void menuOSalir()
    {
        int res;
        System.out.println("¿Deseas volver al menú principal (1) o salir del homebanking (2)?");
        res = Teclado.obtenerInt();

        if (res == 1) {
            menuPrincipal();
        }
        else if ( res == 2 )
            return;
        else {
            System.out.println("Opción no válida. Inténtelo nuevamente...");
            menuOSalir();
        };
    }
    
    public static void menuPrincipal()
    {
        int res;

        System.out.println("Menú principal:");
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
            case 4: // Pago de servicios
                do {
                    System.out.println("¿Qué servicio desea pagar?");
                    // Opciones:
                    System.out.println("1. Luz $2500");
                    System.out.println("2. Gas $8300");
                    System.out.println("3. Agua $1500");
                    System.out.println("4. Internet $12000");
            
                    // Instrucción de entrada
                    res = Teclado.obtenerInt(); 
                    
                    // Manejo de pagos
                    double montoAPagar = 0;
            
                    switch (res) {
                        case 1:
                            montoAPagar = luz;
                            break;
                        case 2:
                            montoAPagar = gas;
                            break;
                        case 3:
                            montoAPagar = agua;
                            break;
                        case 4:
                            montoAPagar = internet;
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;
                    }
            
                    if ( montoAPagar > 0 && saldo >= montoAPagar )
                    {
                        System.out.println("Procesando pago");
                        saldo -= montoAPagar;
                        System.out.println("Su Saldo actual es: $ " + saldo);
                    } else {
                        System.out.println("Monto no válido o saldo insuficiente.");
                    }
            
                    // Pregunta al usuario si desea realizar otro pago
                    System.out.println("¿Desea realizar otro pago? (1: Sí / 2: No)");
                    res = Teclado.obtenerInt();
            
                    if (res != 1) {
                        // Si la respuesta no es 1, salimos del bucle
                        break;
                    }
            
                } while (true); // Fin del bucle de pago en línea
            
                
                menuOSalir();
                break;
            case 5: // Salir
                return;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                menuPrincipal();
        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }
}