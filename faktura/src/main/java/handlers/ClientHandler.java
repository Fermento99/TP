package handlers;

import blocks.Address;
import blocks.Client;

import java.util.ArrayList;

public class ClientHandler {
    private static ArrayList<Client> clients = new ArrayList<Client>();

    public static Client createClient(final String name, final String surname, final Address address, final int pesel) {
        try {
            Client c = new Client(name, surname, address, pesel);
            clients.add(c);
            return c;
        }
        catch (Exception ex) { System.out.println("ClientHandler: Exception caught"+ex); }
        return null;
    }

    public static ArrayList<Client> getClients() {
        return clients;
    }
}
