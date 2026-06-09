package ads.poo;

public class Carta {
    private String nomeArquivo;
    private String cartaFrente;
    private String cartaFundo;
    private boolean viradaPraBaixo;
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Carta(String cartaFrente, String cartaFundo, int x, int y) {
        this.nomeArquivo = cartaFrente;
        this.cartaFrente = cartaFrente;
        this.cartaFundo = cartaFundo;
        this.viradaPraBaixo = false;
        this.x = x;
        this.y = y;
        this.largura = 80;
        this.altura = 110;
    }

    public boolean foiClicada(double mouseX, double mouseY) {
        return (mouseX >= (this.x - this.largura / 2.0) && mouseX <= (this.x + this.largura / 2.0) &&
                mouseY >= (this.y - this.altura / 2.0) && mouseY <= (this.y + this.altura / 2.0));
    }

    public boolean virarCarta(){
        this.viradaPraBaixo = !this.viradaPraBaixo;

        if (this.viradaPraBaixo){
            this.nomeArquivo = this.cartaFundo;
        } else {
            this.nomeArquivo = this.cartaFrente;
        }
        return this.viradaPraBaixo;
    }

    public String getNomeArquivo() { return nomeArquivo; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setPosicao(int x, int y) {
        this.x = x;
        this.y = y;
    }
}