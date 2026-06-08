package ads.poo;

public enum DiaDaSemana {
    DOMINGO(1, "domingo"),
    SEGUNDA(2, "segunda-feira"),
    TERCA(3, "terça-feira"),
    QUARTA(4, "quarta-feira"),
    QUINTA(5, "quinta-feira"),
    SEXTA(6, "sexta-feira"),
    SABADO(7, "sábado");

    public final int codigo;
    public final String extenso;

    DiaDaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static DiaDaSemana getByCodigo(int codigo){
        for (DiaDaSemana dia : DiaDaSemana.values()){
            if (dia.codigo == codigo){
                return dia;
            }
        }
        throw new IllegalArgumentException("Código inválido");
    }

    @Override
    public String toString() {
        return extenso;
    }
}
