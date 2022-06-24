import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Por favor, confirme o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, confirme o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        String nomeCompletoCliente = nomeCliente.concat(" "+ sobrenomeCliente).toUpperCase();

        double saldo = 237.48;

        System.out.println("Olá, " + nomeCompletoCliente + ". Obrigado por criar uma conta em nosso banco." +
                " Sua agência é " + agencia + " e seu saldo de R$ " + saldo + " já está disponível para saque.");


    }
}
