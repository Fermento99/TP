package app;

import gui.MainFrame;
import handlers.InvoiceHandler;

public abstract class Faktura {
    public static void main(final String[] args) {
        new MainFrame();
        InvoiceHandler.loadInvoicesFromDB();
    }
}
