package ads.poo;

public class Batedeira {
    private int velocidadeAtual;
    private boolean estado;
    private int potencia;

    public boolean getEstado() {
        return estado;
    }
    public boolean trocaEstado() {
        estado = !estado;
        return estado;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int v){
        velocidadeAtual = v;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int p){
        potencia = p;
    }

}
