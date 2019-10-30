package blocks;

public class InvoiceElement {
    private final String name;
    private final double prize;
    private final double vat;
    private final int quantity;

    public InvoiceElement(final String name, final double prize, final double vat, final int quantity) {
        this.name = name;
        this.prize = prize;
        this.vat = vat;
        this.quantity = quantity;
    }

    public double getPrize() {
        return prize;
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

    public double totalTax() {
        return prize * vat * quantity;
    }
    public double totalValue() {
        return quantity * prize;
    }
}
