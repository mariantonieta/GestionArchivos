package GestionArchivos;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ArchivoTexto extends Archivo {
    List <String> registro = new ArrayList<>();



    void guardarLibros(List<Libro> libros) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) {
            for (Libro libro : libros) {

                bw.write(libro.toString());

            }
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
    void cargar(){

            try (BufferedReader br = new BufferedReader(new FileReader("file"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }



