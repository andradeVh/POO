package ads.poo;

import java.util.HashMap;

public class Telefone {
    private HashMap<String, String> dados;

    public Telefone() {
        this.dados = new HashMap<>();
    }

    public boolean add (String rotulo, String valor){
        if(!(dados.containsKey(rotulo))){
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    public boolean remove (String rotulo){
        if(!(dados.containsKey(rotulo))){
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update (String rotulo, String valor){
        if(dados.containsKey(rotulo)){
            dados.put(rotulo, valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
