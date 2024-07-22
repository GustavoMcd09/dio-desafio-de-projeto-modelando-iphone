package celular;

import celular.funcionalidades.AparelhoTelefonico;
import celular.funcionalidades.NavegadorInternet;
import celular.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA");
        System.out.println("MÚSICA SELECIONADA: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA " + url);
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("ADCIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO " + numero);
    }

    @Override
    public void atender() {
        System.out.println("RECEBENDO LIGAÇÃO");
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    
}
