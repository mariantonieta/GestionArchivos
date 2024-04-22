package GestionArchivos;

import Clientes.proyecto_Daw_Yarel.Cliente;
import Clientes.proyecto_Daw_Yarel.ClienteInternacional;

import java.util.*;
import java.time.LocalDate;


public class PruebaArchivoCliente {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2004,10,05);
        ClienteInternacional cliente = new ClienteInternacional("Anto", "Calle hermanos gomezz", "antohsjads", fecha, 697313663);
        ClienteInternacional cliente2 = new ClienteInternacional("Anto", "Calle hermanos gomezz", "antohsjads", fecha, 697313663);
        ClienteInternacional cliente3 = new ClienteInternacional("Anto", "Calle hermanos gomezz", "antohsjads", fecha, 697313663);
        ArchivoCliente archivo = new ArchivoCliente();
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente2);
        archivo.setRuta("file.txt");
        archivo.guardarClientes(clientes);
        for (Cliente clien : clientes){
        System.out.println(clien);
    }
    }
}
