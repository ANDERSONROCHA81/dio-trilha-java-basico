import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome!");
        String nomeCliente = leitor.nextLine();

        System.out.println("Por favor, informe o número da agência!");
        int agencia = leitor.nextInt();

        System.out.println("Por favor, informe o número da conta!");
        int conta = leitor.nextInt();

        System.out.println("Por favor, informe o seu saldo!");
        double saldo = leitor.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);
    }
}
