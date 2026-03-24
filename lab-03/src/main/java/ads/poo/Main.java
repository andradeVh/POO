package ads.poo;
public class Main {
    static void main() {
        Ponto a = new Ponto(1, 2);
        Ponto b = new Ponto(2, 2);
        Horario h = new Horario(01, 34, 22);

        double distancia = a.getDistancia(b);

        System.out.println(distancia);
        System.out.printf(h.toString());
    }
}
