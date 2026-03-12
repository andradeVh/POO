package ads.poo;

public class Contador {
    private int valorAtual;

    public void setValorAtual(int valor){
    valorAtual = valor;
    }

    public void incrementar() {
    valorAtual++;
    }

    public int getValorAtual(){
        return valorAtual;
    }
}
