package br.inatel.cdg.Excecoes;

public class EstoqueInsuficiente extends RuntimeException {

    public EstoqueInsuficiente(String mensagem) {
        super(mensagem);
    }

}