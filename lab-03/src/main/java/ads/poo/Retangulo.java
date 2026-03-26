package ads.poo;

public class Retangulo {
    private int altura, largura;

    public Retangulo() {
        this.altura = 3;
        this.largura = 4;
    }

    public Retangulo(int altura, int largura, int tipoCodificacao){
        this();
        if (altura < 0 || largura < 0){
            this.altura = altura;
            this.largura = largura;
        }

    }
}
