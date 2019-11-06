package GUI;

import adapters.CreationAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class NewItemFrame extends JFrame {
    private JTextField name = new JTextField(5);
    private JTextField price = new JTextField(5);
    private JTextField vat = new JTextField(5);
    private JTextField quantity = new JTextField(5);
    private JButton confirmItem = new JButton("add item") {
        @Override
        protected void fireActionPerformed(ActionEvent event) {
            confirmItem();
        }
    };

    NewItemFrame() {
        super();
        setLayout(new GridLayout(5,2));
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
        add(confirmItem);
        setVisible(false);
    }

    private void confirmItem() {
        CreationAdapter.createItem(name.getText(), price.getText(), vat.getText(), quantity.getText());
        setVisible(false);
    }

}
