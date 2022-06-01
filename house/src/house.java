import java.awt.*;
import java.applet.*;

public class house extends Applet{

    public void paint(Graphics g){

        g.drawRect(90,90,60,80);
        g.drawRect(90,90,160,80);
        g.drawLine(90,90,120,60);
        g.drawLine(150,90,120,60);
        g.drawLine(120,60,220,60);
        g.drawLine(220,60,250,90);


    }
}
