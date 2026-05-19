package ads.poo;

public class Aldeao extends Personagem implements Guerreiro{


    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return super.mover() + "Aldeão";
    }

    @Override
    public String atacar() {
        return "Aldeao atacando";
    }
}
