public class Main {
    static void main (String[] args){

        Caneta bic = new Caneta();
        bic.setCor("Azul");
        bic.setNivelTinta(0.001);


        bic.AbertaFechada();
        System.out.println(bic.desenhar(3, 3, 4, 4));
    }
}