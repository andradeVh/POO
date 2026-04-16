package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int tripulantes;
    private int passageiros;
    private int qtdCombustivel;
    private boolean ligado;
    private ArrayList<Motor> motores;

    public Aviao(int tripulantes, int passageiros, int qtdCombustivel, int qtdMotores, String tipoMotor) {
        this.tripulantes = tripulantes;
        this.passageiros = passageiros;
        this.qtdCombustivel = qtdCombustivel;
        this.motores = new ArrayList<>();
        if (!(qtdMotores < 1 || qtdMotores > 8)) {
            for (int i = 0; i < qtdMotores; i++) {
                this.motores.add(new Motor(tipoMotor));
            }
        } else {
            for (int i = 0; i < 1; i++) {
                this.motores.add(new Motor("helice"));
            }
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean ligarDesligar() {
        if (this.motores.get(0).isLigada()) {
            ligado = !ligado;
            return ligado;
        }
        return ligado;
    }
}
    /*
        - tripulantes: int
        - passageiros: int
        - qtdCombustivel: int
        - qtdMotores: ArrayList~Motor~
        + Aviao(t: int, p: int, c: int, tipoMotor: String, qtdMotores: int)
        + isLigado() boolean
        + ligadoDesligado() boolean
     */


