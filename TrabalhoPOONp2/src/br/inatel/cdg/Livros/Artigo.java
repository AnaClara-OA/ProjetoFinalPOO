package br.inatel.cdg.Livros;

import br.inatel.cdg.Livros.ItemBiblioteca;

public class Artigo extends ItemBiblioteca {

    private final String autor;
    private final String revista;
    private final int paginas;

    public Artigo(int codigo, String titulo, String autor, String revista, int paginas) {

        super(codigo, titulo);

        this.autor = autor;
        this.revista = revista;
        this.paginas = paginas;
    }

    @Override
    public void exibirInformacoes() {

        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Revista: " + revista);
        System.out.println("Páginas: " + paginas);
    }
}