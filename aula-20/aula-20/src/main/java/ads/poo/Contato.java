package ads.poo;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc, Telefone telefone, Email email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone (String rotulo, String valor){
        return telefones.add(rotulo, valor);
    }

    public boolean addEmail (String rotulo, String valor){
        return emails.add(rotulo, valor);
    }

    public boolean removeTelefone (String rotulo){
        return telefones.remove(rotulo);
    }

    public boolean removeEmail (String rotulo){
        return emails.remove(rotulo);
    }

    public boolean updateTelefone (String rotulo, String valor){
        return telefones.update(rotulo, valor);
    }

    public boolean updateEmail (String rotulo, String valor) {
        return emails.update(rotulo, valor);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
