import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String cliente;
        float saldo;

        System.out.println("Por favor, digite o número da sua conta corrente de quatro dígitos:");
        conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora, informe sua agência com o dígito separado por hífen:");
        agencia = scanner.nextLine();
        System.out.println("Obrigado. Por favor, informe seu nome completo:");
        cliente = scanner.nextLine();
        System.out.println("Por fim, digite o seu saldo bancário:");
        saldo = scanner.nextFloat();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",
                cliente, agencia, conta, saldo);
    }
}
