package ads.poo;

import java.util.ArrayList;

public class Display {
    private int numExibido;
    private ArrayList<Segmento> segmentos;

    private class Segmento{
        private boolean ligado = false;

        public void ligar(){
            this.ligado = true;
        }

        public void desligar(){
            this.ligado = false;
        }
    }

    public Display(int numExibido){
        this.numExibido = numExibido;
        this.segmentos = new ArrayList<>();
        cadastrarSegmento();
    }

    private void cadastrarSegmento(){
        for (int i = 0; i < 7; i++) {
            segmentos.add(new Segmento());
        }

    }

    public void exibirNumero(){
        if (this.numExibido == 1){
            this.segmentos.get(1).ligar();
            this.segmentos.get(2).ligar();
        }
    }

    public void desligar(){
        for (Segmento seg : this.segmentos){
            seg.desligar();
        }
        this.numExibido = 0;
    }

    static void main(String[] args) {
        Display display = new Display(1);
        display.exibirNumero();
        display.desligar();


    }
}
