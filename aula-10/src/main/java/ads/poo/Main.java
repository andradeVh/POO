package ads.poo;

public class Main {
    static void main() {
    Contador contador = new Contador();
    contador.setValorAtual(20);
    contador.incrementar();

        System.out.println(contador.getValorAtual());
    }
}
