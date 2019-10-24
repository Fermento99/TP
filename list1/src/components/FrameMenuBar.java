package components;

import javax.swing.*;

public class FrameMenuBar extends JMenuBar {

    FrameMenuBar(final MainFrame parent) {
        super();
        add(new OptionMenu(parent));
        setVisible(true);
    }
}
