import Proyecto_Libreria.LibroAudio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchivoBinarioLibroAudioTest {

    private static final String RUTA_ARCHIVO = "test.bin";

    private ArchivoBinarioLibroAudio archivoBinarioLibroAudio;

    @BeforeEach
    void setUp() {
        archivoBinarioLibroAudio = new ArchivoBinarioLibroAudio();
        archivoBinarioLibroAudio.setRuta(RUTA_ARCHIVO);
    }

    @Test
    void guardarYRecuperarLibrosTest() {

        List<LibroAudio> librosList = new ArrayList<>();
        librosList.add(new LibroAudio(55, "Gabriel García Márquez", "si"));
        librosList.add(new LibroAudio(5, "Antoine de Saint-Exupéry", "si"));

        archivoBinarioLibroAudio.guardarLibros(librosList);

        List<Byte> datosRecuperados = archivoBinarioLibroAudio.cargarLibros();

        assertTrue(!datosRecuperados.isEmpty(), "No se recuperaron datos del archivo");


        File file = new File(RUTA_ARCHIVO);
        if (file.exists()) {
            file.delete();
        }
    }
}
