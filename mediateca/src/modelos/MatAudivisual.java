
package modelos;

// Definición del paquete en el que se encuentra la clase

public class MatAudivisual extends Material {
    private String duracion;
    private String genero;

    // Constructor vacío (sin argumentos)
    public MatAudivisual() {
        
    }
    
    

    public MatAudivisual(String duracion, String genero, String codId, String titulo) {
        // Llama al constructor de la clase base (Material) mediante "super()"
        super(codId, titulo);
        this.duracion = duracion;
        this.genero = genero;
    }

     // Get para obtener la duración
    public String getDuracion() {
        return duracion;
    }

    // Set para establecer la duración
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    // Get para obtener el género
    public String getGenero() {
        return genero;
    }
    
    // Set para establecer el género
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
       
    
}
