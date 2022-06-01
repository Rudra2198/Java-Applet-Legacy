import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Buttons extends Applet implements ActionListener{

    String s = "";
    Button yes,no;

    public void init(){
        yes = new Button("Yes");
        no = new Button("No");
        add(yes);
        add(no);
        yes.addActionListener(this);
        no.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){

        String s1 = ae.getActionCommand();
        if(s1.equals("Yes")){
            s = "You pressed yes";
        }
        else{
            s = "You pressed no";
        }
        repaint();

    }

    public void paint(Graphics g){
        g.drawString(s,10,80);
    }

}
