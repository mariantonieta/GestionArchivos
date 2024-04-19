import java.util.List;

public class ArchivoTextoLibroElectronico extends ArchivoTexto{

    @Override
    void guardarLibros(List<Libro> libros) {
        super.guardarLibros(libros);
    }

    @Override
    public List<Libro>  cargar() {
      return   super.cargar();
    }
}
