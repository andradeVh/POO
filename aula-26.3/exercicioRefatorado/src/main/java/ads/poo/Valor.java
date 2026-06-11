package ads.poo;

public enum Valor {
    AS(1, "1"),
    DOIS(2, "2"),
    TRES(3, "3"),
    QUATRO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SETE(7, "7"),
    OITO(8, "8"),
    NOVE(9, "9"),
    DEZ(10, "10"),
    DAMA(11, "q"),
    VALETE(12, "j"),
    REI(13, "k");

    public final int valor;
    public final String inicial;

    Valor(int valor, String inicial) {
        this.valor = valor;
        this.inicial = inicial;
    }
}
