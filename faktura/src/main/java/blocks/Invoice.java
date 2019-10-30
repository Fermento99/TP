package blocks;

import java.util.Date;

public class Invoice {
    private final Date deliveryDate;
    private final int id; //NOPMD
    private final Client client;
    private final InvoiceElement[] invoiceElements;

    public Invoice(final Date deliveryDate, final int id, final Client client, final InvoiceElement[] invoiceElements) { //NOPMD
        this.deliveryDate = deliveryDate;
        this.id = id;
        this.client = client;
        this.invoiceElements = invoiceElements;
    }

    public Client getClient() {
        return client;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getId() {
        return id;
    }

    public InvoiceElement[] getInvoiceElements() {
        return invoiceElements;
    }

    public double totalTax() {
        double ac = 0; //NOPMD
        for (final InvoiceElement element : invoiceElements) {
            ac += element.totalValue();
        }
        return ac;
    }

    public double totalValue() {
        double ac = 0; //NOPMD
        for (final InvoiceElement element : invoiceElements) {
            ac += element.totalTax();
        }
        return ac;
    }
}
