package ads.poo.produtos;

public class Telefone {
    protected int codigo;
    private String numeSerie;
    private String modelo;
    private double peso;
    private Dimensao dimensao;

    public Telefone(int codigo, String numeSerie, String modelo, double peso, Dimensao dimensao) {
        this.codigo = codigo;
        this.numeSerie = numeSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codigo=" + codigo +
                ", numeSerie='" + numeSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
