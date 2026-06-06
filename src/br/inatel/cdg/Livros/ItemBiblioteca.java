package br.inatel.cdg.Livros;

public abstract class ItemBiblioteca {

    protected final int codigo;
    protected final String titulo;

    public ItemBiblioteca(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void exibirInformacoes();
}