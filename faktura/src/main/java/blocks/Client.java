package blocks;

public class Client {
    private final String name;
    private final String surname;
    private final Address address;
    private final int pesel;

    public Client(final String name, final String surname, final Address address, final int pesel) throws Exception {
        if (!(validate(pesel, address))) {
            throw new Exception();
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

    private boolean validate(final int pesel, final Address adress) {
        return checkPESEL(pesel) && checkAddress(adress);

    }
    //doesn't exist yet
    private boolean checkPESEL(final int pesel) {
        return true;
    }

    private boolean checkAddress(final Address adress) {
        return Address.check(adress);
    }
}

