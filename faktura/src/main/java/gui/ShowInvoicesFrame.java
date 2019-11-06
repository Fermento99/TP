package gui;

import blocks.Invoice;
import handlers.InvoiceHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ShowInvoicesFrame extends JFrame {

    /* package */ ShowInvoicesFrame() {
        super();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(0, 0, 300, 600);
        updateInvoices();
        setVisible(true);
    }

    private void updateInvoices() {
        for (final Invoice invoice : InvoiceHandler.getInvoices()) {
            final int id = invoice.getId();
            add(new JLabel(String.valueOf(id)));
            add(new JButton("open") {
                @Override
                protected void fireActionPerformed(final ActionEvent event) {
                    openInvoice(id);
                }
            });
        }
        setLayout(new GridLayout(InvoiceHandler.getInvoices().size(), 2));
        setBounds(0, 0, 300, 70 * InvoiceHandler.getInvoices().size());
    }

    private void openInvoice(final int id) {
        new InvoiceDialog(InvoiceHandler.getInvoice(id));
    }
}
