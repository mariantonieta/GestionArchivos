import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear diferentes tipos de libros
        LibroAudio libroAudio = new LibroAudio("Canción de Hielo y Fuego", "George R. R. Martin", "Fantasía", 25.99, 600, "Español", "55");
        LibroInfantil libroInfantil = new LibroInfantil("El Principito", "Antoine de Saint-Exupéry", "Infantil", 10.50, 6, true, 20);
        LibroElectronico libroElectronico = new LibroElectronico("Clean Code", "Robert C. Martin", "Programación", 35.99, "PDF");
        LibroFisico libroFisico = new LibroFisico("1984", "George Orwell", "Distopía", 15.99, "Sala 3, Estantería 2, Balda 1");

        // Guardar los libros en un archivo de texto
        ArchivoTexto archivo = new ArchivoTexto();
        List<Libro> libros = new ArrayList<>();
        libros.add(libroAudio);
        libros.add(libroInfantil);
        libros.add(libroElectronico);
        libros.add(libroFisico);
        archivo.guardarLibros(libros);

        // Cargar los libros desde el archivo de texto
        archivo.setRuta(System.getProperty("user.dir") + "\\src\\file.txt");
        List<Libro> librosCargados = archivo.cargar();

        // Imprimir los libros cargados en la consola
        for (Libro libro : librosCargados) {
            System.out.println(libro);
        }
    }
}

