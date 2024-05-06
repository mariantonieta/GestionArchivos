import Proyecto_Libreria.LibroAudio;
import Proyecto_Libreria.LibroInfantil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArchivoBinarioLibroInfantilTest {


        private static final String RUTA_ARCHIVO = "test.bin";

        private ArchivoBinarioLibroInfantil archivoBinarioLibroInfantil;

        @BeforeEach
        void setUp() {
            archivoBinarioLibroInfantil = new ArchivoBinarioLibroInfantil();
            archivoBinarioLibroInfantil.setRuta(RUTA_ARCHIVO);
        }

        @Test
        void guardarYRecuperarLibrosTest() {

            List<LibroInfantil> librosList = new ArrayList<>();
            librosList.add(new LibroInfantil(5,true, 5));
            librosList.add(new LibroInfantil(5, true, 5));

            archivoBinarioLibroInfantil.GuardarLibros(librosList);

            List<Byte> datosRecuperados = archivoBinarioLibroInfantil.cargarLibros();

            assertTrue(!datosRecuperados.isEmpty(), "No se recuperaron datos del archivo");


            File file = new File(RUTA_ARCHIVO);
            if (file.exists()) {
                file.delete();
            }
        }}

