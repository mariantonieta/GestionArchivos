import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoTextoLibroInfantil extends ArchivoTexto {

    @Override
    void guardarLibros(List<Libro> libros) {
        super.guardarLibros(libros);
    }

    @Override
    public List<Libro> cargar() {
        List<Libro> libros = super.cargar(); // Llama al método cargar() de la superclase

        // Aquí puedes realizar cualquier procesamiento adicional necesario para los libros infantiles

        return libros;

    }
}
