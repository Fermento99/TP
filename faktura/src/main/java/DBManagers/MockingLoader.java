package DBManagers;

import blocks.Address;
import blocks.Client;
import blocks.Invoice;
import blocks.InvoiceElement;

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;

public class MockingLoader implements Loader {
    @Override
    public ArrayList<Invoice> loadInvoices() {
        ArrayList<InvoiceElement> newTab = new ArrayList<>();
        Invoice newInvoice = null;
        newTab.add(new InvoiceElement("jablko", 3.89, .08, 4));
        newTab.add(new InvoiceElement("cegla", .99, .23, 100));
        newTab.add(new InvoiceElement("kolo", 57.70, .02, 2));
        try {
            newInvoice = new Invoice("12-10-2019", 1, new Client("Jan", "Kowalski", new Address("Wolności", 10, 3, "Wrocław", "Polska", "12-345"), "98071512345"), newTab);
        } catch (BadAttributeValueExpException ex) {
            System.out.println("MockingLoader: excepyion caught" + ex);
        }
        ArrayList<Invoice> mock = new ArrayList<>();
        mock.add(newInvoice);
        return mock;
    }

    @Override
    public int updateID() {
        return 1;
    }
}
