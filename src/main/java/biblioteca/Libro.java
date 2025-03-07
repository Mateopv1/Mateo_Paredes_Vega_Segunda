package biblioteca;


/**
 * Clase que representa un libro con título, autor y año de publicación.
 * @author Mateo Paredes
 * @version 1.1
 */
public class Libro {



    // TODO: Documentar estos atributos

    /**
     * Título del libro.
     */
    private String titulo;
    /**
     * Autor del libro.
     */
    private String autor;
    /**
     * Año en que fue publicado el libro.
     */
    private int anioPublicacion;

    /**
     * Crea un nuevo libro con el título, autor y año de publicación especificados.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anioPublicacion El año de publicación del libro.
     */
    // TODO: Documentar este método
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    /**
     * Devuelve el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Pone  el título del libro.
     *
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return El autor del libro.
     */
    // TODO: Documentar este método
    public String getAutor() {
        return autor;
    }
    /**
     * Establece el autor del libro.
     *
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el año de publicación del libro.
     *
     * @return El año en que se publicó el libro.
     */
    // TODO: Documentar este método
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     *
     * @param anioPublicacion El nuevo año de publicación.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
