public class Lampada {

    // Atributos
    private boolean ligada;

    // Métodos

    boolean isLigada() {
        return ligada;
    }

    boolean trocaEstado() {
        ligada = !ligada;
        return ligada;
    }

    // obs: métodos são publicos, atributos são privados

}