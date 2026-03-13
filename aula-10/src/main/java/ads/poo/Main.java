package ads.poo;

public class Main {
    static void main() {
    Contador contador = new Contador();
    Personagem personagem = new Personagem();
    Batedeira batedeira = new Batedeira();
    Disciplina disciplina = new Disciplina();


    contador.setValorAtual(20);
    contador.incrementar();
    contador.incrementar();

    System.out.println(contador.getValorAtual());

    personagem.setNome("José");
    personagem.setClasse("Mago");
    personagem.setHealthPoints(100);
    personagem.setStrenght(55);
    personagem.setSpell("Gelo");
    System.out.println(personagem.getInfoPersonagem());
    System.out.println(personagem.getComandoAtaque());

    batedeira.getClass();

    batedeira.setPotencia(45);
    System.out.println(batedeira.getVelocidadeAtual()); 
    batedeira.setVelocidadeAtual(5);
    System.out.println(batedeira.getVelocidadeAtual());
    System.out.println(batedeira.getPotencia());
    System.out.println(batedeira.getEstado());
    batedeira.trocaEstado();
    System.out.println(batedeira.getEstado());

    disciplina.setDia("quarta");
    disciplina.setHorario("18:30");
    disciplina.setMateria("POO");
    disciplina.setProfessor("Mello");
   // disciplina.setInfo("quarta", "18:30", "Mello", "POO");

    System.out.println(disciplina.getDia());

    }
}
