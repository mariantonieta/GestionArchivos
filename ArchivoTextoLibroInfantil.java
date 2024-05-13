package GestionArchivos;

import Proyecto_Libreria.Libro;

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
