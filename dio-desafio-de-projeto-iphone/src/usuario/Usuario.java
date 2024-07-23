package usuario;

import celular.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("(15) 0 0000-0000");
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.adcionarNovaAba();
        iphone.atender();
        iphone.selecionarMusica("Can't Hold Us");
        iphone.tocar();
        iphone.pausar();
    }
}
