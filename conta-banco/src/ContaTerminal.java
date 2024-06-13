import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Conhecer e importar a Calsse Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            //Exibir as mensagens para o usuário 
            System.out.print("Por favor, digite o número da conta: ");
            int accountNumber = scanner.nextInt();

            // Obter pela classe scanner os valores  digitados no terminal
            scanner.nextLine();

            System.out.print("Por favor, digite o número da agência: ");
            String agencyNumber = scanner.nextLine();

            System.out.print("Por favor, digite o nome do cliente: ");
            String customerName = scanner.nextLine();

            System.out.print("Por favor, digite o saldo da conta: ");
            double balance = scanner.nextDouble();

            //Exibir a mensagem final
            System.out.println("\nOlá " + customerName + ", obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é " + agencyNumber + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.");
        }
    }
}
    

