package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor() {
        this.hp = 144;
        this.giroAtual = 4;
        this.cilindros = 0;
    }

    public void acelerar(int v){
        this.giroAtual += v;
    }
}
