public class Transferencia {
    public static void transferirMenu(double valorSaldo) 
    {
        int resp = 0;

        Teclado.limpiarPantalla();
        System.out.println("----- TRANSFERENCIA -----");
        System.out.println("1. CBU");
        System.out.println("2. Alias");
        Teclado.saltarLinea();
        System.out.print("Elija una opción: ");

        resp = Teclado.obtenerInt();

        Teclado.limpiarPantalla();
        if (resp == 1) {
            System.out.println("Usted ha elegido transferir por CBU, por favor ingrese los números: ");
            System.out.print("CBU: ");
            Teclado.obtenerString();
        } else if (resp == 2) {
            System.out.println("Usted ha elegido transferir por alias, por favor ingrese los caracteres: ");
            System.out.print("ALIAS: ");
            Teclado.obtenerString();
        } else {
            System.out.println("Opción incorrecta, inténtelo nuevamente.");
            Teclado.saltarLinea();
            transferirMenu(valorSaldo);
        }
    }

    public static void transferir(double valorSaldo) 
    {
        double montoPagar;

        transferirMenu(valorSaldo);
        
        Teclado.limpiarPantalla();
        System.out.println("Su saldo es: $"+valorSaldo);
        System.out.print("Indique el monto que quiera transferir: ");
        montoPagar = Teclado.obtenerDouble();

        Teclado.limpiarPantalla();
        if (montoPagar> 0 && montoPagar <= valorSaldo) {
            System.out.println("Transferencia exitosa.");

            //Esto es el llamado a la función que ya actualiza mi saldo
            System.out.println("Su saldo anterior es:       $" + valorSaldo);
            System.out.println("El monto transferido es:    $" + montoPagar);
            System.out.println("Su saldo actual es:         $" + Menu.descontarSaldo(montoPagar));
        } else {
            System.out.println("Monto no válido o saldo insuficiente.");
            transferir(valorSaldo);
        }

        Menu.menuOCerrarSesion();
    }
}
