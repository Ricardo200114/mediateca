
package modelos;

public class Material {
    
    private String codId;
    private String titulo;

    // Constructor
    public Material() {
    }

     // Constructor para inicializar codId y título
    public Material(String codId, String titulo) {
        this.codId = codId;
        this.titulo = titulo;
    }

    // Método para obtener el código de identificación (codId)
    public String getCodId() {
        return codId;
    }

    public void setCodId(String codId) {
        this.codId = codId;
    }

    // Método para obtener el título del material
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    
    
}
