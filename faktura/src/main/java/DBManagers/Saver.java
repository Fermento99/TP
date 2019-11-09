package DBManagers;

import blocks.Invoice;

import java.util.ArrayList;

public interface Saver {

    void saveInvoices(ArrayList<Invoice> invoices);
}
