package ads.poo;

public class Main {
    static void main() {
    Contador contador = new Contador();
    Personagem personagem = new Personagem();
    contador.setValorAtual(20);
    contador.incrementar();
    contador.incrementar();

    System.out.println(contador.getValorAtual());

    personagem.setNome("Cleito");
    personagem.setClasse("Mago");
    personagem.setHealthPoints(100);
    personagem.setStrenght(55);
    personagem.setSpell("Gelo");
    System.out.println(personagem.getInfoPersonagem());
    System.out.println(personagem.getComandoAtaque());

    }
}
