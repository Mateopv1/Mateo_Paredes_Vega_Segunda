package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    private Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("El Hobbit", "J.R.R. Tolkien", 1937);
    }

    @Test
    void testGetTitulo() {
        System.out.println("EL TÍTULO DEBE SER 'EL HOBBIT'");
        assertEquals("El Hobbit", libro.getTitulo(), "EL TÍTULO DEBE SER 'EL HOBBIT'");
    }

    @Test
    void testSetTitulo() {
        libro.setTitulo("El Señor de los Anillos");
        System.out.println("EL NUEVO TÍTULO DEBE SER 'EL SEÑOR DE LOS ANILLOS'");
        assertEquals("El Señor de los Anillos", libro.getTitulo(), "EL NUEVO TÍTULO DEBE SER 'EL SEÑOR DE LOS ANILLOS'");
    }



}