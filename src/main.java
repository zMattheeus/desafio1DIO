import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite o numero da agência:");
        agencia = scanner.nextLine();


        System.out.println("Digite o numero da conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); //

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();


        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();


        scanner.close();


        System.out.println("Agência: " + agencia + ", Número da Conta: " + numeroConta + ", Nome do Cliente: " + nomeCliente + ", Saldo: " + saldo);
    }
}
