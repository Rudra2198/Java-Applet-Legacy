import java.awt.*;
import java.applet.*;

public class GridDemo extends Applet {

    static final int n = 4;

    public void init(){

        setLayout(new GridLayout(n,n));
        setFont(new Font("Courier", Font.BOLD,16));

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                int k = i * n + j;
                add(new Button(" " + k));
            }
        }

    }
}
