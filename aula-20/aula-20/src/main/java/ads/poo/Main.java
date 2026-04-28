package ads.poo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private Agenda agenda;
    private Scanner scanner;

    public Main() {
        this.agenda = new Agenda();
        this.scanner = new Scanner(System.in);

    }

    static void main(String[] args) {
        Main aplicativo = new Main();
        aplicativo.menu();

    }

    public void menu() {
        int opcao;
        do {
            IO.println();
            opcao = Integer.parseInt(IO.readln("""
                    ..:: Menu ::..
                     1 - Cadastrar contato
                     2 - Listar contatos
                     3 - Buscar contato
                     4 - Remover contato
                     5 - Gerenciar dados
                     6 - Sair
                    """));

            switch (opcao) {
                case 1 -> cadastrarContato();
                case 2 -> System.out.println(agenda.toString());
                case 3 -> buscarContato();
                case 4 -> removerContato();
                case 5 -> gerenciarDado();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

    }

    private void cadastrarContato() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var nome = IO.readln("Nome: ");
        var sobrenome = IO.readln("Sobrenome: ");
        var dataStr = IO.readln("Data de Nascimento (dd/mm/aaaa): ");

        LocalDate data = LocalDate.parse(dataStr, formato);

        Contato novo = new Contato(nome, sobrenome, data);
        agenda.addContato(novo);

    }



    private void buscarContato() {
        var nome = IO.readln("Nome para busca: ");
        var sobrenome = IO.readln("Sobrenome para busca: ");
        System.out.println(agenda.findContato(nome, sobrenome));
    }

    private void removerContato() {
        System.out.print("Informe o índice do contato para remover: ");
        int idx = Integer.parseInt(scanner.nextLine());
        if (agenda.removeContato(idx)) {
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void gerenciarDado() {

    }
}