package gui;

import adapters.CreationAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class NewItemFrame extends JFrame {
    private final JTextField name = new JTextField(5);
    private final JTextField price = new JTextField(5);
    private final JTextField vat = new JTextField(5);
    private final JTextField quantity = new JTextField(5);

    /* package */ NewItemFrame() {
        super();
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        add(new Label("name: "));
        add(name);
        add(new Label("price: "));
        add(price);
        add(new Label("vat: "));
        add(vat);
        add(new Label("quantity: "));
        add(quantity);
        add(new JButton("add item") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                confirmItem();
            }
        });
        setVisible(false);
    }

    private void confirmItem() {
        CreationAdapter.createItem(name.getText(), price.getText(), vat.getText(), quantity.getText());
        setVisible(false);
    }

}
