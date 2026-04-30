package ads.poo;

public class Retangulo {
    private int altura, largura;

    public Retangulo() {
        this.altura = 3;
        this.largura = 4;
    }

    public Retangulo(int altura, int largura, int tipoCodificacao) {
        this();
        if (altura < 2 || largura < 2) {
            this.altura = altura;
            this.largura = largura;
        }

    }

    public int getAltura(){
        return altura;
    }

    public int getLargura(){
        return largura;
    }

    public int getArea() {
        return altura * largura;
    }

    public int getPerimetro() {
        return 2 * altura + 2 * largura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    @Override
    public String toString() {
        if (largura < 2 || altura < 2) return "+";

        final StringBuilder sb = new StringBuilder();
        String cima = "+" + "-".repeat(largura - 2) + "+\n";
        sb.append(cima);

        String meio = "|" + " ".repeat(largura - 2) + "|\n";
        sb.append(meio.repeat(altura - 2));

        String baixo = "+" + "-".repeat(largura - 2) + "+\n";
        sb.append(baixo);
        return sb.toString();
    }

}
