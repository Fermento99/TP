package blocks;

public class InvoiceElement {
    private final String name;
    private final double price;
    private final double vat;
    private final int quantity;

    public InvoiceElement(final String name, final double price, final double vat, final int quantity) {
        this.name = name;
        this.price = price;
        this.vat = vat;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getVat() {
        return vat;
    }

    double totalTax() {
        return price * vat * quantity;
    }
    double totalValue() {
        return quantity * price;
    }
}
