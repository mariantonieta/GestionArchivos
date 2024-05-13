package GestionArchivos;

import Proyecto_Libreria.Libro;

import java.util.List;

public class ArchivoTextoLibroFisico extends ArchivoTexto{
    @Override
    void guardarLibros(List<Libro> libros) {
        super.guardarLibros(libros);
    }

    @Override
    public List<Libro> cargar() {
        return super.cargar();
    }
}
