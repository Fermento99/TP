package handlers;

import blocks.Address;
import blocks.Client;

import java.util.ArrayList;

public class ClientHandler {

    public static Client createClient(final String name, final String surname, final Address address, final int pesel) {
        try {
            return new Client(name, surname, address, pesel);
        }
        catch (Exception ex) { System.out.println("ClientHandler: Exception caught"+ex); }
        return null;
    }
}
