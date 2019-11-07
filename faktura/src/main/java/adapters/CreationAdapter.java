package adapters;

import blocks.Address;
import blocks.Client;
import blocks.InvoiceElement;
import handlers.ClientHandler;
import handlers.InvoiceHandler;

import java.util.ArrayList;

public abstract class CreationAdapter {
    private static Client tempClient;
    private static ArrayList<InvoiceElement> tempInvoiceElements = new ArrayList<>();
    public static void createClient(final String name, final String surname, final String pesel, final Address address) {
        tempClient = ClientHandler.createClient(name, surname, address, Integer.parseInt(pesel));
    }

    public static Address createAddress(final String street, final String houseNr, final String flatNr, final String city, final String country, final String postalCode) {
        Address address = null;
        try {
            address =  new Address(street, Integer.parseInt(houseNr), Integer.parseInt(flatNr), city, country, postalCode);
        } catch (Exception ex) {
            System.out.println("Adapter: Exception caught" + ex);
        }
        return address;
    }

    public static void createItem(final String name, final String price, final String vat, final String quantity) {
        try {
            tempInvoiceElements.add(new InvoiceElement(name, Double.parseDouble(price), Double.parseDouble(vat), Integer.parseInt(quantity)));
        } catch (Exception ex) {
            System.out.println("Adapter2: Exception caught" + ex);
        }
    }

    public static void createInvoice(final String deliveryDate) {
        InvoiceHandler.createInvoice(deliveryDate, tempClient, tempInvoiceElements);
        tempClient = new Client();
        tempInvoiceElements = new ArrayList<>();
    }
}
