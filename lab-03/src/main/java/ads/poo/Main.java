package ads.poo;

import java.lang.classfile.constantpool.FieldRefEntry;

public class Main {
    static void main() {
        Ponto a = new Ponto(1, 2);
        Ponto b = new Ponto(2, 2);
        Horario h = new Horario(1, 1, 1);
        Horario j = new Horario(1, 1, 2);
        Retangulo r = new Retangulo();

        double distancia = a.getDistancia(b);
        long distanciaH = j.diferencaHora(h);

        System.out.println(distancia);
        System.out.println(h.toString());
        System.out.println(h.porExtenso());
        System.out.println(h.tempoSegundos());
        System.out.println(distanciaH);

        r.setAltura(15);
        r.setLargura(15);

        System.out.println(r.toString());


    }
}
