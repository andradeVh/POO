package ads.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {
    private HashMap<String, String> dados;

    public Telefone() {
        this.dados = new HashMap<>();
    }

    public boolean add (String rotulo, String valor){
        if(!dados.containsKey(rotulo)){
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

    public String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
