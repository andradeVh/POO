package ads.poo;

public class CarroCorrida {
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    private static final int VEL_MAX = 300;
    private static final int VEL_MIN = 0;


    public CarroCorrida(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public CarroCorrida(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(int i){
        velocidadeAtual = (velocidadeMaxima+i <velocidadeMaxima) ? velocidadeAtual+i: velocidadeMaxima;
    }

    public void desacelerar(int d){
        velocidadeAtual = (velocidadeAtual-d > VEL_MIN) ? velocidadeAtual-d : VEL_MIN;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public String getModelo() {
        return modelo;
    }
}
