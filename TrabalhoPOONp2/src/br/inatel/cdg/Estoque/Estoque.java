package br.inatel.cdg.Estoque;

import br.inatel.cdg.Livros.Artigo;
import br.inatel.cdg.Excecoes.ItemJaCadastrado;
import br.inatel.cdg.Excecoes.ItemNaoEncontrado;
import br.inatel.cdg.Livros.ItemBiblioteca;
import br.inatel.cdg.Livros.Livro;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private final List<Livro> livros;
    private final List<Artigo> artigos;
    private final List<ItemBiblioteca> itens;

    public Estoque() {

        livros = new ArrayList<>();
        artigos = new ArrayList<>();
        itens = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {

        for (Livro l : livros) {

            if (l.getCodigo() == livro.getCodigo()) {

                throw new ItemJaCadastrado(
                        "Já existe um item cadastrado com o código "
                                + livro.getCodigo()
                );
            }
        }

        livros.add(livro);
        itens.add(livro);
    }

    public void cadastrarArtigo(Artigo artigo) {

        for (Artigo a : artigos) {

            if (a.getCodigo() == artigo.getCodigo()) {

                throw new ItemJaCadastrado(
                        "Já existe um item cadastrado com o código "
                                + artigo.getCodigo()
                );
            }
        }

        artigos.add(artigo);
        itens.add(artigo);
    }

    // NOVO MÉTODO GENÉRICO
    public ItemBiblioteca buscarItem(int codigo) {

        for (ItemBiblioteca item : itens) {

            if (item.getCodigo() == codigo) {
                return item;
            }
        }

        throw new ItemNaoEncontrado(
                "Item com código "
                        + codigo
                        + " não encontrado."
        );
    }

    public Livro buscarLivro(int codigo) {

        for (Livro livro : livros) {

            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }

        throw new ItemNaoEncontrado(
                "Item com código "
                        + codigo
                        + " não encontrado."
        );
    }

    public void listarLivros() {

        for (Livro livro : livros) {

            livro.exibirInformacoes();

            System.out.println("----------------");
        }
    }

    public void listarArtigos() {

        for (Artigo artigo : artigos) {

            artigo.exibirInformacoes();

            System.out.println("----------------");
        }
    }

    public void listarTodosItens() {

        for (ItemBiblioteca item : itens) {

            item.exibirInformacoes();

            System.out.println("----------------");
        }
    }

    public void verificarEstoqueBaixo() {

        for (Livro livro : livros) {

            if (livro.getQuantidade() < 3) {

                System.out.println(
                        "Estoque baixo de " + livro.getTitulo()
                );
            }
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }
}