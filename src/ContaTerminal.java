import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem final

        /* Declaração das variáveis a serem utilizadas */
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;
        String saldoString;

        /* Criação de objeto Scanner para ler da entrada padrão (console)*/
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Lê o número inteiro digitado pelo usuário
        System.out.println("Por favor, Digite o Numero");
        Numero = scanner.nextInt();

        System.out.println("Por favor, Digite a Agencia");
        Agencia = scanner.next();

        System.out.println("Por favor, Digite a seu Nome");
        // Ler a linha inteira para capturar o nome completo
        scanner.nextLine();
        NomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite a seu Saldo");
        // Lê a entrada como uma string
        saldoString = scanner.next();

        // Converte a string para double
        Saldo = Double.parseDouble(saldoString);


        scanner.close();
        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo "+Double.toString(Saldo)+" já está disponível para saque");

    }

}
