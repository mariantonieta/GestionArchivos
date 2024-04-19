import java.io.*;
import java.util.*;


public class ArchivoTexto extends Archivo {
    List <String> registro = new ArrayList<>();
    void guardarLibros(List<Libro> libros) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
            for (Libro libro : libros) {
                // Determinar el tipo de libro y guardar en el archivo
                if (libro.getClass().getSimpleName().equals("LibroAudio")){
                    LibroAudio libroAudio = (LibroAudio) libro;
                    bw.write("Audio,");
                    String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," +
                            libro.getPrecio() + "," + libroAudio.getDuracion() + "," + libroAudio.getIdioma() + "," + libroAudio.getTasa();
                    /*
                    bw.write(libro.getTitulo() + ",");
                    bw.write(libro.getAutor() + ",");
                    bw.write(libro.getGenero() + ",");
                    bw.write(libro.getPrecio() + ",");
                    bw.write(libroAudio.getDuracion() + ",");
                    bw.write(libroAudio.getIdioma());

                     */
                    bw.write(datos);
                    bw.newLine();

                    registro.add(libroAudio.toString());




                }else if (libro.getClass().getSimpleName().equals("LibroInfantil")) {
                    LibroInfantil libroInfantil = (LibroInfantil) libro;
                    bw.write("Infantil,");
                    String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," + libro.getPrecio() + "," +
                            libroInfantil.getEdadRecomendada() + "," + libroInfantil.tieneIlustraciones() + "," + libroInfantil.getNumIlustraciones();
                    /*
                    bw.write(libro.getTitulo() + ",");
                    bw.write(libro.getAutor() + ",");
                    bw.write(libro.getGenero() + ",");
                    bw.write(libro.getPrecio() + ",");
                    bw.write(libroInfantil.getEdadRecomendada() + ",");
                    bw.write(libroInfantil.tieneIlustraciones() + ",");
                    bw.write(libroInfantil.getNumIlustraciones());
                    */
                    bw.write(datos);
                    bw.newLine(); // Nueva línea para el próximo libro
                    registro.add("Infantil," + datos);




                } else if (libro.getClass().getSimpleName().equals("LibroElectronico")) {
                    bw.write("Electronico,");
                    LibroElectronico libroElectronico = (LibroElectronico) libro;
                    String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," + libro.getPrecio() + "," +
                            libroElectronico.getFormato() ;
                    /*
                    bw.write(libro.getTitulo() + ",");
                    bw.write(libro.getAutor() + ",");
                    bw.write(libro.getGenero() + ",");
                    bw.write(libro.getPrecio() + ",");
                    bw.write(libroElectronico.getFormato());
                    bw.newLine();
                     */
                    bw.write(datos);
                    registro.add("Elecctronico," + datos);







                } else if (libro.getClass().getSimpleName().equals("LibroFisico")){
                    LibroFisico libroFisico = (LibroFisico) libro;
                    bw.write("Fisico,");
                    String datos = libro.getTitulo() + "," + libro.getAutor() + "," + libro.getGenero() + "," +
                            libro.getPrecio() + "," + libroFisico.getUbicacion();
                    /*
                    bw.write(libro.getTitulo() + ",");
                    bw.write(libro.getAutor() + ",");
                    bw.write(libro.getGenero() + ",");
                    bw.write(libro.getPrecio() + ",");
                    bw.write(libroFisico.getUbicacion());

                     */
                    bw.write(datos);
                    bw.newLine();




                } else {
                    bw.newLine(); // Puedes agregar más tipos de libros según sea necesario
                }
/*
                bw.write(libro.toString());
                bw.newLine(); // Nueva línea para el próximo libro

 */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Libro> cargar() { // así como tu quiere a mikasa , yo quiero a esta de aca
        List<Libro> libros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosLibro = linea.split(",");

                for(String a : datosLibro) {System.out.println(a);}


                if (datosLibro.length >= 5) {
                    String tipoLibro = datosLibro[0].trim(); // Primer campo indica el tipo de libro
                    String titulo = datosLibro[1].trim();
                    String autor = datosLibro[2].trim();
                    String genero = datosLibro[3].trim();
                    double precio = Double.parseDouble(datosLibro[4].trim());

                    Libro libro = new Libro() {
                    };
                    // Crear el tipo correcto de libro según el tipo registrado en el archivo
                    switch (tipoLibro) {
                        case "Audio":
                            int duracion = Integer.parseInt(datosLibro[5].trim());
                            double duracionReal = Double.parseDouble(datosLibro[5].trim());

                            String idioma = datosLibro[6].trim();
                            String tasa = datosLibro[7].trim();
                            libro = new LibroAudio(titulo, autor, genero, precio, duracion, idioma, tasa);
                            libros.add(libro);
                            break;
                        case "Infantil":
                            int edadRecomendada = Integer.parseInt(datosLibro[5].trim()); // Obtener la edad recomendada
                            boolean ilustraciones = Boolean.parseBoolean(datosLibro[6].trim()); // Obtener si tiene ilustraciones
                            int numIlustraciones = Integer.parseInt(datosLibro[7].trim()); // Obtener el número de ilustraciones
                            libro = new LibroInfantil(titulo, autor, genero, precio, edadRecomendada, ilustraciones, numIlustraciones);
                            libros.add(libro);
                            break;
                        case "Electronico":
                            String formato = datosLibro[5].trim(); // Obtener el formato del libro electrónico
                            libro = new LibroElectronico(titulo, autor, genero, precio, formato);
                            libros.add(libro);
                            break;
                        case "Fisico":
                            String ubicacion = datosLibro[5].trim(); // Obtener la ubicación física del libro
                            libro = new LibroFisico(titulo, autor, genero, precio, ubicacion);
                            libros.add(libro);
                            break;
                        default:
                            // Manejo de otros tipos de libros
                            System.out.println("tipo de libro no encontrado");
                            break;
                    }

                } else {
                    System.err.println("La línea no tiene suficientes datos para crear un libro: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir datos numéricos: " + e.getMessage());
        }

        return libros;
    }
}