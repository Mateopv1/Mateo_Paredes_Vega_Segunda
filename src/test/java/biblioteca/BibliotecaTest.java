package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;

    @BeforeEach
    void setUp() {
        // Usando libros de fantasía
        biblioteca = new Biblioteca();
        libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954);
        libro2 = new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", 1997);
        libro3 = new Libro("Juego de Tronos", "George R.R. Martin", 1996);
    }

    @Test
    void agregarLibro() {

        boolean agregado = biblioteca.agregarLibro(libro1);
        assertTrue(agregado, "EL LIBRO DEBERÍA AGREGARSE CORRECTAMENTE");
        assertTrue(biblioteca.getLibros().contains(libro1), "LA LISTA DE LIBROS DEBE CONTENER EL LIBRO AGREGADO");
    }

    @Test
    void eliminarLibro() {

        biblioteca.agregarLibro(libro2);
        boolean eliminado = biblioteca.eliminarLibro(libro2);
        assertTrue(eliminado, "EL LIBRO DEBERÍA ELIMINARSE CORRECTAMENTE");
        assertFalse(biblioteca.getLibros().contains(libro2), "LA LISTA DE LIBROS NO DEBE CONTENER EL LIBRO ELIMINADO");
    }


    @Test
    void encuentraLibroPorTitulo() {

        biblioteca.agregarLibro(libro3);
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Juego de Tronos");
        assertNotNull(encontrado, "DEBE ENCONTRAR EL LIBRO CON TÍTULO 'JUEGO DE TRONOS'");

        System.out.println(("EL AUTOR DEBE SER '" + encontrado.getAutor() + "'").toUpperCase());
        assertEquals("George R.R. Martin", encontrado.getAutor(), "EL AUTOR DEBE SER 'GEORGE R.R. MARTIN'");

        Libro noEncontrado = biblioteca.encuentraLibroPorTitulo("Libro Inexistente");
        assertNull(noEncontrado, "NO DEBE ENCONTRAR NINGÚN LIBRO PARA UN TÍTULO INEXISTENTE");
    }



    @Test
    void encuentraLibrosPorAutor() {

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(new Libro("El Hobbit", "J.R.R. Tolkien", 1937));
        List<Libro> listaLibros = biblioteca.encuentraLibrosPorAutor("J.R.R. Tolkien");
        assertNotNull(listaLibros, "DEBE DEVOLVER UNA LISTA DE LIBROS PARA UN AUTOR EXISTENTE");
        assertEquals(2, listaLibros.size(), "EL AUTOR DEBE TENER 2 LIBROS EN LA BIBLIOTECA");


        List<Libro> listaInexistente = biblioteca.encuentraLibrosPorAutor("Autor Inexistente");
        assertNull(listaInexistente, "DEBE DEVOLVER NULL SI NO SE ENCUENTRAN LIBROS PARA EL AUTOR INDICADO");
    }
}