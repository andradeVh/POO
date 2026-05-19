package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String mover() {
        return super.mover() + "Cavaleiro";
    }

    @Override
    public String atacar() {
        return "Guerreiro atacando";
    }


}
