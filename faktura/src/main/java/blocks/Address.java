package blocks;

public class Address {
    private final String street;
    private final String city;
    private final String country;
    private final String postalCode;
    private final int houseNr;
    private final int flatNr;

    public Address() {
        street = "";
        city = "";
        country = "";
        postalCode = "";
        houseNr = 0;
        flatNr = 0;
    }

    public Address(final String street, final int houseNr, final int flatNr, final String city, final String country, final String postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.houseNr = houseNr;
        this.flatNr = flatNr;
    }

    public int getFlatNr() {
        return flatNr;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    // doesn't exist yet
    /* package */ static boolean check(final Address adress) {
        return true;
    }
}
