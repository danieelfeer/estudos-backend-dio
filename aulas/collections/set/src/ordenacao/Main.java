package ordenacao;

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1,"SmartTV", 5200d, 4);
        cadastroProduto.adicionarProduto(2,"Alexa", 2400d, 10);
        cadastroProduto.adicionarProduto(3,"Iphone 13", 890 0d, 1);
        cadastroProduto.adicionarProduto(4,"Smartwatch", 10232d, 2);

        System.out.println("Produtos ordenado por nome:");
        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println("Produtos ordenado por preco:");
        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}
