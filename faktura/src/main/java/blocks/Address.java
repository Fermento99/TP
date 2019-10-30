package blocks;

public class Address {
    private final String street;
    private final String city;
    private final String country;
    private final int postalCode;
    private final int houseNr;
    private final int flatNr;


    public Address(final String street, final String city, final String country, final int postalCode, final int houseNr, final int flatNr) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.houseNr = houseNr;
        this.flatNr = flatNr;
    }

    // doesn't exist yet
    static boolean check(Address adress) {
        return true;
    }
}