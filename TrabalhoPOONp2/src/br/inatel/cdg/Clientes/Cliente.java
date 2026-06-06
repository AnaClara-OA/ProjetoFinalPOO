package br.inatel.cdg.Clientes;

public class Cliente extends Pessoa {

    private String cpf;

    public Cliente(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void exibirInformacoes() {

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
