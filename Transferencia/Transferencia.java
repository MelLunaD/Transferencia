import java.util.*;

public class Transferencia {
    //Funcion bucle
    //Modularizar
    public static void transferir(double valorSaldo) {

        double montoPagar;
        int cbu, resp = 0;
        String alias;
        boolean NoIngres = true;

        Scanner teclado = new Scanner(System.in);

        do { 
            System.out.println("Su saldo es: $"+valorSaldo);
            System.out.println("Elija una opción:");
            System.out.println("1. CBU");
            System.out.println("2. Alias");

            resp = teclado.nextInt();
            teclado.nextLine();

            if (resp == 1) {
                System.out.println("Usted ha elegido CBU, por favor ingrese los números: ");
                cbu = teclado.nextInt();
                teclado.nextLine();
                NoIngres = false;

            } else if (resp == 2) {
                System.out.println("Usted ha elegido alias, por favor ingrese los caracteres: ");
                alias = teclado.nextLine();
                NoIngres = false;

            }else{
                System.out.println("Opción incorrecta, inténtelo nuevamente.");
            }
            
        } while (NoIngres);

         
        System.out.println("Indique el monto que quiera transferir: ");
        montoPagar = teclado.nextDouble();

        if (montoPagar <= valorSaldo) {
            System.out.println("Transferencia exitosa.");

            //Esto es el llamado a la función que ya actualiza mi saldo
            System.out.println("Su saldo actual es: $" +Menu.actualizarSaldo(montoPagar));
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
}