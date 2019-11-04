package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private NewInvoiceFrame newFrame = new NewInvoiceFrame();
    private JButton createInvoice = new JButton("create invoice") {
        @Override
        protected void fireActionPerformed(ActionEvent event) {
            bootCreateInvoicesFrame();
        }
    };
    private JButton showInvoices = new JButton("show invoice") {
        @Override
        protected void fireActionPerformed(ActionEvent event) {
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
