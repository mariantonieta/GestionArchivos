import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ArchivoVentas extends Archivo{
    List<String> registro = new ArrayList<>();

    void guardarVenta(List<Venta> ventas){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(super.getRuta()))){
            bw.write("transaccion,");
            String datos = Venta.getFecha()+","+Venta.getCliente()+","+Venta.getLibrosVendidos()+","+Venta.calcularTotal();

            bw.write(datos);
            bw.newLine();
            registro.add(datos);


        }catch (IOException e) {
            System.out.println("archivo no encontrado IOException ");
        }

    }
    public List<Venta> cargar(){
        List<Venta> ventas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(super.getRuta()))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosVenta = linea.split(",");
                if (datosVenta.length >= 4) {
                    Date fecha = Date.valueOf(datosVenta[0].trim());
                    String cliente = datosVenta[1].trim();
                    String librosVendidos = datosVenta[2].trim();
                    Double total = Double.valueOf(datosVenta[3].trim());

                    Venta Venta = new Venta(fecha, cliente, librosVendidos,total);
                    ventas.add(Venta);
                }else {
                    System.out.println("no hay mas ventas  ");
                }
            }

        }catch (IOException e) {
            System.out.println("archivo no encontrado IOException ");
        }
        return ventas ;
    }
}
