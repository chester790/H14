import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    double r1;
    double r2;
    int kleur;
    int getal;
    String soort[] = {"Ruiten", "Harten", "Schoppen", "Klaver"};
    String nummers[] = {"Boer", "Koning", "Aas", "Vrouw", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    Button knop;



    public void init() {
        knop = new Button("Deel");
        knop.addActionListener(new Listener());
        add(knop);


    }

    public void paint(Graphics g) {
        setBackground(Color.orange);
        g.drawString("" + soort [kleur]+ " " + nummers [getal], 170,100);
    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            r1 = Math.random();
            r2 = Math.random();
            kleur = (int) (r1 * 4 + 1);
            getal = (int) (r2 * 13 +1);
            repaint();

        }
    }

}