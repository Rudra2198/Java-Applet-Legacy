import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Checkboxes extends Applet implements ItemListener{

    String s = " ";
    Checkbox swim, hockey, cricket, football;

    public void init(){
        swim = new Checkbox("Swimming",true);
        hockey = new Checkbox("Hockey");
        cricket = new Checkbox("Cricket");
        football = new Checkbox("Football");
        add(swim);
        add(hockey);
        add(cricket);
        add(football);
        swim.addItemListener(this);
        hockey.addItemListener(this);
        cricket.addItemListener(this);
        football.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){

        s = " Current state of checkboxes : ";
        g.drawString(s,10,80);
        s = " Swimming : " + swim.getState();
        g.drawString(s,10,120);
        s = " Hockey : " + hockey.getState();
        g.drawString(s,10,140);
        s = " Cricket : " + cricket.getState();
        g.drawString(s,10,160);
        s = " Football : " + football.getState();
        g.drawString(s,10,180);

    }
}
