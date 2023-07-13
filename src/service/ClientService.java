package service;

import entities.Client;

import java.util.ArrayList;
import java.util.Scanner;

//registrarCliente(): lo registra en el sistema.
//        obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
//        actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
//        de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
//        eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema
public class ClientService {
    private ArrayList<Client> clients = new ArrayList<>();

    public void registerClient() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Client client = new Client();
        System.out.println("Please insert the client's name: ");
        client.setName(scanner.next());
        System.out.println("Please insert the client's age: ");
        client.setAge(scanner.nextInt());
        System.out.println("Please insert the client's height: ");
        client.setHeight(scanner.nextDouble());
        System.out.println("Please insert the client's weight: ");
        client.setWeight(scanner.nextDouble());
        System.out.println("Please insert the client's objective: ");
        client.setObjective(scanner.next());
        clients.add(client);

        System.out.println("Client registered successfully!");
    }
    public ArrayList<Client> getClients() {
        return clients;
    }
    public boolean updateClient(int id, String name, int age, double height, double weight, String objective) {
        for (Client client : clients) {
            if (client.getId() == id) {
                client.setName(name);
                client.setAge(age);
                client.setHeight(height);
                client.setWeight(weight);
                client.setObjective(objective);
                return true;
            }
        }


        return false;
    }
}
