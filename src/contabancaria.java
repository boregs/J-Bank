import java.util.Scanner;
public class contabancaria {
   private double saldo;

   public double getSaldo(){
       saldo = 0;
       System.out.println("Seu saldo é: " + saldo);
       return saldo;
   }

   //depositar na conta
   public void depositar(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Valor do deposito: ");
       double valor = scan.nextInt();
       if (valor >= 0){
           saldo += valor;
           System.out.println("Deposito realizado com sucesso!");
       } else{
           System.out.println("Digite um valor valido para deposito.");
       }
       System.out.println("Seu saldo agora é: " + saldo);
   }
   //sacar dinheiro da conta
    public void saque(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor do saque: ");
        double valor = scan.nextInt();
       if (valor >= 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo agora é: " + saldo);
        } else if(valor > saldo){
            System.out.println("Valor de saque maior que saldo da conta.");
        }else{
            System.out.println("Digite um valor valido para sacar.");
        }
    }
    // transferir dinheiro para alguem
    public void transferencia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("---- Escolha o Método de transferencia: ----");
        System.out.println("1. Pix ");
        System.out.println("2. Transferencia comum ");

        int transfmetod = scan.nextInt();
        if(transfmetod == 1){
            System.out.println("Método: Pix");
        } else if(transfmetod == 2){
            System.out.println("Método: Transferencia Comum");
        } else {
            System.out.println("ERRO: Escolha um metodo de transferencia disponivel.");
        }

        System.out.println("Destinatario: ");
        String destinatario = scan.nextLine(); // isso nao funciona | nao apresenta a parte de digitar o destinatario
                                               // printando tudo e indo direto para o valor
        //System.out.println("Destinatario escolhido: " + destinatario);

        System.out.println("Qual valor deseja transferir: ");
        double valor = scan.nextInt();
        if (valor >= 0){
            saldo -= valor;
            System.out.println("Transferencia de R$" + valor + " para o destinatario " + destinatario + " realizada com sucesso");
            System.out.println("Seu saldo agora é: " + saldo);
        } else if(valor > saldo){
            System.out.println("ERRO: Valor para transferir maior que saldo da conta");
        }else{
            System.out.println("ERRO: Digite um valor valido para transferir.");
        }
    }
}
