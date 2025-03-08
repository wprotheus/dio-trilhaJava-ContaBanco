import java.util.Scanner;

public class ContaTerminal {
    private static int numConta;
    private static String nomeAgencia;
    private static String nomeCliente;
    private static float saldo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do conta: ");
        nomeAgencia = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Digite o saldo do conta: ");
        saldo = sc.nextFloat();

        System.out.println("\nOlá \'" + nomeCliente.toUpperCase() + "\', obrigado por criar uma conta em nosso banco, \n"
                + "o nome de sua agência é \'" + nomeAgencia.toUpperCase() + "\'," +
                "\no número de sua conta é \'" + numConta + "\'," +
                "\nseu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}