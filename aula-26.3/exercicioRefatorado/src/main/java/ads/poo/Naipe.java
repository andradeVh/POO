package ads.poo;

public enum Naipe {
    OURO(1, 'o'),
    ESPADA(2, 'e'),
    COPAS(3, 'c'),
    PAUS(4, 'p');

    public final int valor;
    public final char inicia;

    Naipe(int valor, char inicia){
        this.valor = valor;
        this.inicia = inicia;
    }
}
