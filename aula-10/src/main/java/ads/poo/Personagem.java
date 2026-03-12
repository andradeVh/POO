package ads.poo;

public class Personagem {
    private String classe;
    private String nome;
    private int healthPoints;
    private int strenght;
    private String spell;
    private String comandoAtaque;
    private String infoPersonagem;



    public void setSpell(String s){
        spell = s;
    }

    public String getSpell(){
        return spell;
    }

    public void setNome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setClasse(String c){
        classe = c;
    }
    public String getClasse(){
        return classe;
    }
    public void setHealthPoints(int hp){
        healthPoints = hp;
    }

    public void setStrenght(int sp){
        strenght = sp;
    }

    public int getStrenght(){
        return  strenght;
    }
    public int getHealthPoints(){
        return healthPoints;
    }

    public String getComandoAtaque(){
        String ataque;
        ataque = " O " + getClasse() + " " + getNome() + " utilizou o feitiço " + getSpell() + " de força " + getStrenght();
        return ataque;
    }
    public String getInfoPersonagem(){
        String info;
        info = "\n Nome: " + getNome() + "\n Classe: " + getClasse() + "\n Vida: " + getHealthPoints() + "\n Força: " + getStrenght() + "\n Feitiço: " + getSpell();
        return info;
    }
}
