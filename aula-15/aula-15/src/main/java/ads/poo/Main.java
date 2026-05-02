package ads.poo;

import java.util.ArrayList;

public class Main {

    /* definindo a variável contas, ela será uma lista dinâmica
    <Conta> indica que esta lista foi criada para guardar objeto Conta */
    private ArrayList<Conta> listaContas;

    // Construtor prepara o objeto pra uso
    public Main() {
        this.listaContas = new ArrayList<>();
        // crie uma lista vazia de contas e guarde dentro do Main
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
                    listarContas();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
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
        var titular = IO.readln("Nome do titular: ");
        var numero = IO.readln("Número da conta: ");
        var saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        /* Criando uma conta nova */
        Conta conta = new Conta(titular, numero, saldo);

        /* Guardando a conta dentro da lista */
        listaContas.add(conta);

        IO.println("Conta cadastrada com sucesso!");
    }

    void listarContas() {

        // Verifica se a lista está vazia
        if (listaContas.isEmpty()) {
            IO.println(String.format("Nenhuma conta registrada"));
            return;
        }

        /* Para cada conta da lista, mostra ela na tela
        c é o item atual da lista (conta1, conta2...) */
        for (Conta c : listaContas) {
            IO.println(c.toString());
        }
    }

//    Descobrir qual conta o usuário quer
//    Encontrar essa conta na lista
//    Fazer o depósito nela

    void depositar() {
        String numero = IO.readln("Número da conta: ");

        /* for passa por TODAS as contas */
        for (Conta c : listaContas) {
            // Se o número dessa conta for igual ao número digitado
            if (c.getNumero().equals(numero)) {
                double valor = Double.parseDouble(IO.readln("Valor de Depósito? "));

                if (!(valor <= 0)) {
                    IO.println("Valor inválido!");
                } else {
                    c.depositar(valor); // Conta c, adiciona esse valor no saldo
                    IO.println(String.format("Depósito de %.2f realizado!", valor));
                    IO.println(String.format("Saldo atual: %.2f", c.getSaldo()));
                }

                c.depositar(valor); // Conta c, adiciona esse valor no saldo
                IO.println(String.format("Depósito de %.2f realizado!", valor));
                IO.println(String.format("Saldo atual: %.2f", c.getSaldo()));
                return;
            }
        }
        IO.println("Conta não encontrada!");
    }

    // todo ajustar output de saldo insuficiente
    void sacar() {
        String numero = IO.readln("Número da conta: ");

        // Para cada Conta 'c' dentro de conta
        for (Conta c : listaContas) {
            if (c.getNumero().equals(numero)) {
                double valor = Double.parseDouble(IO.readln("Valor do Saque? "));
                if (valor <= 0) {
                    IO.println("Valor inválido!");
                } else if (valor > c.getSaldo()) {
                    IO.println("Saldo insuficiente!");
                } else {
                    c.sacar(valor); // Conta c, subtrai esse valor no saldo
                    IO.println(String.format("Saque de %.2f realizado!", valor));
                    IO.println(String.format("Saldo atual: %.2f", c.getSaldo()));
                }
                return;
            }
        }
        IO.println("Conta não encontrada!");
    }

    static void main(String[] args) {
        Main main = new Main();
        main.menu();


        // ..:: Menu ::..
        // 1 - Cadastrar conta
        // 2 - Listar todas as contas
        // 3 - Depositar numa conta
        // 4 - sacar de uma conta
        // 5 - Sair


    }
}