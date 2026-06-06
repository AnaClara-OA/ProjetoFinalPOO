package br.inatel.cdg.Principal;

import br.inatel.cdg.Estoque.Estoque;
import br.inatel.cdg.Livros.Categoria;
import br.inatel.cdg.Livros.Livro;
import br.inatel.cdg.Livros.Artigo;

public class CadastroMateriais {

    public static void carregarLivros(Estoque estoque) {

        Categoria fantasia = new Categoria("Fantasia");
        Categoria romance = new Categoria("Romance");
        Categoria drama = new Categoria("Drama");
        Categoria classico = new Categoria("Classico");
        Categoria misterio = new Categoria("Misterio");
        Categoria terror = new Categoria("Terror");
        Categoria ficcao = new Categoria("Ficcao");

        estoque.cadastrarLivro(
                new Livro(
                        1,
                        "Percy Jackson e o Ladrão de Raios",
                        "Rick Riordan",
                        fantasia,
                        400,
                        10
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        2,
                        "O Fantasma da Ópera",
                        "Gaston Leroux",
                        romance,
                        320,
                        7
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        3,
                        "Romeu e Julieta",
                        "William Shakespeare",
                        romance,
                        250,
                        12
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        4,
                        "As Crônicas de Nárnia",
                        "C.S. Lewis",
                        fantasia,
                        752,
                        8
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        5,
                        "O Senhor dos Anéis",
                        "J.R.R. Tolkien",
                        fantasia,
                        1216,
                        5
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        6,
                        "É Assim que Acaba",
                        "Colleen Hoover",
                        romance,
                        368,
                        15
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        7,
                        "Orgulho e Preconceito",
                        "Jane Austen",
                        romance,
                        424,
                        9
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        8,
                        "Hamlet",
                        "William Shakespeare",
                        drama,
                        336,
                        6
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        9,
                        "Sonho de Uma Noite de Verão",
                        "William Shakespeare",
                        drama,
                        208,
                        8
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        10,
                        "A Odisseia",
                        "Homero",
                        classico,
                        500,
                        4
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        11,
                        "Assassinato no Expresso do Oriente",
                        "Agatha Christie",
                        misterio,
                        288,
                        11
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        12,
                        "Noites Brancas",
                        "Fiódor Dostoiévski",
                        romance,
                        160,
                        10
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        13,
                        "A Menina que Roubava Livros",
                        "Markus Zusak",
                        drama,
                        480,
                        13
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        14,
                        "Triste Fim de Policarpo Quaresma",
                        "Lima Barreto",
                        classico,
                        304,
                        6
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        15,
                        "Memórias Póstumas de Brás Cubas",
                        "Machado de Assis",
                        classico,
                        256,
                        14
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        16,
                        "Sherlock Holmes: Um Estudo em Vermelho",
                        "Arthur Conan Doyle",
                        misterio,
                        224,
                        9
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        17,
                        "A Ilíada",
                        "Homero",
                        classico,
                        560,
                        5
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        18,
                        "Anne de Green Gables",
                        "Lucy Maud Montgomery",
                        romance,
                        320,
                        8
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        19,
                        "O Jardim Secreto",
                        "Frances Hodgson Burnett",
                        drama,
                        288,
                        7
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        20,
                        "Dom Casmurro",
                        "Machado de Assis",
                        classico,
                        256,
                        10
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        21,
                        "Drácula",
                        "Bram Stoker",
                        terror,
                        418,
                        6
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        22,
                        "Frankenstein",
                        "Mary Shelley",
                        terror,
                        280,
                        7
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        23,
                        "Coraline",
                        "Neil Gaiman",
                        fantasia,
                        208,
                        9
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        24,
                        "Jogos Vorazes",
                        "Suzanne Collins",
                        ficcao,
                        400,
                        12
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        25,
                        "1984",
                        "George Orwell",
                        ficcao,
                        416,
                        10
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        26,
                        "O Pequeno Príncipe",
                        "Antoine de Saint-Exupéry",
                        classico,
                        128,
                        20
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        27,
                        "Harry Potter e a Pedra Filosofal",
                        "J.K. Rowling",
                        fantasia,
                        264,
                        18
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        28,
                        "O Hobbit",
                        "J.R.R. Tolkien",
                        fantasia,
                        336,
                        9
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        29,
                        "A Revolução dos Bichos",
                        "George Orwell",
                        ficcao,
                        152,
                        11
                )
        );

        estoque.cadastrarLivro(
                new Livro(
                        30,
                        "Cem Anos de Solidão",
                        "Gabriel García Márquez",
                        drama,
                        448,
                        5
                )
        );
    }

    public static void carregarArtigos(Estoque estoque) {

        estoque.cadastrarArtigo(
                new Artigo(
                        101,
                        "Introdução à Programação Orientada a Objetos",
                        "Christopher Lima",
                        "Revista de Computação",
                        12
                )
        );

        estoque.cadastrarArtigo(
                new Artigo(
                        102,
                        "Inteligência Artificial na Educação",
                        "Ana Souza",
                        "Revista Tecnologia Hoje",
                        8
                )
        );

        estoque.cadastrarArtigo(
                new Artigo(
                        103,
                        "Desenvolvimento Mobile com Flutter",
                        "Carlos Mendes",
                        "Revista Mobile Brasil",
                        15
                )
        );

        estoque.cadastrarArtigo(
                new Artigo(
                        104,
                        "Banco de Dados Relacionais",
                        "Juliana Costa",
                        "Revista Sistemas de Informação",
                        10
                )
        );
    }
}