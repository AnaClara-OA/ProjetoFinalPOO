package br.inatel.cdg.Arquivos;

import br.inatel.cdg.Livros.Livro;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArquivoLivros {

    public static void salvarLivros(List<Livro> livros) {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("livros.txt")
                    );

            for (Livro livro : livros) {

                writer.write(
                        "Código: " + livro.getCodigo()
                                + " | Título: " + livro.getTitulo()
                                + " | Autor: " + livro.getAutor()
                                + " | Quantidade: " + livro.getQuantidade()
                );

                writer.newLine();
            }

            writer.close();

            System.out.println(
                    "Livros salvos com sucesso!"
            );

        } catch (IOException e) {

            System.out.println(
                    "Erro ao salvar arquivo."
            );
        }
    }
}

