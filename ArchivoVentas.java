<<<<<<< HEAD
=======
import Ventas.*;
import clientes.*;
import libros.*;
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

<<<<<<< HEAD
public class ArchivoVentas extends Archivo {
    ArrayList<Venta> ventas = new ArrayList<>();

    public void guardar(List<Venta> ventasGuardar) {
        File file = new File(super.getRuta());
        try {
=======
public class ArchivoVentas extends Archivo{
    ArrayList<Venta> ventas = new ArrayList<>();

    public void guardar(List<Venta> ventasGuardar){
        File file = new File(super.getRuta());
        try{
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);


<<<<<<< HEAD
            for (Venta v : ventasGuardar) {
                String datos = "";

                switch (v.getClass().getSimpleName()) {
                    case "Venta" -> {
                        datos += "Venta,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth() +
                                "," + v.getFechaEntrega().getYear() + "," + v.getFechaEntrega().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth();
                        bw.write(datos);
                    }
                    case "VentaMayorista" -> {
                        datos += "VentaMayorista,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth() +
                                "," + v.getFechaEntrega().getYear() + "," + v.getFechaEntrega().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth();
                        bw.write(datos);
                    }
                    case "VentaOnline" -> {
                        datos += "VentaOnline,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth() +
                                "," + v.getFechaEntrega().getYear() + "," + v.getFechaEntrega().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth();
=======
            for (Venta  v: ventasGuardar) {
                String datos = "";

                switch (v.getClass().getSimpleName()){
                    case "Venta"->{
                        datos += "Venta,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue()+ "," + v.getFechaVenta().getDayOfMonth()+
                                "," + v.getFechaEntrega().getYear() + "," + v.getFechaEntrega().getMonthValue() +","+ v.getFechaVenta().getDayOfMonth();
                        bw.write(datos);
                    }
                    case "VentaMayorista" ->{
                        datos += "VentaMayorista,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue()+ "," + v.getFechaVenta().getDayOfMonth()+
                                "," + v.getFechaEntrega().getYear() + "," + v.getFechaEntrega().getMonthValue() +","+ v.getFechaVenta().getDayOfMonth();
                        bw.write(datos);
                    }
                    case "VentaOnline" ->{
                        datos +="VentaOnline,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth()+
                                "," + v.getFechaEntrega().getYear() + "," + v.getFechaEntrega().getMonthValue() +","+ v.getFechaVenta().getDayOfMonth();
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                        bw.write(datos);
                    }
                    case "VentaPresencial" -> {
                        datos += "VentaPresencial,";
                        datos += v.getDescuento() + "," + v.getIdVenta() + "," + v.getPrecio()
                                + "," + v.getFechaVenta().getYear() + "," + v.getFechaVenta().getMonthValue() + "," + v.getFechaVenta().getDayOfMonth();
                        bw.write(datos);
                        bw.newLine();
                        VentaPresencial vp = (VentaPresencial) v;
                        Vendedor vendedor = vp.getVendedor();
                        bw.write(vendedorToString(vendedor));
                    }
                }
<<<<<<< HEAD
                List<Cliente> clientes = (List<Cliente>) v.getClientes();

               /* if (clientes.size() > 0) {
                    escribirCliente(bw, clientes.get(0));
                } else {
                    System.out.println("Venta sin cliente");
                }*/

                bw.newLine();
                escribirCliente(bw, v.getClientes());
=======

                bw.newLine();
                escribirCliente(bw, v.getCliente());
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                escribirLibros(bw, v.getLibrosVendidos());
                bw.newLine();
                bw.write("fin");

<<<<<<< HEAD
=======
             }
            bw.close();
            fw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Venta> cargar(){
        Scanner sc = new Scanner(System.in);
        File file = new File(super.getRuta());
        ArrayList<Venta> ventas1 = new ArrayList<>();
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (2+2aa != 5){
                String atributo = br.readLine();
                if (atributo == null) break;
                String[] atributos = atributo.split(",");

                Vendedor vendedor = null;
                Venta venta = new Venta();
                double Descuento = Double.parseDouble(atributos[1]);
                int idVenta = (Integer.parseInt(atributos[2]));
                double Precio = (Double.parseDouble(atributos[3]));
                LocalDate fechaDeVenta = LocalDate.of(Integer.parseInt(atributos[4]), Integer.parseInt(atributos[5]), Integer.parseInt(atributos[6]));

                if (atributos[0].equals("VentaPresencial")){
                    String[] vendedorAtrib = br.readLine().split(",");
                    vendedor = new Vendedor(vendedorAtrib[0], vendedorAtrib[1], vendedorAtrib[2], vendedorAtrib[3],vendedorAtrib[4]);
                }




                Cliente cliente = leerCliente(br);
                List<Libro> librosVendidos = new ArrayList<>();


                String libross = br.readLine();
                do{

                    librosVendidos.add(leerLibro(libross));
                    libross = br.readLine();
                }while (!libross.equals("fin"));
                //venta.setLibroVendidos(librosVendidos);






                switch (atributos[0]){
                    case "Venta" ->{
                        venta = new Venta(sc,fechaDeVenta, librosVendidos,cliente);
                        venta.setFechaEntrega(LocalDate.of(Integer.parseInt(atributos[7]), Integer.parseInt(atributos[8]), Integer.parseInt(atributos[9])));
                    }
                    case "VentaMayorista" ->{
                        venta = new VentaMayorista(sc, fechaDeVenta,librosVendidos, cliente);
                        venta.setFechaEntrega(LocalDate.of(Integer.parseInt(atributos[7]), Integer.parseInt(atributos[8]), Integer.parseInt(atributos[9])));
                    }
                    case "VentaOnline" ->{
                        venta = new VentaOnline(sc,fechaDeVenta,librosVendidos, cliente);
                        venta.setFechaEntrega(LocalDate.of(Integer.parseInt(atributos[7]), Integer.parseInt(atributos[8]), Integer.parseInt(atributos[9])));
                    }
                    case"VentaPresencial" -> venta = new VentaPresencial(sc, fechaDeVenta, librosVendidos,cliente, vendedor);
                }

                venta.setDescuento(Descuento);
                venta.setIdVenta(idVenta);
                venta.setPrecio(Precio);






            ventas1.add(venta);
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
            }
            bw.close();
            fw.close();

<<<<<<< HEAD
        } catch (IOException e) {
            e.printStackTrace();
=======






            ventas = ventas1;
        }catch (IOException e){
            System.out.println("hubo un error IOException");
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
        }
        return ventas1;
    }

    public ArrayList<Venta> cargar() {
        Scanner sc = new Scanner(System.in);
        File file = new File(super.getRuta());
        ArrayList<Venta> ventas1 = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (true) {
                String atributo = br.readLine();
                if (atributo == null) break;
                String[] atributos = atributo.split(",");

                Vendedor vendedor = null;
                Venta venta = new Venta();
                double Descuento = Double.parseDouble(atributos[1]);
                int idVenta = (Integer.parseInt(atributos[2]));
                double Precio = (Double.parseDouble(atributos[3]));
                LocalDate fechaDeVenta = LocalDate.of(Integer.parseInt(atributos[4]), Integer.parseInt(atributos[5]), Integer.parseInt(atributos[6]));

                if (atributos[0].equals("VentaPresencial")) {
                    String[] vendedorAtrib = br.readLine().split(",");
                    vendedor = new Vendedor(vendedorAtrib[0], vendedorAtrib[1], vendedorAtrib[2], vendedorAtrib[3], vendedorAtrib[4]);
                }


<<<<<<< HEAD
                Cliente cliente = leerCliente(br);
                List<Libro> librosVendidos = new ArrayList<>();


                String libross = br.readLine();
                do {

                    librosVendidos.add(leerLibro(libross));
                    libross = br.readLine();
                } while (!libross.equals("fin"));
                //venta.setLibroVendidos(librosVendidos);


                switch (atributos[0]) {
                    case "Venta" -> {
                        venta = new Venta(sc, fechaDeVenta, librosVendidos, (List<Cliente>) cliente);
                        venta.setFechaEntrega(LocalDate.of(Integer.parseInt(atributos[7]), Integer.parseInt(atributos[8]), Integer.parseInt(atributos[9])));
                    }
                    case "VentaMayorista" -> {
                        venta = new VentaMayorista(sc, fechaDeVenta, librosVendidos, (List<Cliente>) cliente);
                        venta.setFechaEntrega(LocalDate.of(Integer.parseInt(atributos[7]), Integer.parseInt(atributos[8]), Integer.parseInt(atributos[9])));
                    }
                    case "VentaOnline" -> {
                        venta = new VentaOnline(sc, fechaDeVenta, librosVendidos, (List<Cliente>) cliente);
                        venta.setFechaEntrega(LocalDate.of(Integer.parseInt(atributos[7]), Integer.parseInt(atributos[8]), Integer.parseInt(atributos[9])));
                    }
                    case "VentaPresencial" -> venta = new VentaPresencial(sc, fechaDeVenta, librosVendidos, (List<Cliente>) cliente, vendedor);
                }

                venta.setDescuento(Descuento);
                venta.setIdVenta(idVenta);
                venta.setPrecio(Precio);


                ventas1.add(venta);
            }


            ventas = ventas1;
        } catch (IOException e) {
            System.out.println("hubo un error IOException");
        }
        return ventas1;
    }


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("aaa","bbb","ccc",LocalDate.now(),2222222);
        Cliente cliente2 = new Cliente("lll","www","sss",LocalDate.now(),3333333);
        LibroAudio uno = new LibroAudio();
        uno.setDuracion(20);
        uno.setAutor("Juan");
        uno.setGenero("tanque T800");
        uno.setTitulo("Libro de Juan");
        uno.setDuracion(400);
        uno.setIdioma("es");
        uno.setPrecio(20);


=======

    public static void main(String[] args) {
        LibroAudio uno = new LibroAudio();
        uno.setDuracion(20);
        uno.setAutor("Juan");
        uno.setGenero("tanque T800");
        uno.setTitulo("Libro de Juan");
        uno.setDuracion(400);
        uno.setIdioma("es");
        uno.setPrecio(20);


>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
        LibroElectronico libroE = new LibroElectronico();
        libroE.setAutor("Pepe");
        libroE.setGenero("helicóptero Apache");
        libroE.setTitulo("libro de pepe");
        libroE.setPrecio(34);
        libroE.setFormato("PDF");

<<<<<<< HEAD
=======
        ClienteInternacional clienteInternacional = new ClienteInternacional(
                "Paolo", "Calle principal",
                "correo@gm.com", LocalDate.now().plusDays(12), 1231323);
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a

        Vendedor vendedor = new Vendedor("moja", "xf", "calle principal", "1231312", "asdad@asdad");

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(uno);
        libros.add(libroE);
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD

        List<Cliente> cliente = null;
        VentaPresencial ventaPresencial = new VentaPresencial(sc, LocalDate.now(), libros, cliente, vendedor);
=======
        VentaPresencial ventaPresencial = new VentaPresencial(sc,LocalDate.now(),libros, clienteInternacional,vendedor);
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
        ventaPresencial.setIdVenta(1);
        ventaPresencial.setDescuento(0);
        ventaPresencial.setPrecio(34);

        ArrayList<Venta> ventas1 = new ArrayList<>();

        ventas1.add(ventaPresencial);
        ArchivoVentas av = new ArchivoVentas();
        av.setRuta(System.getProperty("user.dir") + "\\src\\ventas.txt");
        av.guardar(ventas1);

        List<Venta> ventas = av.cargar();

    }

<<<<<<< HEAD

    private void escribirCliente(BufferedWriter bw, Cliente cliente) {
        try {
            switch (cliente.getClass().getSimpleName()) {

               /* case "ClienteInternacional" -> {
                    ClienteInternacional clienteInternacional = (ClienteInternacional) cliente;
                    bw.write("ClientesInternacional,");
                    String DatosClienteInternacinal = cliente.getNombre() + "," + cliente.getDireccion() + ","
                            + cliente.getEmail() + "," + cliente.getFechaRegistro() + ","
=======
    







    private void escribirCliente(BufferedWriter bw, Cliente cliente){
        try{
            switch (cliente.getClass().getSimpleName()) {

                case "ClienteInternacional" -> {
                    ClienteInternacional clienteInternacional = (ClienteInternacional) cliente;
                    bw.write("ClientesInternacional,");
                    String DatosClienteInternacinal =  cliente.getNombre()+ "," + cliente.getDireccion() + ","
                            +  cliente.getEmail() + "," + cliente.getFechaRegistro() + ","
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                            + cliente.getNumTelefono();

                    bw.write(DatosClienteInternacinal);
                    bw.newLine();

<<<<<<< HEAD
                }*/
                case "ClienteMayorista" -> {
                    ClienteMayorista clienteMayorista = (ClienteMayorista) cliente;
                    bw.write("ClientesMayorista,");
                    String DatosClienteMayorista = cliente.getNombre() + "," + cliente.getDireccion()
=======
                }
                case "ClienteMayorista" -> {
                    ClienteMayorista clienteMayorista = (ClienteMayorista) cliente;
                    bw.write("ClientesMayorista,");
                    String DatosClienteMayorista = cliente.getNombre() + "," +  cliente.getDireccion()
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                            + "," + cliente.getEmail() + "," + cliente.getFechaRegistro() + ","
                            + cliente.getNumTelefono();
                    bw.write(DatosClienteMayorista);
                    bw.newLine();
                }
                case "ClienteOnline" -> {
                    ClienteOnline clienteOnline = (ClienteOnline) cliente;
                    bw.write("ClienteOnline,");
<<<<<<< HEAD
                    String DatosClientesOnline = cliente.getNombre() + "," + cliente.getDireccion()
                            + "," + cliente.getEmail() + "," + cliente.getFechaRegistro()
                            + "," + cliente.getNumTelefono();
=======
                    String DatosClientesOnline =  cliente.getNombre() + "," + cliente.getDireccion()
                            + "," + cliente.getEmail() + ","  + cliente.getFechaRegistro()
                            +  "," + cliente.getNumTelefono();
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                    bw.write(DatosClientesOnline);
                    bw.newLine();

                }
                case "ClienteRegular" -> {
                    ClienteRegular clienteRegular = (ClienteRegular) cliente;
                    bw.write("ClienteRegular,");
                    String DatosClientesRegular = cliente.getNombre() + "," + cliente.getDireccion()
                            + "," + cliente.getEmail() + "," + cliente.getFechaRegistro()
<<<<<<< HEAD
                            + "," + cliente.getNumTelefono();
=======
                            +  "," + cliente.getNumTelefono();
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                    bw.write(DatosClientesRegular);
                    bw.newLine();


                }
                case "ClienteVIP" -> {
                    ClienteVIP ClienteVip = (ClienteVIP) cliente;
                    bw.write("ClientesVip,");
<<<<<<< HEAD
                    String DatosClienteVip = cliente.getNombre() + "," + cliente.getDireccion()
                            + "," + cliente.getEmail() + "," + cliente.getFechaRegistro()
                            + "," + cliente.getNumTelefono();
=======
                    String DatosClienteVip =  cliente.getNombre() + "," + cliente.getDireccion()
                            + "," + cliente.getEmail() + "," + cliente.getFechaRegistro()
                            +  "," + cliente.getNumTelefono();
>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
                    bw.write(DatosClienteVip);
                    bw.newLine();
                }
            }
<<<<<<< HEAD
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void escribirLibros(BufferedWriter bw, List<Libro> libros) {
        try {
            for (Libro libro : libros) {
                // determinar el tipo de libro y guardar en el archivo
                switch (libro.getClass().getSimpleName()) {
                    case "LibroAudio" -> {
                        LibroAudio libroAudio = (LibroAudio) libro;
                        bw.write("Audio,");
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," +
                                libro.getPrecio() + "," + libroAudio.getDuracion() + "," + libroAudio.getIdioma() + "," + libroAudio.getTasa();


                        bw.write(datos);
                        bw.newLine();


                    }
                    case "LibroInfantil" -> {
                        LibroInfantil libroInfantil = (LibroInfantil) libro;
                        bw.write("Infantil,");
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," + libro.getPrecio() + "," +
                                libroInfantil.getEdadRecomendada() + "," + libroInfantil.tieneIlustraciones() + "," + libroInfantil.getNumIlustraciones();

                        bw.write(datos);
                        bw.newLine();

                    }
                    case "LibroElectronico" -> {
                        bw.write("Electronico,");
                        LibroElectronico libroElectronico = (LibroElectronico) libro;
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," + libro.getPrecio() + "," +
                                libroElectronico.getFormato();
                        bw.write(datos);

                    }
                    case "LibroFisico" -> {
                        LibroFisico libroFisico = (LibroFisico) libro;
                        bw.write("Fisico,");
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," +
                                libro.getPrecio() + "," + libroFisico.getUbicacion();

                        bw.write(datos);
                        bw.newLine();


                    }
                    default ->
                            System.out.println("tipo de libro no encontrado");
                }

            }
        } catch (IOException e) {
            System.out.println("archivo no encontrado IOException ");
        }
    }

    private String vendedorToString(Vendedor vendedor) {
        return vendedor.getNombre() + "," + vendedor.getApellido() + "," +
                vendedor.getDireccion() + "," + vendedor.getTelefono() + "," +
                vendedor.getEmail();
    }
    private Cliente leerCliente(BufferedReader br) {
        Cliente cliente = null;
        try {
            String linea;

            linea = br.readLine();
            String[] datosCliente = linea.split(",");

            if (datosCliente.length >= 5) {
                String tipoCliente = datosCliente[0].trim();
                String nombre = datosCliente[1].trim();
                String direccion = datosCliente[2].trim();
                String email = datosCliente[3].trim();


                switch (tipoCliente) {
                /* case "ClientesInternacional":

                     cliente = new ClienteInternacional(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));

                     break;*/
                    case "ClientesMayorista":
                        cliente = new ClienteMayorista(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));


                        break;
                    case "ClientesOnline":
                        cliente = new ClienteOnline(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                        break;
                    case "ClientesRegular":
                        cliente = new ClienteRegular(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                        break;
                    case "ClientesVIP":
                        cliente = new ClienteVIP(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                        break;
                    default:
                        System.out.println("Tipo de cliente no reconocido: " + tipoCliente);
                }

            } else {
                System.out.println("La línea no tiene suficientes datos para crear un cliente: " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return cliente;
    }

    /*private Cliente leerCliente(BufferedReader br) {
        List<Cliente> cliente = null;
        try {
            String linea;

            linea = br.readLine();
            String[] datosCliente = linea.split(",");

            if (datosCliente.length >= 5) {
                String tipoCliente = datosCliente[0].trim();
                String nombre = datosCliente[1].trim();
                String direccion = datosCliente[2].trim();
                String email = datosCliente[3].trim();


                switch (tipoCliente) {
                    case "ClientesInternacional":

                        cliente = new ClienteInternacional(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));

                        break;
                    case "ClientesMayorista":
                        cliente = new ClienteMayorista(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));


                        break;
                    case "ClientesOnline":
                        cliente = new ClienteOnline(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                        break;
                    case "ClientesRegular":
                        cliente = new ClienteRegular(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                        break;
                    case "ClientesVIP":
                        cliente = new ClienteVIP(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                        break;
                    default:
                        System.out.println("Tipo de cliente no reconocido: " + tipoCliente);
                }

            } else {
                System.out.println("La línea no tiene suficientes datos para crear un cliente: " + cliente);
            }
        } catch (IOException e) {
            System.out.println("archivo no encontrado IOException ");
        }
        return cliente;
    }*/


    /*private Libro leerLibro(String infoLibro) { ////////////////CORREGIR AQUÍ CUANDO REGRESE
        Libro libro = null;
        String[] datosLibro = infoLibro.split(",");
        if (datosLibro.length >= 5) {
            String tipoLibro = datosLibro[0].trim(); // Primer campo indica el tipo de libro
            String titulo = datosLibro[1].trim();
            String autor = datosLibro[2].trim();
            String genero = datosLibro[3].trim();
            double precio = Double.parseDouble(datosLibro[4].trim());

            switch (tipoLibro) {
                case "Audio":
                    int duracion = Integer.parseInt(datosLibro[5].trim());

                    String idioma = datosLibro[6].trim(); // Obtener el idioma del libro de la posición correcta
                    String tasa = datosLibro[7].trim();
                    libro = new LibroAudio(titulo, autor, genero, precio, duracion, idioma, tasa);

                    break;
                case "Infantil":
                    int edadRecomendada = Integer.parseInt(datosLibro[5].trim()); // Obtener la edad recomendada
                    boolean ilustraciones = Boolean.parseBoolean(datosLibro[6].trim()); // Obtener si tiene ilustraciones
                    int numIlustraciones = Integer.parseInt(datosLibro[7].trim()); // Obtener el número de ilustraciones
                    libro = new LibroInfantil(titulo, autor, genero, precio, edadRecomendada, ilustraciones, numIlustraciones);
                    break;
                case "Electronico":
                    String formato = datosLibro[5].trim(); // Obtener el formato del libro electrónico
                    libro = new LibroElectronico(titulo, autor, genero, precio, formato);

                    break;
                case "Fisico":
                    String ubicacion = datosLibro[5].trim(); // Obtener la ubicación física del libro
                    libro = new LibroFisico(titulo, autor, genero, precio, ubicacion);

                    break;
                default:
                    // Manejo de otros tipos de libros
                    System.out.println("tipo de libro no encontrado");
                    break;
            }

        } else {
            System.out.println("La línea no tiene suficientes datos para crear un libro: " + infoLibro);
        }
        return libro;
    }*/
    private Libro leerLibro(String infoLibro) {
        Libro libro = null;
        String[] datosLibro = infoLibro.split(",");

        if (datosLibro.length >= 6) {
            String tipoLibro = datosLibro[0].trim();
            String titulo = datosLibro[1].trim();
            String autor = datosLibro[2].trim();
            String genero = datosLibro[3].trim();

            try {
                double precio = Double.parseDouble(datosLibro[4].trim());

                switch (tipoLibro) {
                    case "Audio":
                        int duracion = Integer.parseInt(datosLibro[5].trim());
                        String idioma = datosLibro[5].trim();
                        String tasa = datosLibro[6].trim();
                        libro = new LibroAudio(titulo, autor, genero, precio, duracion, idioma, tasa);

                        break;
                    case "Infantil":
                        int edadRecomendada = Integer.parseInt(datosLibro[5].trim());
                        boolean ilustraciones = Boolean.parseBoolean(datosLibro[6].trim());
                        int numIlustraciones = Integer.parseInt(datosLibro[7].trim());
                        libro = new LibroInfantil(titulo, autor, genero, precio, edadRecomendada, ilustraciones, numIlustraciones);

                        break;
                    case "Electronico":
                        String formato = datosLibro[5].trim();
                        libro = new LibroElectronico(titulo, autor, genero, precio, formato);

                        break;
                    case "Fisico":
                        String ubicacion = datosLibro[5].trim();
                        libro = new LibroFisico(titulo, autor, genero, precio, ubicacion);

                        break;
                    default:
                        System.out.println("Tipo de libro no encontrado: " + tipoLibro);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el precio a double: " + datosLibro[4]);
            }

        } else {
            System.out.println("La línea no tiene suficientes datos para crear un libro: " + infoLibro);
        }

        return libro;
    }


=======
        }catch (Exception e){
        System.out.println(e);
    }
    }

    private void escribirLibros(BufferedWriter bw, List<Libro> libros){
        try{
            for (Libro libro : libros) {
                // Determinar el tipo de libro y guardar en el archivo
                switch (libro.getClass().getSimpleName()) {
                    case "LibroAudio" -> {
                        LibroAudio libroAudio = (LibroAudio) libro;
                        bw.write("Audio,");
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," +
                                libro.getPrecio() + "," + libroAudio.getDuracion() + "," + libroAudio.getIdioma()+ "," + libroAudio.getTasa();


                        bw.write(datos);
                        bw.newLine();


                    }
                    case "LibroInfantil" -> {
                        LibroInfantil libroInfantil = (LibroInfantil) libro;
                        bw.write("Infantil,");
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," + libro.getPrecio() + "," +
                                libroInfantil.getEdadRecomendada() + "," + libroInfantil.tieneIlustraciones() + "," + libroInfantil.getNumIlustraciones();

                        bw.write(datos);
                        bw.newLine(); // Nueva línea para el próximo libro

                    }
                    case "LibroElectronico" -> {
                        bw.write("Electronico,");
                        LibroElectronico libroElectronico = (LibroElectronico) libro;
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," + libro.getPrecio() + "," +
                                libroElectronico.getFormato();
                        bw.write(datos);

                    }
                    case "LibroFisico" -> {
                        LibroFisico libroFisico = (LibroFisico) libro;
                        bw.write("Fisico,");
                        String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," +
                                libro.getPrecio() + "," + libroFisico.getUbicacion();

                        bw.write(datos);
                        bw.newLine();


                    }
                    default ->
                            System.out.println("tipo de libro no encontrado"); // Puedes agregar más tipos de libros según sea necesario
                }

            }
        } catch (IOException e) {
            System.out.println("archivo no encontrado IOException ");
        }
    }

    private String vendedorToString(Vendedor vendedor){
        return vendedor.getNombre() + ","+ vendedor.getApellido()+ ","+
                vendedor.getDireccion() + "," + vendedor.getTelefono() + ","+
                vendedor.getEmail();
    }

    private Cliente leerCliente(BufferedReader br){
        Cliente cliente = null;
        try{
            String linea;

            linea = br.readLine();
            String[] datosCliente = linea.split(",");

                if (datosCliente.length >= 5) {
                    String tipoCliente = datosCliente[0].trim();
                    String nombre = datosCliente[1].trim();
                    String direccion = datosCliente[2].trim();
                    String email = datosCliente[3].trim();



                    switch (tipoCliente) {
                        case "ClientesInternacional":

                            cliente = new ClienteInternacional(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                            // Realizar acciones específicas para clientes internacionales
                            break;
                        case "ClientesMayorista":
                            cliente = new ClienteMayorista(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                            // Realizar acciones específicas para clientes mayoristas

                            break;
                        case "ClientesOnline":
                            cliente = new ClienteOnline(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                            break;
                        case "ClientesRegular":
                            cliente = new ClienteRegular(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                            break;
                        case "ClientesVIP":
                            cliente = new ClienteVIP(nombre, direccion, email, LocalDate.parse(datosCliente[4].trim()), Integer.parseInt(datosCliente[5].trim()));
                            break;
                        default:
                            System.out.println("Tipo de cliente no reconocido: " + tipoCliente);
                    }

                } else {
                    System.out.println("La línea no tiene suficientes datos para crear un cliente: " + cliente);
                }
            }catch (IOException e) {
            System.out.println("archivo no encontrado IOException ");}

        return cliente;
    }

    private Libro leerLibro(String infoLibro){ ////////////////CORREGIR AQUÍ CUANDO REGRESE
        Libro libro = null;
        String[] datosLibro = infoLibro.split(",");
        if (datosLibro.length >= 5) {
            String tipoLibro = datosLibro[0].trim(); // Primer campo indica el tipo de libro
            String titulo = datosLibro[1].trim();
            String autor = datosLibro[2].trim();
            String genero = datosLibro[3].trim();
            double precio = Double.parseDouble(datosLibro[4].trim());

            switch (tipoLibro) {
                case "Audio":
                    int duracion = Integer.parseInt(datosLibro[5].trim());

                    String idioma = datosLibro[6].trim(); // Obtener el idioma del libro de la posición correcta
                    String tasa = datosLibro[7].trim();
                    libro = new LibroAudio(titulo, autor, genero, precio, duracion, idioma, tasa);

                    break;
                    case "Infantil":
                        int edadRecomendada = Integer.parseInt(datosLibro[5].trim()); // Obtener la edad recomendada
                        boolean ilustraciones = Boolean.parseBoolean(datosLibro[6].trim()); // Obtener si tiene ilustraciones
                        int numIlustraciones = Integer.parseInt(datosLibro[7].trim()); // Obtener el número de ilustraciones
                        libro = new LibroInfantil(titulo, autor, genero, precio, edadRecomendada, ilustraciones, numIlustraciones);
                        break;
                        case "Electronico":
                            String formato = datosLibro[5].trim(); // Obtener el formato del libro electrónico
                            libro = new LibroElectronico(titulo, autor, genero, precio, formato);

                            break;
                        case "Fisico":
                            String ubicacion = datosLibro[5].trim(); // Obtener la ubicación física del libro
                            libro = new LibroFisico(titulo, autor, genero, precio, ubicacion);

                            break;
                        default:
                            // Manejo de otros tipos de libros
                            System.out.println("tipo de libro no encontrado");
                            break;
                    }

                } else {
                    System.out.println("La línea no tiene suficientes datos para crear un libro: " + infoLibro);
                }
        return libro;
    }

>>>>>>> 765e4c6c519472c64a7acb2da0bbe7949738250a
}
