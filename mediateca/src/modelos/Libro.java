
package modelos;

/* Importa la clase MatEscrito para que Libro herede de ella*/
public class Libro extends MatEscrito{
    private String autor;
    private String isbn;
    private String fecha;
    private int noPaginas;

    // Constructor 
    public Libro() {
    // Llama al constructor de la clase base (MatEscrito)
    }
    

    public Libro(String autor, String isbn, String fecha, int noPaginas, String editorial, int unidades, String codId, String titulo) {
        // Llama al constructor de la clase base (MatEscrito) con los parámetros de la superclase
        super(editorial, unidades, codId, titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.fecha = fecha;
        this.noPaginas = noPaginas;
    }
    
    // Métodos get y set para el autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     // Métodos get y set para el ISBN
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    // Métodos get y set para la fecha
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    // Métodos get y set para el número de páginas
    public int getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(int noPaginas) {
        this.noPaginas = noPaginas;
    }
    
    
    
}
