package celular;

import celular.browser.WebInternet;
import celular.call.CallTelefonica;
import celular.reprodutorMusical.Musical;

public class iPhone implements WebInternet, CallTelefonica, Musical {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        meuIphone.ligar("21 98765-4321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.SelecionarMusica("Strangers");

        meuIphone.exibirPagina("https://www.youtube.com/watch?v=B9synWjqBn8");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Música iniciada!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
