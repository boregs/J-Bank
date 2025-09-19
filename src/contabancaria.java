import java.util.Scanner;
public class contabancaria {
   private double saldo;

   public double getSaldo(){
       saldo = 0;
       System.out.println("Seu saldo é: " + saldo);
       return saldo;
   }

   public void deposito(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Valor do deposito: ");
       int valor = scan.nextInt();
       if (valor >= 0){
           saldo += valor;
           System.out.println("Deposito realizado com sucesso!");
       } else{
           System.out.println("Digite um valor valido para deposito.");
       }
       System.out.println("Seu saldo agora é: " + saldo);
   }

    public void saque(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor do saque: ");
        int valor = scan.nextInt();
       if (valor >= 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso realizado com sucesso!");
            System.out.println("Seu saldo agora é: " + saldo);
        } else if(valor > saldo){
            System.out.println("Valor de saque maior que saldo da conta.");
        }else{
            System.out.println("Digite um valor valido para sacar.");
        }
    }
}
