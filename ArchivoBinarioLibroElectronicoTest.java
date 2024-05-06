import Proyecto_Libreria.LibroAudio;
import Proyecto_Libreria.LibroElectronico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArchivoBinarioLibroElectronicoTest {

    private static final String RUTA_ARCHIVO = "test.bin";

    private ArchivoBinarioLibroElectronico archivoBinarioLibroElectronico;

    @BeforeEach
    void setUp() {
        archivoBinarioLibroElectronico = new ArchivoBinarioLibroElectronico();
        archivoBinarioLibroElectronico.setRuta(RUTA_ARCHIVO);
    }

    @Test
    void guardarYRecuperarLibrosTest() {

        List<LibroElectronico> librosList = new ArrayList<>();
        librosList.add(new LibroElectronico("ww" ));
        librosList.add(new LibroElectronico("si"));

        archivoBinarioLibroElectronico.GuardarLibros(librosList);

        List<Byte> datosRecuperados = archivoBinarioLibroElectronico.cargarLibros();

        assertTrue(!datosRecuperados.isEmpty(), "No se recuperaron datos del archivo");


        File file = new File(RUTA_ARCHIVO);
        if (file.exists()) {
            file.delete();
        }
    }
}
