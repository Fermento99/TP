package components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FrameMenuBar extends JMenuBar {

    FrameMenuBar(MainFrame parent) {
        super();
        add(new OptionMenu(parent));
        setVisible(true);
    }
}
