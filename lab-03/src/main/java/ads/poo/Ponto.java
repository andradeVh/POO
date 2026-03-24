package ads.poo;

public class Ponto {
    private int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getDistancia(Ponto b){

        return Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow(b.y - this.y, 2));
    }
}
