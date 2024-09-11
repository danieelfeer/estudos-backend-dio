import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class VelocidadeMedia {


    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        double soma = Arrays.stream(velocidades).mapToDouble(Double::parseDouble).sum();
        double media = soma / velocidades.length;

        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int) velocidadeMedia + " Mbps");

        scanner.close();
    }
}
