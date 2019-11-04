package handlers;

import blocks.Client;
import blocks.Invoice;
import blocks.InvoiceElement;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHandler {
    private ArrayList<Invoice> invoices = null;

    public void createInvoice(final Date deliveryDate, final int id, final Client client, final InvoiceElement[] invoiceElements) {
        invoices.add(new Invoice(deliveryDate, id, client, invoiceElements));
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }
}
