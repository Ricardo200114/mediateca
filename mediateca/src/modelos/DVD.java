
package modelos;

/* Importa la clase MatAudivusual para que DVD herede de ella*/
public class DVD extends MatAudivisual{
    
    private String director;
    
    // Constructor 
    public DVD() {
    // Llama al constructor de la clase base (MatAudivusual)
    }

    public DVD(String director, String duracion, String genero, String codId, String titulo) {
        // Llama al constructor de la clase base (MatAudivusual) con los parámetros de la superclase
        super(duracion, genero, codId, titulo);
        this.director = director;
    }

    // Métodos get y set para Director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    
}
