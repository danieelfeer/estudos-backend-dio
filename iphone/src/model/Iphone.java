package model;

public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical{
   
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

    @Override
    public void tocar() {
        System.out.println("tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");
    }

    @Override
    public void selecinarMusica(String musica) {
        System.out.println("musica selecionada: " + musica);
    }
    
}
