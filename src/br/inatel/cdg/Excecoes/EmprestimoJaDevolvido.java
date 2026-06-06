package br.inatel.cdg.Excecoes;

public class EmprestimoJaDevolvido extends RuntimeException {

    public EmprestimoJaDevolvido(String mensagem) {
        super(mensagem);
    }
}
