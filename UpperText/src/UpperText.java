import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class UpperText extends Applet implements ActionListener{

    Label l1,l2;
    TextField t1;
    Button b2;

    public void init(){
        l1 = new Label("Enter text : ");
        t1 = new TextField(10);

        add(l1);
        add(t1);

        b2 = new Button("SHOW");
        add(b2);
        b2.addActionListener(this);

        l2 = new Label("");
        add(l2);

    }

    public void actionPerformed(ActionEvent e){

        String a = t1.getText();
        String b = a.toUpperCase();

        if(e.getSource() == b2){
            l2.setText(b);
        }
    }
}
