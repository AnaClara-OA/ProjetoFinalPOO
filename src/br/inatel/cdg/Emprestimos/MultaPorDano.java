package br.inatel.cdg.Emprestimos;

public class MultaPorDano extends Multa {

    private final double valorFixo;
    private final String descricaoDano;

    public MultaPorDano(Emprestimo emprestimo, double valorFixo, String descricaoDano) {
        super(emprestimo);
        this.valorFixo = valorFixo;
        this.descricaoDano = descricaoDano;
    }

    @Override
    public double calcularValor() {
        return valorFixo;
    }

    @Override
    public void exibirInformacoes() {

        System.out.println("Tipo: Multa por Dano");
        System.out.println("Empréstimo ID: " + emprestimo.getId());
        System.out.println("Cliente: " + emprestimo.getCliente().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Dano: " + descricaoDano);
        System.out.printf("Valor Total: R$ %.2f%n", calcularValor());
    }
}
