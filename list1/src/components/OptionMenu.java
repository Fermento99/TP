package components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class OptionMenu extends JMenu {

    OptionMenu(MainFrame parent) {
        super("Options");
        add(new JMenuItem("randomize background color") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                parent.randomizeBackgroundColor();
            }
        });
        add(new JMenuItem("randomize button color") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                parent.randomizeButtonColor();
            }
        });
    }
}
