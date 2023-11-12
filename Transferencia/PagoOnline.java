public class PagoOnline {

    // Servicios
    public final static double luz = 2500;
    public final static double gas = 8300;
    public final static double agua = 1500;
    public final static double internet = 12000;

    public static void Servicios(double valorSaldo){
    
        System.out.println("¿Qué servicio desea pagar?");

        // Opciones:
        System.out.println("1. Luz $2500");
        System.out.println("2. Gas $8300");
        System.out.println("3. Agua $1500");
        System.out.println("4. Internet $12000");

        // Manejo de pagos
        double montoAPagar = 0;

        // Instrucción de entrada
        switch (Teclado.obtenerInt()) {
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

        if ( montoAPagar > 0 && valorSaldo >= montoAPagar )
        {
            System.out.println("Procesando pago");
            Menu.descontarSaldo(montoAPagar);
            System.out.println("Su saldo anterior es:       $" + valorSaldo);
            System.out.println("El monto transferido es:    $" + montoAPagar);
            System.out.println("Su saldo actual es:         $" + Menu.descontarSaldo(montoAPagar));
        } else {
            System.out.println("Monto no válido o saldo insuficiente.");
        }

        // Pregunta al usuario si desea realizar otro pago
        System.out.println("¿Desea realizar otro pago? (1: Sí / 2: No)");
        if (Teclado.obtenerInt()== 1) 
            // Si la respuesta es 1, realizamos otro pago
            Servicios(valorSaldo);
        else
            Menu.menuOCerrarSesion();
    }
}
