package handlers;

import blocks.Address;
import blocks.Client;

public abstract class ClientHandler {

    public static Client createClient(final String name, final String surname, final Address address, final String pesel) {
        Client client = null;
        try {
            client = new Client(name, surname, address, pesel);
        } catch (Exception ex) {
            System.out.println("ClientHandler: Exception caught" + ex);
        }
        return client;
    }
}
