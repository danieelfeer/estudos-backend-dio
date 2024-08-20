package main;
import model.Iphone;

public class MeuIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecinarMusica("Viva la vida");

        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        meuIphone.exibirPagina("github.com");

        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

    }
}
