package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import java.awt.Font;
import java.util.ArrayList;

public class Main implements DrawListener {
    private final ArrayList<Carta> cartasNaMesa = new ArrayList<>();
    private Draw draw;
    int canvasX = 1400;
    int canvasY = 700;

    public Main() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(canvasX, canvasY);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
        popularMesa();
        atualizarTela();
    }

    public void atualizarCarta(){
        this.draw.clear(Draw.WHITE);
        for (Carta carta : cartasNaMesa){
            this.draw.picture(carta.getX(), carta.getY(), carta.getNomeArquivo());
        }
    }

    public void atualizarTela() {
        this.atualizarCarta();
        this.desenharInterface();

        this.draw.show();
    }

    public void desenharInterface() {
        this.draw.setPenColor(Draw.PRINCETON_ORANGE);

        Font minhaFonte = new Font("Arial", Font.BOLD, 30);
        this.draw.setFont(minhaFonte);

        this.draw.text(600, 560, "Mesa de Cartas");

    }

    public void popularMesa() {
        this.draw.clear(Draw.WHITE);

        this.cartasNaMesa.clear();

        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "k", "q"};

        String naipes = "ceop";

        int posicaoX;
        int posicaoY = canvasY - 120;

        // lógica para pôr as cartas em ordem
        for (int i = 0; i < naipes.length(); i++) {
            posicaoX = 40;
            posicaoY -= 100;

            char naipeAtual = naipes.charAt(i);
            String fundoEscolhido;
            if (naipeAtual == 'c' || naipeAtual == 'o') {
                fundoEscolhido = "cartas/fundov.png";
            } else {
                fundoEscolhido = "cartas/fundoa.png";
            }

            for (int j = 0; j < valores.length; j++) {
                posicaoX += 80;

                String carta = String.format("cartas/%s%c.png", valores[j], naipes.charAt(i));

                Carta novaCarta = new Carta(carta, fundoEscolhido, posicaoX, posicaoY);

                this.cartasNaMesa.add(novaCarta);

                this.draw.picture(novaCarta.getX(), novaCarta.getY(), novaCarta.getNomeArquivo());


            }
        }
        Carta coringaPreto = new Carta("cartas/coringap.png", "cartas/fundoa.png",560, 80);
        this.cartasNaMesa.add(coringaPreto);
        this.draw.picture(coringaPreto.getX(), coringaPreto.getY(), coringaPreto.getNomeArquivo());

        Carta coringaVermelho = new Carta("cartas/coringav.png", "cartas/fundov.png", 640, 80);
        this.cartasNaMesa.add(coringaVermelho);
        this.draw.picture(coringaVermelho.getX(), coringaVermelho.getY(), coringaVermelho.getNomeArquivo());

        this.draw.picture(560, 80, "cartas/coringap.png");
        this.draw.picture(640, 80, "cartas/coringav.png");
    }


    @Override
    public void mouseClicked(double x, double y) {
        for (Carta carta : cartasNaMesa) {
            if (carta.foiClicada(x, y)) {
                System.out.println("Você clicou na carta: " + carta.getNomeArquivo());
                // carta do avesso
                carta.virarCarta();
                this.atualizarTela();
                break;
            }
        }
    }

    static void main(String[] args) {
        new Main();


    }
}
