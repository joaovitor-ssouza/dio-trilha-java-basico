import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Digite o número da conta:");
        int numberBankAccount = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); // consome o ENTER que sobrou
        String numberAgency = scanner.nextLine();

        System.out.println("Digite o seu nome:");
        String name = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
String balanceInput = scanner.next().replace(",", ".");
double balance = Double.parseDouble(balanceInput);


        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
            name, numberAgency, numberBankAccount, balance
        );

        scanner.close();
    }
}
