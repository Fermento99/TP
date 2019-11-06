package gui;

import adapters.CreationAdapter;
import blocks.Address;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NewInvoiceFrame extends JFrame {
    private final NewItemFrame newItem = new NewItemFrame();
    private final JTextField deliveryDate = new JTextField(12);
    private final JTextField name = new JTextField(15);
    private final JTextField surname = new JTextField(20);
    private final JTextField pesel = new JTextField(11);
    private final JTextField street = new JTextField(30);
    private final JTextField city = new JTextField(15);
    private final JTextField country = new JTextField(15);
    private final JTextField postalCode = new JTextField(6);
    private final JTextField houseNr = new JTextField(5);
    private final JTextField flatNr = new JTextField(5);

    /* package */ NewInvoiceFrame() {
        super();
        setLayout(new GridLayout(12, 2));
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(0, 0, 300, 600);
        add(new JLabel("delivery date: "));
        add(deliveryDate);
        add(new JLabel("name: "));
        add(name);
        add(new JLabel("surname: "));
        add(surname);
        add(new JLabel("pesel: "));
        add(pesel);
        add(new JLabel("Address"));
        add(new JLabel());
        add(new JLabel("street: "));
        add(street);
        add(new JLabel("house number: "));
        add(houseNr);
        add(new JLabel("flat number: "));
        add(flatNr);
        add(new JLabel("city: "));
        add(city);
        add(new JLabel("country: "));
        add(country);
        add(new JLabel("postalCode: "));
        add(postalCode);
        add(new JButton("add item") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                addItemToInvoice();
            }
        });
        add(new JButton("confirm invoice") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                confirmInvoice();
            }
        });
        setVisible(false);
    }

    private void addItemToInvoice() {
        newItem.setVisible(true);
    }
    private void confirmInvoice() {
        final Address address = CreationAdapter.createAddress(street.getText(), houseNr.getText(), flatNr.getText(), city.getText(), country.getText(), postalCode
        .getText());
        if (address != null) {
            CreationAdapter.createClient(name.getText(), surname.getText(), pesel.getText(), address);
            CreationAdapter.createInvoice(deliveryDate.getText());
        }
        setVisible(false);
    }
}

