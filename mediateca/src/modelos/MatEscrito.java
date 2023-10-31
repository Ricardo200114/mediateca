
package modelos;

// Definición del paquete en el que se encuentra la clase
public class MatEscrito extends Material{
    private String editorial;
    private int unidades;

    public MatEscrito() {
    }
    
    

    // Constructor con argumentos
    public MatEscrito(String editorial, int unidades, String codId, String titulo) {
        // Llama al constructor de la clase base (Material) y pasa codId y titulo
        super(codId, titulo);
        this.editorial = editorial;
        this.unidades = unidades;
    }

    // Get para obtener la editorial
    public String getEditorial() {
        return editorial;
    }

    // Set para establecer la editorial
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // Get para obtener la editorial
    public int getUnidades() {
        return unidades;
    }

    // Set para establecer la editorial
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

   
    
}
