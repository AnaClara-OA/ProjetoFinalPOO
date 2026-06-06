package br.inatel.cdg.Emprestimos;

import br.inatel.cdg.Clientes.Cliente;
import br.inatel.cdg.Excecoes.EmprestimoJaDevolvido;
import br.inatel.cdg.Livros.Livro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {

    private final int id;
    private Cliente cliente;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    private LocalDate dataDevolucaoReal;
    private boolean devolvido;

    public Emprestimo(int id, Cliente cliente, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista) {

        this.id = id;
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.devolvido = false;

        livro.emprestar();
    }

    public void realizarDevolucao(LocalDate dataDevolucao) {

        if (devolvido) {
            throw new EmprestimoJaDevolvido(
                    "O empréstimo " + id + " já foi devolvido."
            );
        }

        this.dataDevolucaoReal = dataDevolucao;
        this.devolvido = true;

        livro.devolver();
    }

    public boolean estaAtrasado() {

        LocalDate referencia = devolvido ? dataDevolucaoReal : LocalDate.now();
        return referencia.isAfter(dataDevolucaoPrevista);
    }

    public long diasAtraso() {

        if (!estaAtrasado()) {
            return 0;
        }

        LocalDate referencia = devolvido ? dataDevolucaoReal : LocalDate.now();
        return ChronoUnit.DAYS.between(dataDevolucaoPrevista, referencia);
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void exibirInformacoes() {

        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Data do Empréstimo: " + dataEmprestimo);
        System.out.println("Devolução Prevista: " + dataDevolucaoPrevista);
        System.out.println("Devolvido: " + (devolvido ? "Sim (" + dataDevolucaoReal + ")" : "Não"));
    }
}
