package br.inatel.cdg.Excecoes;

public class ItemNaoEncontrado extends RuntimeException {

    public ItemNaoEncontrado(String mensagem) {
        super(mensagem);
    }

}