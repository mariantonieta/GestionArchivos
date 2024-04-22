
package GestionArchivos;

import Clientes.proyecto_Daw_Yarel.Cliente;
import Clientes.proyecto_Daw_Yarel.*;

import java.io.*;
import java.util.*;


public class ArchivoCliente extends Archivo{

    List <String> registro = new ArrayList<>();
    void guardarClientes(List<Cliente> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(super.getRuta()))){
            for (Cliente cliente : clientes) {
                switch (cliente.getClass().getSimpleName()) {

                    case "ClienteInternacional" -> {
                        ClienteInternacional clienteInternacional = (ClienteInternacional) cliente;
                        bw.write("CLientesInternacional");
                        String DatosClienteInternacinal =  cliente.getNombre()+ "," + cliente.getDireccion() + ","
                                +  cliente.getEmail() + "," + cliente.getFechaRegistro() + ","
                                + cliente.getNumTelefono();

                        bw.write(DatosClienteInternacinal);
                        bw.newLine();

                        registro.add(clienteInternacional.toString());
                    }
                    case "ClienteMayorista" -> {
                        ClienteMayorista clienteMayorista = (ClienteMayorista) cliente;
                        bw.write("ClientesMayorista");
                        String DatosClienteMayorista = cliente.getNombre() + "," +  cliente.getDireccion()
                                + "," + cliente.getEmail() + "," + cliente.getFechaRegistro() + ","
                                + cliente.getNumTelefono();
                        bw.write(DatosClienteMayorista);
                        bw.newLine();

                        registro.add(clienteMayorista.toString());
                    }
                    case "ClienteOnline" -> {
                        ClienteOnline clienteOnline = (ClienteOnline) cliente;
                        bw.write("ClienteOnline");
                        String DatosClientesOnline =  cliente.getNombre() + "," + cliente.getDireccion()
                                + "," + cliente.getEmail() + ","  + cliente.getFechaRegistro()
                                +  "," + cliente.getNumTelefono();
                        bw.write(DatosClientesOnline);
                        bw.newLine();

                        registro.add(clienteOnline.toString());
                    }
                    case "ClienteRegular" -> {
                        ClienteRegular clienteRegular = (ClienteRegular) cliente;
                        bw.write("ClienteRegular");
                        String DatosClientesRegular = cliente.getNombre() + "," + cliente.getDireccion()
                                + "," + cliente.getEmail() + "," + cliente.getFechaRegistro()
                                +  "," + cliente.getNumTelefono();
                        bw.write(DatosClientesRegular);
                        bw.newLine();

                        registro.add(clienteRegular.toString());

                    }
                    case "ClienteVip" -> {
                        ClienteVIP ClienteVip = (ClienteVIP) cliente;
                        bw.write("ClienteVip");
                        String DatosClienteVip =  cliente.getNombre() + "," + cliente.getDireccion()
                                + "," + cliente.getEmail() + "," + cliente.getFechaRegistro()
                                +  "," + cliente.getNumTelefono();
                        bw.write(DatosClienteVip);
                        bw.newLine();

                        registro.add(ClienteVip.toString());
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
