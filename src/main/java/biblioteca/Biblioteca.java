package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *  Esta Clase representa una biblioteca con una colección de libros.
 *  * Permite agregar, eliminar y buscar libros por título y por autor.
 *  * @author Mateo Paredes aka github.com/Mateopv
 *  * @version 1.1
 *  */


public class Biblioteca {

    /**
     * Este metodo te da una Lista de libros disponibles en la biblioteca.
     */
    // TODO: Documentar estos atributos
    private final List<Libro> libros;


    /**
     * Constructor por defecto de la biblioteca sin libros.
     */
    // TODO: Documentar este método
    public Biblioteca() {
        libros = new ArrayList<>();
    }


    /**
     * Constructor que inicializa la biblioteca con una lista de libros.
     * @param libros Lista de libros con la que se inicializa la biblioteca.
     */
    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }


    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }


    /**
     * Devuelve la lista de libros de la biblioteca.
     * @return Lista de libros contenidos en la biblioteca.
     */
    // TODO: Documentar este método
    public List<Libro> getLibros() {
        return libros;
    }

   /**
    * Busca un libro por su título.
    * @param titulo El título del libro a buscar.
    * @return El libro encontrado .
    */

 // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Este metodo busca un libro por el nombre del autor.
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado del autor.
     */
    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }
    /**
     * Busca todos los libros de un autor determinado.
     * @param autor El autor cuyos libros se desean buscar.
     * @return Una lista de libros del autor.
     */
    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
