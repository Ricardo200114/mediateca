
package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Libro;
import org.apache.log4j.Logger;


public class LibroController {
    
    /* Logger para el controlador de libro*/
    
    private static final Logger log = Logger.getLogger(CdController.class);
    Conexion cn = new Conexion();
    String sql = "";
    
    /**
     * Crea un nuevo registro de Libro en la base de datos.
     * Regresa El valor de bandera que indica si la operación tuvo éxito.
     */
    
    public int crear(Libro libro) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        
        /* 
        Consulta SQL para insertar un libro en la base de datos
        */
        sql = "insert into libros values(?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, libro.getCodId());
            pst.setString(2, libro.getTitulo());
            pst.setString(3, libro.getAutor());
            pst.setInt(4, libro.getNoPaginas());
            pst.setString(5, libro.getEditorial());
            pst.setString(6, libro.getIsbn());
            pst.setString(7, libro.getFecha());
            pst.setInt(8, libro.getUnidades());

            bandera = pst.executeUpdate();
            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {
             /* 
            Manejo de excepciones en caso de error al crear un Libro
            */
            log.error("Error al crear libro: "+e.getMessage());
        }
        return bandera;
    }


    public Libro buscarLibroByCoId(String codId) {
        Connection con;
        Statement st = null;
        ResultSet rs = null;
        Libro libro = new Libro();
        sql = "select*from libros where codId = '" + codId + "'";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                libro.setCodId(rs.getString(1));
                libro.setTitulo(rs.getString(2));
                libro.setAutor(rs.getString(3));
                libro.setNoPaginas(rs.getInt(4));
                libro.setEditorial(rs.getString(5));
                libro.setIsbn(rs.getString(6));
                libro.setFecha(rs.getString(7));
                libro.setUnidades(rs.getInt(8));
            }

            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al buscar libro: "+e.getMessage());
        }

        return libro;
    }
    /*
     * Busca un Libro en la base de datos por su código ID
     * Retorna El objeto Libro encontrado o un Libro vacío si no se encuentra.
     */
    
    public int modificar(Libro libro) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        /* 
        Consulta SQL para buscar un libro por su código ID
        */
        String sql = "update libros set titulo=?, autor=?, paginas=?, editorial=?, isbn=?, fecha=?, unidades=?  where codId=?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);

            pst.setString(1, libro.getTitulo());
            pst.setString(2, libro.getAutor());
            pst.setInt(3, libro.getNoPaginas());
            pst.setString(4, libro.getEditorial());
            pst.setString(5, libro.getIsbn());
            pst.setString(6, libro.getFecha());
            pst.setInt(7, libro.getUnidades());
            pst.setString(8, libro.getCodId());

            bandera = pst.executeUpdate();
            con.close();
            pst.close();
        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al modificar libro: "+e.getMessage());
        }
        return bandera;
    }
    /*
     * Retorna Una lista de objetos que contienen los datos de los Libros.
     */

    public ArrayList<Object[]> listar() {
        ArrayList<Object[]> lista = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs = null;
        
        /* 
        Consulta SQL para listar todos los Libros en la base de datos
        */
        String sql = "select * from libros";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[8];

                for (int i = 0; i <= 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                lista.add(fila);
            }

            if (rs != null) {
                rs.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException | ClassNotFoundException e) {

            log.error("Error al listar libro: "+e.getMessage());

        }
        log.info("Se Listaron Correctamente los Libros " );
        return lista;
    }

    /*
     * Elimina un registro de Libros de la base de datos por su código ID.
     * retorna El valor de bandera que indica si la operación tuvo éxito.
     */
    public int eliminar(String codId) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        /* 
        Consulta SQL para eliminar un Libro por su código ID
        */
        sql = "delete from libros where codId=?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, codId);

            bandera = pst.executeUpdate();
            con.close();
            pst.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al eliminar libro: "+e.getMessage());
        }
        return bandera;
    }
    
}
