package Mission8;

import java.awt.Color;
import java.awt.Graphics;

public class MyShape implements Shape{
	private int n;  // nombre d'intervalles ? dessiner

    /**
     * @pre  ---
     * @post cree un {@code MyShape} de 10 intervalles
     */
    public MyShape() {
        this(10);
    }
    
    /**
     * @pre  {@code n > 0}
     * @post cree un {@code MyShape} de {@code n} intervalles
     */
    public MyShape(int n) {
        this.n = n;
    }
    
    /**
     * @pre  {@code g} est initialise
     * @post dessine cette figure sur {@code g}. 
     */
    public void draw(Graphics g) {
        for (int i = 0; i <= n; i++) {

            Segment seg1 = new Segment(20, 20, 20 + (480 * i / n), 400);
            g.setColor(Color.GREEN);
            seg1.draw(g);

            Segment seg2 = new Segment(500, 20, 20 + (480 * i / n), 400);
            g.setColor(Color.RED);
            seg2.draw(g);
        }        
    }
    
    public int[] minXY ()
    {
        int[] min = new int[2];
        min [1] = 20;
        min[0] = 20;
        return min;
    }
    
    public int[] maxXY ()
    {
        int[] max = new int[2];
        max[0] = 500;
        max[1] = 400;
        return max;
    }
    
    public static void main (String args[])
    {
        Shape shape = new MyShape(40);
        int [] min = shape.minXY();
        int [] max = shape.maxXY();
        DrawPanel panel = new DrawPanel(shape, min[0], max[0], min[1], max[1]);         
    }


}
