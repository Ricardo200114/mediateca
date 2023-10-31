
package modelos;

/* Importa la clase MatAudivusual para que CD herede de ella*/
public class Cd extends MatAudivisual{
    private String artista;
    private int noCanciones;
    private int unidades;

    // Constructor 
    public Cd() {
    // Llama al constructor de la clase base (MatAudivusual)
    }
    
    public Cd(String artista, int noCanciones, int unidades, String duracion, String genero, String codId, String titulo) {
        // Llama al constructor de la clase base (MatAudivusual) con los parámetros de la superclase
        super(duracion, genero, codId, titulo);
        this.artista = artista;
        this.noCanciones = noCanciones;
        this.unidades = unidades;
    }
    
    // Métodos get y set para Artista
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
     
    // Métodos get y set para  NoCanciones
    public int getNoCanciones() {
        return noCanciones;
    }

    public void setNoCanciones(int noCanciones) {
        this.noCanciones = noCanciones;
    }

    // Métodos get y set para Unidades
    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    
    
    
}
