package ads.poo;

public enum SistemaSolar {
    MERCURIO(1),
    VENUS(2 ),
    TERRA(3 ),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    public final int posicao;

    SistemaSolar(int posicao) {
        this.posicao = posicao;
    }

    public static SistemaSolar getByPosicao(int posicao){
        for (SistemaSolar planeta : SistemaSolar.values()){
            if (planeta.posicao == posicao){
                return planeta;
            }
        }
        throw new IllegalArgumentException("Posição inválida");
    }
}
