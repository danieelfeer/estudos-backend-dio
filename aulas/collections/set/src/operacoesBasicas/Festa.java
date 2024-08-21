package operacoesBasicas;

public class Festa {
    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Numero de convidados: " + conjuntoConvidado.contarConvidados());

        conjuntoConvidado.adicionarConvidado("operacoesBasicas.Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("operacoesBasicas.Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("operacoesBasicas.Convidado 3", 1236);
        conjuntoConvidado.adicionarConvidado("operacoesBasicas.Convidado 4", 1237);
        conjuntoConvidado.adicionarConvidado("operacoesBasicas.Convidado 5", 1237);

        System.out.println("Numero de convidados: " + conjuntoConvidado.contarConvidados());

        conjuntoConvidado.exibirConvidados();

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1237);

        conjuntoConvidado.exibirConvidados();



    }
}
