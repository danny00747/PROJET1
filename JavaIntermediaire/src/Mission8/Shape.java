package Mission8;

import java.awt.Graphics;

public interface Shape {
	
	    /**
	     * @pre g != null
	     * @post dessine la figure dans la zone graphique g
	     */
	    public void draw (Graphics g) ;

	    /**
	     * @pre -
	     * @post retourne x et y minimum dans un tableau, x en 0 et y en 1
	     */
	    public int [] minXY () ;

	    /**
	     * @pre -
	     * @post retourne x et y maximum dans un tableau, x en 0 et y en 1
	     */
	    public int [] maxXY () ;

}
