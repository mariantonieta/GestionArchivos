import Proyecto_Libreria.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
@DisplayName("Archivo Test")

class ArchivoTest {


    @Test
    @DisplayName("Leer archivo devuelve lista no vacía")
    void testCargarLibros() {
            ArchivoTexto archivo = new ArchivoTexto();
        archivo.setRuta(System.getProperty("user.dir") + File.separator + "file.txt");

            List<Libro> librosCargados = archivo.cargar();
        LibroAudio libroAudio = new LibroAudio("Canción de Hielo y Fuego", "George R. R. Martin", "Fantasía", 25.99, 600, "Español", "55");
        LibroInfantil libroInfantil = new LibroInfantil("El Principito", "Antoine de Saint-Exupéry", "Infantil", 10.50, 6, true, 20);
        LibroElectronico libroElectronico = new LibroElectronico("Clean Code", "Robert C. Martin", "Programación", 35.99, "PDF");
        LibroFisico libroFisico = new LibroFisico("1984", "George Orwell", "Distopía", 15.99, "Sala 3, Estantería 2, Balda 1");

        List<Libro> libros = new ArrayList<>();
        libros.add(libroAudio);
        libros.add(libroInfantil);
        libros.add(libroElectronico);
        libros.add(libroFisico);
        archivo.guardarLibros(libros);

            assertFalse(librosCargados.isEmpty(), "La lista de libros no debería estar vacía");

            assertEquals(3, librosCargados.size(), "Deberían haberse cargado 4 libros");



            for (Libro libro : librosCargados) {
                System.out.println(libro);
            }
        }
    }