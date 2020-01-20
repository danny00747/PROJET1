package JavaInte;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	 private int posX = 250;
	    private int posY = 250;
	    private int posXfin = 250;
	    private int posYfin = 250;
	    
	    public int getX() {
	        return posX;
	    }
	    public int getY() {
	        return posY;
	    }
	    public void setX(int posX) {
	        this.posX = posX;
	    }
	    public void setY(int posY) {
	        this.posY = posY;
	    }
	    public int getXfin() {
	        return this.posXfin;
	    }
	    public int getYfin() {
	        return this.posYfin;
	    }
	    public void setYfin(int posYfin) {
	        this.posYfin = posYfin;
	    }
	    public void setXfin(int posXfin) {
	        this.posXfin = posXfin;
	    }

	    public void paintComponent(Graphics g) {
	        java.util.Random alea = new java.util.Random(System.currentTimeMillis());
	 
	        Color couleur = new Color(Math.abs(alea.nextInt()) % 256,
	        Math.abs(alea.nextInt()) % 256,
	        Math.abs(alea.nextInt()) % 256);

	        Graphics2D g2 = (Graphics2D)g;
	        g2.setColor(couleur);
	        g2.setStroke(new BasicStroke(10));
	        g2.drawLine(posX, posY, posXfin, posYfin);
	    }


}
