package gui;

import blocks.Invoice;
import blocks.InvoiceElement;

import javax.swing.*;
import java.awt.*;

class InvoiceDialog extends JDialog {


    /* package */ InvoiceDialog(final Invoice invoice) {
        super();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(0, 0, 300, 600);
        final JPanel info = new JPanel();
        info.setLayout(new GridLayout(12, 1));
        info.add(new JLabel("id: " + invoice.getId()));
        info.add(new JLabel("delivery date: " + invoice.getDeliveryDate()));
        info.add(new JLabel("Client"));
        info.add(new JLabel("name: " + invoice.getClient().getName()));
        info.add(new JLabel("surname: " + invoice.getClient().getSurname()));
        info.add(new JLabel("pesel: " + invoice.getClient().getPesel()));
        info.add(new JLabel("address: "));
        info.add(new JLabel("street: " + invoice.getClient().getAddress().getStreet() + " " + invoice.getClient().getAddress().getHouseNr() + "/" + invoice.getClient().getAddress().getFlatNr()));
        info.add(new JLabel("city: " + invoice.getClient().getAddress().getCity() + " " + invoice.getClient().getAddress().getCountry()));
        info.add(new JLabel("postal code: " + invoice.getClient().getAddress().getPostalCode()));
        info.add(new JLabel("Items"));
        add(info);
        final JPanel items = new JPanel();
        items.add(new JLabel("name"));
        items.add(new JLabel("price"));
        items.add(new JLabel("vat"));
        items.add(new JLabel("quantity"));
        int i = 1;
        for (final InvoiceElement item : invoice.getInvoiceElements()) {
            items.add(new JLabel(item.getName()));
            items.add(new JLabel(String.valueOf(item.getPrice())));
            items.add(new JLabel(String.valueOf(item.getVat())));
            items.add(new JLabel(String.valueOf(item.getQuantity())));
            i++;
        }
        items.setLayout(new GridLayout(i, 4));
        add(items);
        add(new JLabel("total price: " + invoice.totalValue() + " zł"));
        add(new JLabel("total tax: " + invoice.totalTax() + " zł"));
        setVisible(true);
    }
}
