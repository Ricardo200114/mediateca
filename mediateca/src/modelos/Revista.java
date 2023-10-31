
package modelos;


public class Revista extends MatEscrito{
    
    private String periodicidad;
    private String fecha;

    // Constructor
    public Revista() {
    }
        

    // Constructor para inicializar los atributos de la revista y de "MatEscrito".
    public Revista(String periodicidad, String fecha, String editorial, int unidades, String codId, String titulo) {
        super(editorial, unidades, codId, titulo);
        this.periodicidad = periodicidad;
        this.fecha = fecha;
    }

    // Métodos para obtener y establecer la periodicidad de la revista.
    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

     // Métodos para obtener y establecer la fecha de publicación de la revista
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
     
}
