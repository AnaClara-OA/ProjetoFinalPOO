package br.inatel.cdg.Principal;

import br.inatel.cdg.Arquivos.ArquivoLivros;
import br.inatel.cdg.Clientes.Cliente;
import br.inatel.cdg.Emprestimos.Emprestimo;
import br.inatel.cdg.Emprestimos.Multa;
import br.inatel.cdg.Emprestimos.MultaPorAtraso;
import br.inatel.cdg.Emprestimos.MultaPorDano;
import br.inatel.cdg.Estoque.Estoque;
import br.inatel.cdg.Excecoes.EmprestimoJaDevolvido;
import br.inatel.cdg.Excecoes.ItemNaoEncontrado;
import br.inatel.cdg.Excecoes.QuantidadeInvalida;
import br.inatel.cdg.Livros.Livro;
import br.inatel.cdg.Threads.EstoqueThread;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        CadastroMateriais.carregarLivros(estoque);
        CadastroMateriais.carregarArtigos(estoque);

        Cliente cliente1 = new Cliente(
                1,
                "Ana Paula",
                "111.222.333-44"
        );

        Cliente cliente2 = new Cliente(
                2,
                "Carlos Eduardo",
                "555.666.777-88"
        );

        System.out.println("=================================");
        System.out.println("      DADOS DA BIBLIOTECA");
        System.out.println("=================================");
        System.out.println(" ");

        System.out.println(
                "Livros em estoque: "
                        + estoque.getLivros().size()
        );

        System.out.println(
                "Artigos cadastrados: "
                        + estoque.getArtigos().size()
        );

        System.out.println("Clientes cadastrados: 2");
        System.out.println(" ");

        System.out.println("---------------------------------");

        EstoqueThread thread = new EstoqueThread(estoque);

        thread.start();

        ArquivoLivros.salvarLivros(
                estoque.getLivros()
        );

        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("EXEMPLO DE LIVRO");
        System.out.println("---------------------------");

        estoque.buscarLivro(1).exibirInformacoes();

        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("EXEMPLO DE ARTIGO");
        System.out.println("---------------------------");

        estoque.buscarItem(101).exibirInformacoes();

        Livro livroEmprestado1 =
                estoque.buscarLivro(1);

        Livro livroEmprestado2 =
                estoque.buscarLivro(5);

        Emprestimo emprestimo1 =
                new Emprestimo(
                        1,
                        cliente1,
                        livroEmprestado1,
                        LocalDate.now().minusDays(10),
                        LocalDate.now().plusDays(4)
                );

        Emprestimo emprestimo2 =
                new Emprestimo(
                        2,
                        cliente2,
                        livroEmprestado2,
                        LocalDate.now().minusDays(20),
                        LocalDate.now().minusDays(5)
                );

        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("EMPRÉSTIMOS");
        System.out.println("---------------------------");

        emprestimo1.exibirInformacoes();

        System.out.println("----------------");

        emprestimo2.exibirInformacoes();

        emprestimo1.realizarDevolucao(
                LocalDate.now()
        );

        emprestimo2.realizarDevolucao(
                LocalDate.now()
        );

        List<Multa> multas =
                new ArrayList<>();

        multas.add(
                new MultaPorAtraso(
                        emprestimo2,
                        2.50
                )
        );

        multas.add(
                new MultaPorDano(
                        emprestimo1,
                        50.00,
                        "Páginas rasgadas"
                )
        );

        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("MULTAS");
        System.out.println("---------------------------");

        for (Multa multa : multas) {

            multa.exibirInformacoes();

            System.out.println("----------------");
        }

        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("TESTE DE EXCEÇÕES");
        System.out.println("---------------------------");

        try {

            estoque.buscarItem(999);

        } catch (ItemNaoEncontrado e) {

            System.out.println(
                    e.getMessage()
            );
        }

        try {

            Livro livro =
                    estoque.buscarLivro(1);

            livro.removerQuantidade(-5);

        } catch (QuantidadeInvalida e) {

            System.out.println(
                    e.getMessage()
            );
        }

        try {

            emprestimo1.realizarDevolucao(
                    LocalDate.now()
            );

        } catch (EmprestimoJaDevolvido e) {

            System.out.println(
                    e.getMessage()
            );
        }

        try {

            Thread.sleep(15000);

            thread.interrupt();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}