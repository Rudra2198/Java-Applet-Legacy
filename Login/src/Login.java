import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Login extends Applet implements ActionListener{

    TextField t1,t2;
    Label l1,l2,l3;
    Button b1;

    public void init(){

        l1 = new Label("Enter Username : ");
        t1 = new TextField(20);
        add(l1);
        add(t1);
        l2 = new Label("Enter password : ");
        t2 = new TextField(20);
        add(l2);
        add(t2);
        b1 = new Button("Login");
        add(b1);
        b1.addActionListener(this);
        l3 = new Label("please login");
        add(l3);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == b1 && t1.getText().equals("Rudra") && t2.getText().equals("123")){
            l3.setText("Login Success");
        }
        else{
            l3.setText("Login Failed");
        }
    }


}
