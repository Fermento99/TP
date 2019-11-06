package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private final NewInvoiceFrame newFrame = new NewInvoiceFrame();
    private final JButton createInvoice = new JButton("create invoice") {
        @Override
        protected void fireActionPerformed(final ActionEvent event) {
            bootCreateInvoicesFrame();
        }
    };
    private final JButton showInvoices = new JButton("show invoice") {
        @Override
        protected void fireActionPerformed(final ActionEvent event) {
            bootShowInvoicesFrame();
        }
    };

    public MainFrame() {
        super();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        add(showInvoices);
        add(createInvoice);
        setVisible(true);
    }

    private void bootShowInvoicesFrame() {
        new ShowInvoicesFrame();
    }

    private void bootCreateInvoicesFrame() {
        newFrame.setVisible(true);
    }


}
