//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("----- Bem vindo ao JBank! -----");
        System.out.println("----- Como podemos ajudar? -----");
        System.out.println("1. Checar saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
    }

    public static int deposito(){
        Scanner quantidade = new Scanner(System.in);
        System.out.println("");
        return 0;
    }

    public static int sistema(){
        Scanner int action = new scanner(System.in);
        action.nextLine();
        if (action == 1){
            System.out.println("gay ahh");
        }
        else if (action == 2){
            System.out.println("gay ahh");
        }
        else if (action == 3){
            System.out.println("gay ahh");
        }
        else if (action == 4){
            System.out.println("gay ahh");
        }
        else {
            System.out.println("Escolha uma ação para continuar.");
        }
        return action;
    }
}