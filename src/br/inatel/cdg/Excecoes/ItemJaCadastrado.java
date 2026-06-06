package br.inatel.cdg.Excecoes;

public class ItemJaCadastrado extends RuntimeException {

    public ItemJaCadastrado(String mensagem) {
        super(mensagem);
    }

}