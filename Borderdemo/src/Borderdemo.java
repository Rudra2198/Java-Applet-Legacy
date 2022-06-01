import java.awt.*;
import java.applet.*;
import java.util.*;

public class Borderdemo extends Applet{

    public void init(){

        setLayout((new BorderLayout()));

        add(new Button("This is North"),BorderLayout.NORTH);
        add(new Button("This is South"),BorderLayout.SOUTH);
        add(new Button("This is East"),BorderLayout.EAST);
        add(new Button("This is West"),BorderLayout.WEST);

        String s = "This program is to demonstrate the Border Layout \n" +
                    "It shows the North, South, East, West Positions \n" +
                    "It also shows the Center";

        add(new TextArea(s),BorderLayout.CENTER);

    }


}
