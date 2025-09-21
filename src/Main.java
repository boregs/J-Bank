//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        mainsystem();
    }
    public static void mainsystem(){
        System.out.println("----- Bem vindo ao JBank! -----");
        System.out.println("----- Como podemos ajudar? -----");
        System.out.println("1. Checar saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Sair");

        Scanner scanner = new Scanner(System.in);
        int acao = -1;
        if (scanner.hasNextInt()) {
            acao = scanner.nextInt();
        } else {
            System.out.println("ERRO: Entrada invalida. Por favor, escolha uma opção valida.");
        }
        if (acao == 1) {
            contabancaria minhaconta = new contabancaria();
            minhaconta.getSaldo();
            mainsystem();
        } else if (acao == 2) {
            contabancaria minhaconta = new contabancaria();
            minhaconta.depositar();
            mainsystem();
        } else if (acao == 3) {
            contabancaria minhaconta = new contabancaria();
            minhaconta.saque();
            mainsystem();
        } else if (acao == 4) {
            contabancaria minhaconta = new contabancaria();
            minhaconta.transferencia();
        }else if (acao == 5){
            System.out.println("Volte sempre!");

        }
        else {
            System.out.println("ERRO: Operação invalida.");
        }
        scanner.close();
    }

}