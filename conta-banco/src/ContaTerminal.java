import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("Olá! Digite seu nome Completo");
        nomeCliente = leitura.nextLine();

        System.out.println("Digite o número da sua conta: ");
        numero = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite o número da sua agência: ");
        agencia = leitura.nextLine();

        System.out.println("Digite a quantidade do seu saldo: ");
        saldo = leitura.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        leitura.close();
    
    }
}
