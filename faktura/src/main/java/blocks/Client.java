package blocks;

public class Client {
    private final String name;
    private final String surname;
    private final Address adress;
    private final int PESEL;

    public Client(final String name, final String surname, final Address adress, final int PESEL) throws Exception{
        if(!(validate(PESEL, adress)))
            throw new Exception();
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.PESEL = PESEL;
    }

    private boolean validate(int PESEL, Address adress) {
        return (checkPESEL(PESEL) && checkAdress(adress));

    }
    //doesn't exist yet
    private boolean checkPESEL(int pesel) {
        return true;
    }

    private boolean checkAdress(Address adress){
        return Address.check(adress);
    }
}

