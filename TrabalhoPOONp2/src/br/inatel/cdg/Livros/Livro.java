package br.inatel.cdg.Livros;

import br.inatel.cdg.Excecoes.ItemIndisponivel;
import br.inatel.cdg.Excecoes.QuantidadeInvalida;
import br.inatel.cdg.Interfaces.Gerenciavel;
import br.inatel.cdg.Excecoes.EstoqueInsuficiente;

public class Livro extends ItemBiblioteca implements Gerenciavel {

    private final String autor;
    private final Categoria categoria;
    private final int paginas;

    private int quantidade;

    public Livro(int codigo, String titulo, String autor, Categoria categoria, int paginas, int quantidade) {

        super(codigo, titulo);

        this.autor = autor;
        this.categoria = categoria;
        this.paginas = paginas;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void emprestar() {

        if (quantidade <= 0) {

            throw new ItemIndisponivel(
                    titulo +
                            " não possui livros disponíveis."
            );
        }
        quantidade--;
    }

    @Override
    public void devolver() {
        quantidade++;
    }

    @Override
    public void exibirInformacoes() {

        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria.getNome());
        System.out.println("Páginas: " + paginas);
        System.out.println("Quantidade: " + quantidade);
    }

    public void removerQuantidade(int quantidadeRemover) {

        if (quantidadeRemover <= 0) {
            throw new QuantidadeInvalida( "Quantidade inválida.");
        }

        if (quantidadeRemover > quantidade) {

            throw new EstoqueInsuficiente(
                    "Estoque insuficiente para remover " + quantidadeRemover + " unidades."
            );
        }
        quantidade -= quantidadeRemover;
    }
    public String getAutor() {
        return autor;
    }
}