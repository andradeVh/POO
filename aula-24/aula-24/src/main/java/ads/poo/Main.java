package ads.poo;

import java.util.ArrayList;

public class Main {
    static void main(String [] args) {
    Aldeao a = new Aldeao(25, 1, 0.8);
    Arqueiro arc = new Arqueiro(35, 2, 1);
    Cavaleiro cav = new Cavaleiro(50, 3, 2);

    Personagem per[] = new Personagem[3];
    per[0] = a;
    per[1] = arc;
    per[2] = cav;

    for (Personagem aux : per){
        IO.println(aux.toString());
        IO.println(aux.mover());
        if(aux instanceof Guerreiro g){
            IO.println(g.atacar());
        }

//        ArrayList<Personagem> personagens = new ArrayList<>();
//
//        personagens.add(new Aldeao());
//        personagens.add(new Arqueiro());
//        personagens.add(new Aldeao());

        for (Personagem p : per){
            IO.println(p.mover());
        }

    }

    }
}

