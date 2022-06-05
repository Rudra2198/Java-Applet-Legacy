import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class linemouse extends Applet implements MouseListener,ActionListener{

    Button b;
    int x1, y1, x2, y2;

    public void init()
    {
        b = new Button();
        add(b);
        x1 = y1 = x2 = y2 = 0;
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b) //button click
        {
            addMouseListener(this);
        }
    }

    public void mouseClicked(MouseEvent me)
    {
        x1=me.getX();
        y1=me.getY();
        showStatus( "(" + x1 + "," + y1+ ")" );
    }

    public void mousePressed(MouseEvent me)
    {

    }
    public void mouseReleased(MouseEvent me)
    {
        x2=me.getX();
        y2=me.getY();
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {

    }
    public void mouseEntered(MouseEvent me)
    {

    }

    public void paint(Graphics g)
    {
        update(g);
    }

    public void update(Graphics g)
    {
        g.drawLine( x1,y1,x2,y2);
    }}