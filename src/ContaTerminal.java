
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeCliente;

        System.out.println("Prezado cliente, a VBANK agradece sua preferência! \n");
        System.out.println("\nPor favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("\nDigite agora o número da agência: ");
        String agencia = scanner.next();

        System.out.println("\nDigite seu nome: ");
        nomeCliente = scanner.nextLine();
        nomeCliente = scanner.nextLine();

        System.out.println("\nDigite o seu saldo (utilize ponto para decimais): ");
        Float saldo = scanner.nextFloat();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.\n");

        scanner.close();





    }
    
}
