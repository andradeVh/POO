package ads.poo;

public class Main {
    static void main(String [] args) {

        String sigla = IO.readln("Entre com a sigla:\n");
        int dia1 = Integer.parseInt(IO.readln("Entre com o primeiro dia:\n"));
        DiaDaSemana primeiro = DiaDaSemana.getByCodigo(dia1);
        int dia2 = Integer.parseInt(IO.readln("Entre com o segundo dia:\n"));
        DiaDaSemana segundo = DiaDaSemana.getByCodigo(dia2);

        IO.println("Sigla: " + sigla.toUpperCase() + "\nDias de aula: " + primeiro + " e " + segundo);

        int planeta = Integer.parseInt(IO.readln("Entre com a posição do planeta: "));
        SistemaSolar posicao = SistemaSolar.getByPosicao(planeta);
        IO.println(posicao);


        // Disciplina poo = new Disciplina("POO", new DiaDaSemana[]{DiaDaSemana.TERCA, DiaDaSemana.QUINTA} );


        // IO.println(poo);
        // Sigla: POO
        // Dias com aulas: ???



    }
}

