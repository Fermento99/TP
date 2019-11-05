package adapters;

import blocks.Address;
import blocks.Client;
import blocks.Invoice;
import blocks.InvoiceElement;
import handlers.ClientHandler;
import handlers.InvoiceHandler;

import java.util.ArrayList;
import java.util.Date;

public class Adapter {
    private static Client tempClient;
    private static ArrayList<InvoiceElement> tempInvoiceElements = new ArrayList<InvoiceElement>();

    public static void createClient(String name, String surname, String pesel, Address address) {
        tempClient = ClientHandler.createClient(name,surname,address,Integer.parseInt(pesel));
    }

    public static Address createAdress(String street, String houseNr, String flatNr, String city, String country, String postalCode) {
        try { return new Address(street, Integer.parseInt(houseNr), Integer.parseInt(flatNr),city,country, postalCode); }
        catch (Exception ex) { System.out.println("Adapter: Exception caught"+ex);}
        return null;
    }

    public static void createItem(String name, String price, String vat, String quantity) {
        try { tempInvoiceElements.add(new InvoiceElement(name, Double.parseDouble(price), Double.parseDouble(vat), Integer.parseInt(quantity))); }
        catch (Exception ex) { System.out.println("Adapter2: Exception caught"+ex); }
    }

    public static void createInvoice(String deliveryDate) {
        InvoiceHandler.createInvoice(deliveryDate, tempClient, tempInvoiceElements);
        tempClient = null;
        tempInvoiceElements = new ArrayList<InvoiceElement>();
    }
}
