import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class QuedaConexao {

        // TODO: Preencha a função para verificar queda de conexão
        public static String verificarQuedaConexao(String[] velocidades) {

            boolean contemZero = Arrays.stream(velocidades).mapToInt(Integer::parseInt)
                    .anyMatch(n -> n == 0);

            if(contemZero){
                return "Queda de Conexao";
            } else {
               return "Sem Quedas" ;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
            String input = scanner.nextLine();

            // Convertendo a entrada em uma lista de strings
            String[] velocidades = input.split(",");

            // Verificando se houve queda de conexão
            String resultado = verificarQuedaConexao(velocidades);

            // Exibindo o resultado da verificação
            System.out.println(resultado);

            scanner.close();
        }
}
