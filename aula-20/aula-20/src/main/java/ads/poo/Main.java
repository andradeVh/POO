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

    public static void main(String[] args) {
        Main aplicativo = new Main();
        aplicativo.menu();

    }

    public void menu() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- GERENCIADOR DE AGENDA ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Todos os Contatos");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Remover Contato");
            System.out.println("5. Adicionar Telefone a um Contato");
            System.out.println("6. Adicionar Email a um Contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                processarOpcao(opcao);
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida.");
            }
        }
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> cadastrarContato();
            case 2 -> System.out.println(agenda.toString());
            case 3 -> buscarContato();
            case 4 -> removerContato();
            case 5 -> gerenciarDado(true); // true para telefone
            case 6 -> gerenciarDado(false); // false para email
            case 0 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida!");
        }
    }
/*
    private void cadastrarContato() {
        var nome = IO.readln("Nome: ");
        var sobrenome = IO.readln("Sobrenome: ");
        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        var dataStr = IO.readln("Data de Nascimento (dd/mm/aaaa): ");
        var telefone = IO.readln("Telefone: ");
        var email = IO.readln("Email: ");

        try {
            LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            // Agora passamos as Strings, e o construtor do Contato cuida de criar os objetos
            Contato novo = new Contato(nome, sobrenome, data, telefone, email);

            if (agenda.addContato(novo)) {
                System.out.println("Contato adicionado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Erro na data ou nos dados informados.");
        }
    }

 */

    private void buscarContato() {
        System.out.print("Nome para busca: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome para busca: ");
        String sobrenome = scanner.nextLine();
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

    private void gerenciarDado(boolean ehTelefone) {
        System.out.print("Índice do contato: ");
        int idx = Integer.parseInt(scanner.nextLine());
        System.out.print("Rótulo (ex: Celular, Trabalho): ");
        String rotulo = scanner.nextLine();
        System.out.print("Valor: ");
        String valor = scanner.nextLine();

        boolean sucesso = ehTelefone ?
                agenda.addTelefone(rotulo, valor, idx) :
                agenda.addEmail(rotulo, valor, idx);

        if (sucesso) System.out.println("Dado adicionado!");
        else System.out.println("Falha ao adicionar (índice ou rótulo repetido).");
    }
}