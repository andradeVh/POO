package ads.poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {
    private Draw draw;
    public App() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
    }

    static void main() {

    }
}
