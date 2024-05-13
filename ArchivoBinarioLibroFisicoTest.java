package GestionArchivos;

import Proyecto_Libreria.LibroAudio;
import Proyecto_Libreria.LibroFisico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArchivoBinarioLibroFisicoTest {

        private static final String RUTA_ARCHIVO = "test.bin";

        private ArchivoBinarioLibroFisico archivoBinarioLibroFisico;

        @BeforeEach
        void setUp() {
            archivoBinarioLibroFisico = new ArchivoBinarioLibroFisico();
            archivoBinarioLibroFisico.setRuta(RUTA_ARCHIVO);
        }

        @Test
        void guardarYRecuperarLibrosTest() {

            List<LibroFisico> librosList = new ArrayList<>();
            librosList.add(new LibroFisico());
            librosList.add(new LibroFisico());

            archivoBinarioLibroFisico.GuardarLibros(librosList);

            List<Byte> datosRecuperados = archivoBinarioLibroFisico.cargarLibros();

            assertTrue(!datosRecuperados.isEmpty(), "No se recuperaron datos del archivo");


            File file = new File(RUTA_ARCHIVO);
            if (file.exists()) {
                file.delete();
            }
        }
    }


