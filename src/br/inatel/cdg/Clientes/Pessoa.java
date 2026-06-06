package br.inatel.cdg.Clientes;

public abstract class Pessoa {

    protected final int id;
    protected final String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibirInformacoes();
}
