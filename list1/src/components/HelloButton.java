package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HelloButton extends JButton {
    final MainFrame parent;

    HelloButton(final MainFrame p) {
        super("Press me!");
        parent = p;
        setBackground(new Color(200,180,100));
        setBounds(15,15,200,100);
    }

    @Override
    protected void fireActionPerformed(final ActionEvent event) {
        parent.popup.setVisible(true);
    }
}
