package JavaInte;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

    private Panneau fond = new Panneau();
    private JPanel container = new JPanel();
    public Fenetre() {
        this.setTitle("Ma fenetre");
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        container.add(fond, BorderLayout.CENTER);

        //container.add(new JButton("bouton"), BorderLayout.SOUTH);
        this.setContentPane(container);
        
        //this.setContentPane(fond);
        this.setVisible(true);

    }
    

    public void dessineForme(int taille, int cote, int fois) {
        double pi = Math.PI;
        for (int a = fois; a < cote+fois; a++) {
            double angle = (pi* ((360/cote)*a)) / 180;
            double sin = Math.sin(angle);
            double cos = Math.cos(angle);
            int x = fond.getXfin(), y = fond.getYfin();
            int x2 = (int) Math.rint((cos*taille + x));
            int y2 = (int) Math.rint((sin*taille + y));
            fond.setXfin(x2);
            fond.setYfin(y2);

            fond.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fond.setX(x2);
            fond.setY(y2);
        }
    }
    public void dessine(int taille, int cote) {
        double pi = Math.PI;
        for (int a = 0; a < cote; a++) {
            this.dessineForme(taille, cote, a);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void dessine2(int taille, int cote) {
        taille = taille/2;
        double pi = Math.PI;
        for (int b = 1; b < 9; b++) {
            getExtremites(b, taille, cote);
            for (int a = 0; a < cote; a++) {

                this.dessineForme(taille, cote, a);

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void getExtremites(int fois, int taille, int cote) {
        int x = fond.getXfin(), y = fond.getYfin();
        boolean axeX = false, axeY = false;
        System.out.println(fois);
        if (fois == 1)  {
            fond.setX(x-(taille*(cote+1)));
            fond.setY(y-(taille*(cote+1)));
            fond.setXfin(x-(taille*(cote+1)));
            fond.setYfin(y-(taille*(cote+1)));
        } else if (fois == 2) {
            fond.setY(y+(taille*(cote+1)));
            fond.setYfin(y+(taille*(cote+1)));
        } else if (fois == 3) {
            fond.setY(y+(taille*(cote+1)));
            fond.setYfin(y+(taille*(cote+1)));
        } else if (fois == 4) {
            fond.setX(x+(taille*(cote+1)));
            fond.setXfin(x+(taille*(cote+1)));
        } else if (fois == 5) {
            fond.setX(x+(taille*(cote+1)));
            fond.setXfin(x+(taille*(cote+1)));
        } else if (fois == 6) {
            fond.setY(y-(taille*(cote+1)));
            fond.setYfin(y-(taille*(cote+1)));
        } else if (fois == 7) {
            fond.setY(y-(taille*(cote+1)));
            fond.setYfin(y-(taille*(cote+1)));
        } else if (fois == 8) {
            fond.setX(x-(taille*(cote+1)));
            fond.setXfin(x-(taille*(cote+1)));
        }
    }
}
