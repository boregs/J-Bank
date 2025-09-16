import java.util.Scanner;
public class transactions {
    public static String destination(){
        return null;
    }

    public static String transferencia(){
        System.out.println("--- Como deseja enviar o dinheiro? ---");
        System.out.println("1. Pix");
        System.out.println("2. Transferencia");

        Scanner scanner = new Scanner(System.in);
        System.out.print(": ");
        int escolha = scanner.nextInt();

        if (escolha == 1){
            String selecionado = "Pix";
            System.out.print("Voce escolheu: " + selecionado);
        }
        else if(escolha == 2){
            String selecionado = "Transferencia";
            System.out.print("Voce escolheu: " + selecionado);
        }
        else{
            System.out.println("Escolha invalida. Selecione uma transferencia valida.");
            transferencia();
        }

        System.out.println("--- Qual seria o destinatario da transferencia? ---");
        String destino = scanner.nextLine();
        System.out.println("Destinatario selecionado: " + destino);

        System.out.println("--- Quanto deseja transferir? ---");
        int valor = scanner.nextInt();
        System.out.println("Valor selecionado: " + valor);

        System.out.println(" transferidos para com sucesso!" + valor + destino);
        financeiro.retirada(valor, Main.balance());

        scanner.close();
        return transferencia();
        
    }
}
