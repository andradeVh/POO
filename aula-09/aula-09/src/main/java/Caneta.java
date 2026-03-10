public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean abertaFechada;

    public String desenhar(int x1, int y1, int x2, int y2) {
        String mensagem;
        if (abertaFechada) {


            // calculcar dist
            // debitar nivel de tinta
            // reotrna dist percorrida
            // ex: desenhei n cm na cor azul
            double total;
            int x, y;


            x = x2 - x1;
            y = y2 - y1;
            total = Math.pow(x, 2) + Math.pow(y, 2);
            total = Math.sqrt(total);

            if (nivelTinta >= total * 0.01) {
                nivelTinta -= total * 00.1;

                mensagem = "Desenhei " + total + " cm na cor " + getCor();
            } else {
                mensagem = "Falta tinta!";
            }

        } else {
            mensagem = "Caneta está fechada!";
        }
        return mensagem;
    }


    public boolean AbertaFechada() {
        abertaFechada = !abertaFechada;
        return abertaFechada;
    }

    public String getCor() {
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setCor(String c) {
        cor = c;
    }

    public void setNivelTinta(double n) {
        nivelTinta = n;
    }


}
