package GUI;

import adapters.Adapter;
import blocks.Address;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NewInvoiceFrame extends JFrame {
    NewItemFrame newItem = new NewItemFrame();
    JTextField deliveryDate = new JTextField(12);
    JTextField name = new JTextField(15);
    JTextField surname = new JTextField(20);
    JTextField pesel = new JTextField(11);
    JTextField street = new JTextField(30);
    JTextField city = new JTextField(15);
    JTextField country = new JTextField(15);
    JTextField postalCode = new JTextField(6);
    JTextField houseNr = new JTextField(5);
    JTextField flatNr = new JTextField(5);
    JButton addItem = new JButton("add item") {
        @Override
        protected void fireActionPerformed(ActionEvent event) {
            addItemToInvoice();
        }
    };
    JButton confirmInvoice = new JButton("confirm invoice") {
        @Override
        protected void fireActionPerformed(ActionEvent event) {
            confirmInvoice();
        }
    };

    NewInvoiceFrame() {
        super();
        setLayout(new GridLayout(12,2));
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
        add(addItem);
        add(confirmInvoice);
        setVisible(false);
    }

    private void addItemToInvoice() {
        newItem.setVisible(true);
    }
    private void confirmInvoice() {
        Address address = Adapter.createAdress(street.getText(), houseNr.getText(), flatNr.getText(), city.getText(), country.getText(), postalCode
        .getText());
        if(address == null) {

        } else {
            Adapter.createClient(name.getText(), surname.getText(), pesel.getText(), address);
            Adapter.createInvoice(deliveryDate.getText());
        }
        setVisible(false);
    }
}

