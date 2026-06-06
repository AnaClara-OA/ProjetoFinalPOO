package br.inatel.cdg.Excecoes;

public class ItemIndisponivel extends RuntimeException {

    public ItemIndisponivel(String mensagem) {
        super(mensagem);
    }

}