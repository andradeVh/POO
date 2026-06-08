

package ads.poo;


import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main(String[] args) throws InterruptedException {

        Draw draw = new Draw();


        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
        /*
        draw.circle(400,400,100);

        draw.setPenColor(Color.RED);
        draw.filledCircle(400,400,50);

        draw.square(400,400,100);

        double[] x = {100,150,250,300};
        double[] y = {100,150,150,100};

        draw.polygon(x,y);
*/
        draw.enableDoubleBuffering();

        draw.setPenColor(Color.LIGHT_GRAY);

        for (int i = 0; i < 800; i+=5){
            draw.line(i, 0, i, 800);
            draw.line(0, i, 800, i);
        }


        draw.setFontSize(30);

        for (int i = 0; i < 10; i++) {
            draw.clear();
            draw.text(400,400, "" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }

        // fazer um coração com 2 circulos e um poligono.
        }


    }

