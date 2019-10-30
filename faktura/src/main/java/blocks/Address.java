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

    public int getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    // doesn't exist yet
    public static boolean check(final Address adress) {
        return true;
    }
}
