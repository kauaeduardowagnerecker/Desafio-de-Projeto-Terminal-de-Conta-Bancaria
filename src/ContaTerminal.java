import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, insira o número da agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, insira o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, insira seu saldo!");
        float saldo = scanner.nextFloat();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.", nome, agencia, numeroConta, saldo));

        scanner.close();
    }
}
