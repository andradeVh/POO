package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.Font;
import java.util.ArrayList;

public class CartaGUI extends Carta {
    private double x;
    private double y;
    private static final double LARGURA = 90;
    private static final double ALTURA = 130;
    private boolean viradaParaBaixo;

    public CartaGUI(Naipe naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.x = x;
        this.y = y;
        this.viradaParaBaixo = false;
    }

    // Retorna a imagem correta baseada nos seus Enums
    // exemplo: "cartas/1p.png"
    public String getImagemAtual() {
        if (this.viradaParaBaixo) {
            // Se o naipe for Copas ('c') ou Ouros ('o'), retorna fundo vermelho, senão azul
            return (this.getNaipe().inicial == 'c' || this.getNaipe().inicial == 'o') ? "cartas/fundov.png" : "cartas/fundoa.png";
        }
        // Se estiver para cima, monta o caminho usando os atributos públicos dos seus Enums
        return String.format("cartas/%s%c.png", this.getValor().inicial, this.getNaipe().inicial);
    }

    public void desenhar(Draw draw) {
        draw.picture(x, y, getImagemAtual());
    }

    public boolean foiClicada(double mouseX, double mouseY) {
        return mouseX >= x - LARGURA / 2 && mouseX <= x + LARGURA / 2
                && mouseY >= y - LARGURA / 2 && mouseY <= y + LARGURA / 2;
    }

    public void virarCarta() {
        this.viradaParaBaixo = !this.viradaParaBaixo;
    }
}
// this.draw.clear(Draw.WHITE);
//
/// / Título da interface
//        this.draw.setPenColor(Draw.PRINCETON_ORANGE);
//        this.draw.setFont(new Font("Arial", Font.BOLD, 30));
//        this.draw.text(600, 580, "Mesa de Cartas");
//
//// Lógica matemática do grid movida para a interface gráfica
//int posicaoX;
//int posicaoY = canvasY - 120;
//int contador = 0;
//
//        for (Naipe naipe : Naipe.values()) {
//posicaoX = 40;
//posicaoY -= 100;
//
//        for (Valor valor : Valor.values()) {
//posicaoX += 80;
//
//Carta carta = cartasNaMesa.get(contador);
//                this.draw.picture(posicaoX, posicaoY, carta.getImagemAtual());
//
//contador++;
//        }
//        }
//
//        this.draw.show();