package ads.poo;
public class Main {
    static void main() {
        Ponto a = new Ponto(1, 2);
        Ponto b = new Ponto(2, 2);
        Horario h = new Horario(2, 2, 1);

        double distancia = a.getDistancia(b);

        System.out.println(distancia);
        System.out.println(h.toString());
        System.out.println(h.porExtenso());
    }
}
