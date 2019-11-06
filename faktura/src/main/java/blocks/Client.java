package blocks;

import javax.management.BadAttributeValueExpException;

public class Client {
    private final String name;
    private final String surname;
    private final Address address;
    private final int pesel;

    public Client() {
        name = "";
        surname = "";
        address = new Address();
        pesel = 0;
    }

    public Client(final String name, final String surname, final Address address, final int pesel) throws BadAttributeValueExpException {
        if (!(validate(/*pesel*/ address))) {
            throw new BadAttributeValueExpException("address");
        }
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getPesel() {
        return pesel;
    }

    public String getSurname() {
        return surname;
    }

    private boolean validate(/*final int pesel*/ final Address address) {
        return checkPESEL(/*pesel*/) && checkAddress(address);

    }
    //doesn't exist yet
    private boolean checkPESEL(/*final int pesel*/) {
        return true;
    }

    private boolean checkAddress(final Address address) {
        return Address.check(address);
    }
}

