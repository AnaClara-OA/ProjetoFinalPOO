package br.inatel.cdg.Emprestimos;

import br.inatel.cdg.Interfaces.Penalizavel;

public abstract class Multa implements Penalizavel {

    protected Emprestimo emprestimo;

    public Multa(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public abstract void exibirInformacoes();
}
