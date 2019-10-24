package components;

import javax.swing.*;
import java.awt.*;

public class MyDialog extends JDialog {

    MyDialog() {
        setBounds(10,10,100,100);
        setFont(new Font(Font.MONOSPACED,Font.BOLD, 17));
        getContentPane().add(new Label("Hello world!"));
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(false);
    }
}
