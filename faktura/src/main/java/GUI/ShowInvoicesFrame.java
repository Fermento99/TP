package GUI;

import blocks.Invoice;
import handlers.InvoiceHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ShowInvoicesFrame extends JFrame {

    ShowInvoicesFrame() {
        super();
        setLayout(new GridLayout(12,2));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(0, 0, 300, 600);
        updateInvoices();
        setVisible(true);
    }

    public void updateInvoices() {
        for (Invoice invoice : InvoiceHandler.getInvoices()) {
            final int id = invoice.getId();
            add(new JLabel(String.valueOf(id)));
            add(new JButton("open") {
                @Override
                protected void fireActionPerformed(ActionEvent event) {
                    openInvoice(id);
                }
            });
        }
    }

    void openInvoice(int id) {
        new InvoiceDialog(InvoiceHandler.getInvoice(id));
    }
}
