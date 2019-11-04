package handlers;

import blocks.Client;
import blocks.Invoice;
import blocks.InvoiceElement;

import java.util.ArrayList;

public class InvoiceHandler {
    private static ArrayList<Invoice> invoices = new ArrayList<Invoice>();
    private static int invoiceId = 0;

    public static void createInvoice(final String deliveryDate, final Client client, final ArrayList<InvoiceElement> invoiceElements) {
        invoiceId++;
        invoices.add(new Invoice(deliveryDate, invoiceId, client, invoiceElements));
    }

    public static ArrayList<Invoice> getInvoices() {
        return invoices;
    }
    public static Invoice getInvoice(int id) { return invoices.get(--id); }
}
