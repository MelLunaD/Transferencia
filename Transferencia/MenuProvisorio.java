public class Menu {

     //Funcion saldo para actualizarlo
     public static double saldo = 100000; 
     public static double actualizarSaldo (double valor){   
         saldo -= valor;
        return saldo; 
     }
 
     public static void main(String[] args) {
         Transferencia.transferir(saldo);
     }
}
