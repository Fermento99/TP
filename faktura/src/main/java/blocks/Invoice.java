package blocks;

import java.util.Date;

public class Invoice {
    private final Date deliveryDate;
    private final int ID;
    private final Client client;
    private final InvoiceElement[] invoiceElements;

    public Invoice(Date deliveryDate, int id, Client client, InvoiceElement[] invoiceelements) {
        this.deliveryDate = deliveryDate;
        this.ID = id;
        this.client = client;
        this.invoiceElements = invoiceelements;
    }

    public Client getClient() {
        return client;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getID() {
        return ID;
    }

    public InvoiceElement[] getInvoiceElements() {
        return invoiceElements;
    }

    public double totalTax(){
        double ac = 0;
        for (InvoiceElement element : invoiceElements) {
            ac += element.totalValue();
        }
        return ac;
    }

    public double totalValue() {
        double ac = 0;
        for (InvoiceElement element : invoiceElements) {
            ac += element.totalTax();
        }
        return ac;
    }
}
