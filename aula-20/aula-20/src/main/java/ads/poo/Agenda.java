package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato (Contato c){
        if (c != null) {
            return contatos.add(c);
        }
        return false;
    }


    public ArrayList<Contato> findContato(String nome, String sobreNome) {
        ArrayList<Contato> resultados = new ArrayList<>();
        for (Contato c : contatos) {
            // Aqui você pode decidir se a busca deve ser case-sensitive ou não
            // Exemplo usando equalsIgnoreCase para facilitar a busca
            if (c.toString().toLowerCase().contains(nome.toLowerCase()) &&
                    c.toString().toLowerCase().contains(sobreNome.toLowerCase())) {
                resultados.add(c);
            }
        }
        return resultados;
    }

    public boolean removeContato(int indiceContatoNaLista) {
        if (indiceContatoNaLista >= 0 && indiceContatoNaLista < contatos.size()) {
            contatos.remove(indiceContatoNaLista);
            return true;
        }
        return false;
    }

    private boolean isIndiceValido(int indice) {
        return indice >= 0 && indice < contatos.size();
    }

    public boolean addTelefone(String rotulo, String valor, int indice) {
        if (isIndiceValido(indice)) {
            return contatos.get(indice).addTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean updateTelefone(String rotulo, String valor, int indice) {
        if (isIndiceValido(indice)) {
            return contatos.get(indice).updateTelefone(rotulo, valor);
        }
        return false;
    }

    public boolean removeTelefone(String rotulo, int indice) {
        if (isIndiceValido(indice)) {
            return contatos.get(indice).removeTelefone(rotulo);
        }
        return false;
    }

    public boolean addEmail(String rotulo, String valor, int indice) {
        if (isIndiceValido(indice)) {
            return contatos.get(indice).addEmail(rotulo, valor);
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String valor, int indice) {
        if (isIndiceValido(indice)) {
            return contatos.get(indice).updateEmail(rotulo, valor);
        }
        return false;
    }

    public boolean removeEmail(String rotulo, int indice) {
        if (isIndiceValido(indice)) {
            return contatos.get(indice).removeEmail(rotulo);
        }
        return false;
    }

    @Override
    public String toString() {
        if (contatos.isEmpty()) {
            return "Agenda vazia.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("########## MINHA AGENDA ##########\n");
        for (int i = 0; i < contatos.size(); i++) {
            sb.append("Índice: ").append(i).append("\n");
            sb.append(contatos.get(i).toString()).append("\n\n");
        }
        return sb.toString();
    }
}
