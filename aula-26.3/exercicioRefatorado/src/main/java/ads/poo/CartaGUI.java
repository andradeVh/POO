package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGUI extends Carta {
    private double x;
    private double y;

    public CartaGUI(Naipe naipe, Valor valor) {
        super(naipe, valor);
    }

    public void desenhar(Draw d){
        // d.picture(1, 1, "imagem/");
        d.show();
    }

}
