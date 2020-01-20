package Mission8;

public class Cube {
	 public static void cavaliere (String [] args)
	    {
	        Shape shape1 = new Carre (100, 200, 200, 0, false, "black");
	        Shape shape2 = new Segment (100, 200, 170, 130);
	        Shape shape3 = new Segment (300, 200, 370, 130);
	        Shape shape4 = new Segment (300, 400, 370, 330);
	        Shape shape5 = new Segment (170, 130, 370, 130);
	        Shape shape6 = new Segment (370, 130, 370, 330);
	        Figure figure = new Figure (shape1, shape2, shape3, shape4, shape5, shape6, shape6);
	        DrawPanel panel = new DrawPanel (figure);
	    }
	    
	    public void axionometrique (String[] args)
	    {
	        Shape shape1 = new Segment (256, 412, 83, 312);
	        Shape shape2 = new Segment (256, 412, 429, 312);
	        Shape shape3 = new Segment (256, 412, 256, 212);
	        Shape shape4 = new Segment (83, 312, 83, 112);
	        Shape shape5 = new Segment (429, 312, 429, 112);
	        Shape shape6 = new Segment (83, 112, 256, 212);
	        Shape shape7 = new Segment (429, 112, 256, 212);
	        Shape shape8 = new Segment (83, 112, 256, 12);
	        Shape shape9 = new Segment (429, 112, 256, 12);
	    }
}
