<<<<<<< HEAD
package GestionArchivos;

=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
>>>>>>> 2dc568a7123b325081f7176eb35206d8411f33a8
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
