//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int acao = 0;

            Account minhaconta = new Account();

            while (acao != 5){
                System.out.println("----- Bem vindo ao JBank! -----");
                System.out.println("----- Como podemos ajudar? -----");
                System.out.println("1. Ver saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Transferir");
                System.out.println("5. Sair");

                if (scanner.hasNextInt()) {
                    acao = scanner.nextInt();
                } else {
                    System.out.println("ERRO: Entrada invalida. Por favor, digite um numero.");
                    scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito
                    continue; // Pula para a próxima iteração do loop
                }

                switch (acao) {
                    case 1:
                        minhaconta.getSaldo();
                        break;
                    case 2:
                        minhaconta.depositar();
                        break;
                    case 3:
                        minhaconta.saque();
                        break;
                    case 4:
                        minhaconta.transferencia();
                        break;
                    case 5:
                        break;
                }
            }
        scanner.close();
    }
}