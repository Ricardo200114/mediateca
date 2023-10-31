
package controladores;

/**
 * Clase que representa la conexión ala base de datos MySQL.
 */
public class Conexion {
    private String url; // URL de la base de datos
    private String user; // Nombre de usuario para la conexión
    private String pwd;  // Contraseña para la conexión
    private String driver; // Controlador JDBC para MySQL
    
    /**
     * Constructor inicializa los valores
     */
    public Conexion() {
        this.url = "jdbc:mysql://localhost:3306/mediateca_udb";
        this.user = "root";
        this.pwd = "";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }

    /**
     * return URL Obtiene la base de datos.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Establece la URL de la base de datos.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Para obtener el nombre de usuario.
     */
    public String getUser() {
        return user;
    }

    /**
     * Para Establecer el nombre de usuario.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Obtiene la contraseña para la conexión.
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Para Establecer la contraseña.
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * Para Obtener el controlador JDBC para MySQL.
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Establece el controlador JDBC para MySQL.
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }
}

