package components;

import javax.swing.*;
import java.awt.*;

public class MyDialog extends JDialog {

    MyDialog() {
        add(new Label("Hello world!"));
        setBounds(10,10,100,50);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(false);
    }
}
