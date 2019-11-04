package handlers;

import blocks.Address;
import blocks.Client;

import java.util.ArrayList;

public class ClientHandler {
    private ArrayList<Client> clients;

    public Client createClient(final String name, final String surname, final Address address, final int pesel) {
        try {
            Client c = new Client(name, surname, address, pesel);
            clients.add(c);
            return c;
        }
        catch (Exception ex) { System.out.println("ClientHandler: Exception caught"); }
        return null;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
