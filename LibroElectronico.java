import java.io.Serializable;
import java.util.Scanner;

public class LibroElectronico extends Libro implements Serializable {
    String formato;

    public LibroElectronico() {
    }

    public LibroElectronico(String formato) {this.formato = formato;}

    public LibroElectronico(String titulo, String autor, String genero, double precio, String formato) {
        super(titulo, autor, genero, precio);
        this.formato = formato;
    }

    public String getFormato() {return formato;}

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean verificarCompatibilidadDispositivo(String dispositivo, Scanner sc) {
        System.out.println("Dime el nombre del dispositivo:");
        String nombreDisp = sc.next();
        System.out.println("Dime el nombre del formato:");
        String nombreForm = sc.next();
        if (dispositivo.equalsIgnoreCase(nombreDisp) && formato.equalsIgnoreCase(nombreForm)) {
            return true;
        } else {
            return false;
        }
    }

    public void convertirAFormato( String formatoNuevo) {
        if (formatoNuevo == formato) {
            System.out.println("ha elejido el mismo formato");
        } else System.out.println("su libro ha sido convertido correctamente a: "+ formatoNuevo);
        formato = formatoNuevo;
    }
}

