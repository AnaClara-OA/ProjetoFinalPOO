package br.inatel.cdg.Emprestimos;

public class MultaPorAtraso extends Multa {

    private final double valorPorDia;

    public MultaPorAtraso(Emprestimo emprestimo, double valorPorDia) {
        super(emprestimo);
        this.valorPorDia = valorPorDia;
    }

    @Override
    public double calcularValor() {
        return emprestimo.diasAtraso() * valorPorDia;
    }

    @Override
    public void exibirInformacoes() {

        System.out.println("Tipo: Multa por Atraso");
        System.out.println("Empréstimo ID: " + emprestimo.getId());
        System.out.println("Cliente: " + emprestimo.getCliente().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Dias de Atraso: " + emprestimo.diasAtraso());
        System.out.println("Valor por Dia: R$ " + valorPorDia);
        System.out.printf("Valor Total: R$ %.2f%n", calcularValor());
    }
}
