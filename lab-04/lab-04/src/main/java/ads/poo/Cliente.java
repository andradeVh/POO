package ads.poo;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String email;
    private ArrayList<Endereco> enderecos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.enderecos = new ArrayList<>();
    }

    public void adicionarEndereco(Endereco endereco) {
        if (endereco != null) {
            this.enderecos.add(endereco);
        }
    }

    public void fazerPedido(){
        // Lógica para iniciar a criação de um objeto Pedido
        System.out.println(nome + " está realizando um novo pedido.");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
}
