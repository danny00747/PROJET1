package Mission8;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape{
	private int x0, x1, x2, x3; // abcisse des coins
    private int y0, y1, y2, y3; // abcisse des coins
    private int longueur;
    private int largeur;
    private int angle; // angle de la longueur par rapport ? l'axe x
    private boolean fill;
    private String color;
    
    /**
     * @pre 0<=x<=512, 0<=y<=512, longueur <= 512, largeur <= 512, -90<angle<90
     * @post construit un objet rectangle
     */
    public Rectangle (int x, int y, int longueur, int largeur, int angle, boolean fill, String color)
    {
        assert (0<=x && x<=512): "Erreur, public Rectangle (int x, int y, int longueur, int largeur, int angle), x n'appartient pas ? [0,512]";
        assert (0<=y && y<=512): "Erreur, public Rectangle (int x, int y, int longueur, int largeur, int angle), y n'appartient pas ? [0,512]";
        assert (longueur<=512): "Erreur, public Rectangle (int x, int y, int longueur, int largeur, int angle), longueur > 512";
        assert (largeur<=512): "Erreur, public Rectangle (int x, int y, int longueur, int largeur, int angle), largeur > 512";
        this.x0=x;
        this.y0=y;
        this.longueur=longueur;
        this.largeur=largeur;
        this.angle=angle;
        this.x1=x0+(int)(longueur*Math.cos((double)(angle*Math.PI)/180));
        this.y1=y0+(int)(longueur*Math.sin((double)(angle*Math.PI)/180));
        this.x2= x1- (int)(largeur*Math.sin((double)(angle*Math.PI)/180));
        this.y2= y1+ (int)(largeur*Math.cos((double)(angle*Math.PI)/180));
        this.x3= x2- (int)(longueur*Math.cos((double)(angle*Math.PI)/180));
        this.y3= y2- (int)(longueur*Math.sin((double)(angle*Math.PI)/180));
        this.fill = fill;
        this.color = color;
    }
    
    public void draw ( Graphics g)
    {
        Segment seg1= new Segment (x0, y0, x1, y1);
        if ( color.equals ("blue"))
        {
            g.setColor (Color.BLUE);
        }
        else if (color.equals ("green"))
        {
            g.setColor (Color.GREEN);
        }
        else if (color.equals ("red"))
        {
            g.setColor (Color.RED);
        }
        else if (color.equals ("white"))
        {
            g.setColor (Color.WHITE);
        }
        else if (color.equals ("orange"))
        {
            g.setColor (Color.ORANGE);
        }
        else if (color.equals ("yellow"))
        {
            g.setColor (Color.YELLOW);
        }
        else if (color.equals ("cyan"))
        {
            g.setColor (Color.CYAN);
        }
        else if (color.equals ("magenta"))
        {
            g.setColor (Color.MAGENTA);
        }
        else
        {
            g.setColor (Color.BLACK);
        }
        seg1.draw(g);
        Segment seg2 = new Segment (x1, y1, x2, y2);
        seg2.draw (g);
        Segment seg3 = new Segment (x2, y2, x3, y3);
        seg3.draw (g);
        Segment seg4 = new Segment (x3, y3, x0, y0);
        seg4.draw (g);
        if (fill)
        {
            int [] x = {x0, x1, x2, x3};
            int [] y = {y0, y1, y2, y3};
            g.fillPolygon (x, y, 4);
        }
    }
    
    public int[] minXY ()
    {
        int [] min = new int[2];
        int xMin = Math.min (x0, x1);
        xMin = Math.min (xMin, x2);
        xMin = Math.min (xMin, x3);
        min[0] = xMin;
        int yMin = Math.min (y0, y1);
        yMin = Math.min (yMin, y2);
        yMin = Math.min (yMin, y3);
        min[1] = yMin;
        return min;
    }
    
    public int[] maxXY ()
    {
        int [] max = new int[2];
        int xMax = Math.max (x0, x1);
        xMax = Math.max (xMax, x2);
        xMax = Math.max (xMax, x3);
        max[0] = xMax;
        int yMax = Math.max (y0, y1);
        yMax = Math.max (yMax, y2);
        yMax = Math.max (yMax, y3);
        max[1] = yMax;
        return max;
    }

}
