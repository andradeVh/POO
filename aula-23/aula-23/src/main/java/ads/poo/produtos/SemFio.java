package ads.poo.produtos;

public class SemFio extends Telefone {
    private int frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numeSerie, String modelo, double peso, Dimensao dimensao, int frequencia, int canais, double distanciaOperacao) {
        super(codigo, numeSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }


    @Override
    public String toString() {
        return super.toString() +
                "frequencia=" + frequencia +
                ", canais=" + canais +
                ", distanciaOperacao=" + distanciaOperacao +
                '}';
    }
}
