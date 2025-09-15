public class financeiro{
    public static void main(String[] args){
    }

    public static int deposito(int a, int saldo){
        int depositado = a + saldo;
        return depositado;
    }

    public static int retirada(int b, int saldo){
        int retirado = b - saldo;
        return retirado;
    }
}