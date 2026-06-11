package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.awt.*;
import java.util.ArrayList;

public class App implements DrawListener {
    private final ArrayList<CartaGUI> cartasNaMesa = new ArrayList<>();
    private final Draw draw;

    private final int canvasX = 1400;
    private final int canvasY = 700;

    public App() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(canvasX, canvasY);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

        this.criarCartas();
        this.atualizarTela();
    }

    private void atualizarTela() {
        this.draw.clear(Draw.WHITE);
        this.desenharHUD();
        this.desenharBaralho();
        this.draw.show();
    }

    private void desenharHUD() {
        // Título da interface
        this.draw.setPenColor(Draw.PRINCETON_ORANGE);
        this.draw.setFont(new Font("Arial", Font.BOLD, 30));
        this.draw.text(600, 580, "Mesa de Cartas");
    }

    private void criarCartas() {
// Lógica matemática do grid movida para a interface gráfica
        int posicaoX;
        int posicaoY = canvasY - 120;

        for (Naipe naipe : Naipe.values()) {
            posicaoX = 40;
            posicaoY -= 100;

            for (Valor valor : Valor.values()) {
                posicaoX += 80;

                cartasNaMesa.add(new CartaGUI(naipe, valor, posicaoX, posicaoY));

            }
        }
    }

//    CartaGUI coringaPreto = new CartaGUI(naipe, valor,560, 80);
//                this.cartasNaMesa.add(coringaPreto);
//                this.draw.picture(coringaPreto.getX(), coringaPreto.getY(), coringaPreto.getNomeArquivo());
//
//    CartaGUI coringaVermelho = new CartaGUI("cartas/coringav.png", "cartas/fundov.png", 640, 80);
//                this.cartasNaMesa.add(coringaVermelho);
//                this.draw.picture(coringaVermelho.getX(), coringaVermelho.getY(), coringaVermelho.getNomeArquivo());
//
//                this.draw.picture(560, 80, "cartas/coringap.png");
//                this.draw.picture(640, 80, "cartas/coringav.png");

    private void desenharBaralho() {
        for (CartaGUI c : cartasNaMesa) {
            c.desenhar(draw);
        }

    }

    @Override
    public void mouseClicked(double x, double y) {
        for (CartaGUI c : cartasNaMesa) {
            if (c.foiClicada(x, y)) {
                c.virarCarta();
                break;
            }
        }
        atualizarTela();
    }

    void main(String[] args) {
    }
}