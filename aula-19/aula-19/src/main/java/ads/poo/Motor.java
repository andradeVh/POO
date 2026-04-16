package ads.poo;

public class Motor {
    private String tipoMotor;
    private boolean ligado;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean isLigada() {
        return ligado;
    }

    public boolean ligadoDesligado() {
        ligado = !ligado;
        return ligado;
    }


    /*
        - tipoMotor: String
        - ligado: boolean
        + Motor(tipoMotor: String)
        + isLigado() boolean
        + ligadoDesligado() boolean
     */
}
