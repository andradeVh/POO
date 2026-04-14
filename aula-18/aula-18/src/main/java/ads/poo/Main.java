package ads.poo;
public class Main {
    static void main(String[] args) {
        Motor simples = new Motor();
        // Agregação
        Carro fusca = new Carro("VW", simples);
        fusca = null;
        Carro ferrari = new Carro("Ferrari", simples);

        // Composição

        Livro livro = new Livro("Java", new Pessoa("Cleito", 22));

        livro.adicionaCapitulo("Introdução");
        livro.adicionaCapitulo("Fundamentos");
        livro.adicionaCapitulo("Conclusões");

        IO.println(livro);
        }
    }

