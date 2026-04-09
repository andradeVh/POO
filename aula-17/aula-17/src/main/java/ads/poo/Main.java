package ads.poo;

import java.util.HashMap;

public class Main {

    private HashMap<String, Livro> listaLivros;

    public Main() {
        // No construtor dessa classe já crie 4 livros e adicione no acervo
        this.listaLivros = new HashMap<>();
        listaLivros.put("123.123.123", new Livro("a", "123.123.123", "Juca", 1920));
        listaLivros.put("123.123.124", new Livro("b", "123.123.123", "Maria", 2020));
        listaLivros.put("123.123.125", new Livro("c", "123.123.123", "Joao", 1623));
        listaLivros.put("123.123.126", new Livro("d", "123.123.123", "Josué", 1822));


        // pessoas.put("123", new Pessoa("Juca", 35));
    }


    void menu() {
        int opcao;
        do {
            IO.println();
            opcao = Integer.parseInt(IO.readln("""
                    ..:: Menu ::..
                     1 - Cadastrar conta
                     2 - Listar contas
                     3 - Depositar
                     4 - Sacar
                     5 - Sair
                    """));

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    // listarLivrosAno();
                    break;
                case 4:
                    // alterarDadosLivro();
                    break;
                case 5:
                    IO.println("Encerrando sistema!");
                    break;
                default:
                    IO.println("Opção inválida. Tente novamente");
                    break;
            }
        } while (opcao != 5);
    }

    void cadastrar() {
        var titulo = IO.readln("Título do livro: ");
        var autor = IO.readln("Autor do livro: ");
        var ISBN = IO.readln("ISBN do livro: ");
        var ano = Integer.parseInt(IO.readln("Ano de publicação: "));

        /* Criando uma conta nova */
        Livro livro = new Livro(titulo, autor, ISBN, ano);

        /* Guardando a conta dentro da lista */
        listaLivros.put(ISBN, new Livro(titulo, ISBN, autor, ano));

        IO.println("Livro cadastrado com sucesso!");
    }

    void listarLivros(){
        listaLivros.forEach((ISBN, livro  ) -> {
            System.out.println("ISBN: " + livro.getISBN());
            System.out.println("Título: " + livro.getTitulo());
        });
    }


    static void main(String[] args) {

        Main main = new Main();
        main.menu();
        // Sistema de uma livraria para gestão de acervo
        // 1 - Cadastrar livro
        // 2 - Listar todos os livros
        // 3 - Listar todos os livros publicados em um ano específico
        // 4 - Alterar dados de um livro
        // 5 - Sair
        }

}

