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
                     5 - Gerenciar contato
                     6 - Sair
                    """));

            switch (opcao) {
                case 1 -> cadastrarContato();
                case 2 -> System.out.println(agenda.toString());
                case 3 -> buscarContato();
                case 4 -> removerContato();
                case 5 -> gerenciarContato();
                case 6 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

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

    private void gerenciarContato() {
        int opcao;
        boolean ehTelefone = false;
        opcao = Integer.parseInt(IO.readln("""
                    --- Gerenciar Contato ---
                    Gerenciar Telefone ou Email?
                     1 - Telefone
                     2 - Email
                     3 - Sair
                    """));

        if (opcao == 1 || opcao == 2) {
            if (opcao == 1){
                ehTelefone = true;
            }
        } else {
            menu();
        }



        String tipo = ehTelefone ? "Telefone" : "Email";

        try {
            int idx = Integer.parseInt(IO.readln("Digite o índice do contato: "));
            System.out.println("1. Adicionar novo " + tipo);
            System.out.println("2. Atualizar " + tipo + " existente");
            System.out.println("3. Remover " + tipo);
            int operacao = Integer.parseInt(IO.readln("Escolha a operação: "));

            String rotulo = IO.readln("Rótulo (ex: Celular, Trabalho, Pessoal): ");
            boolean sucesso = false;

            switch (operacao) {
                case 1 -> {
                    String valor = IO.readln("Digite o " + tipo + ": ");
                    sucesso = ehTelefone ?
                            agenda.addTelefone(rotulo, valor, idx) :
                            agenda.addEmail(rotulo, valor, idx);
                }
                case 2 -> {
                    String valor = IO.readln("Digite o novo " + tipo + ": ");
                    sucesso = ehTelefone ?
                            agenda.updateTelefone(rotulo, valor, idx) :
                            agenda.updateEmail(rotulo, valor, idx);
                }
                case 3 -> {
                    sucesso = ehTelefone ?
                            agenda.removeTelefone(rotulo, idx) :
                            agenda.removeEmail(rotulo, idx);
                }
                default -> System.out.println("Operação inválida.");
            }

            if (sucesso) {
                System.out.println("Operação realizada com sucesso!");
            } else {
                System.out.println("Falha: Verifique se o índice é válido ou se o rótulo existe/já foi usado.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: Você deve digitar um número para o índice e para a operação.");
        }
    }
}