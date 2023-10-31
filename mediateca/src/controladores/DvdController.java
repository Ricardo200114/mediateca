
package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.DVD;
import org.apache.log4j.Logger;


public class DvdController {
    
  
    /* 
    Logger para el controlador de DVDs
    */
    private static final Logger log = Logger.getLogger(CdController.class);
    Conexion cn = new Conexion();
    String sql = "";
    
    /*
     * Crea un nuevo registro de DVD en la base de datos.
     * Regresa El valor de bandera que indica si la operación tuvo éxito.
     */
    public int crear(DVD dvd) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        
        /* 
        Consulta SQL para insertar un DVD en la base de datos
        */
        sql = "insert into dvds values(?, ?, ?, ?, ?)";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, dvd.getCodId());
            pst.setString(2, dvd.getTitulo());
            pst.setString(3, dvd.getDirector());
            pst.setString(4, dvd.getDuracion());
            pst.setString(5, dvd.getGenero());

            bandera = pst.executeUpdate();
            
            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {    
             /* 
            Manejo de excepciones en caso de error al crear un DVD
            */
            System.out.println("Error al crear DVD: "+e.getMessage());
        }
        return bandera;
    }
     
    public DVD buscarByCoId(String codId) {
        Connection con;
        Statement st = null;
        ResultSet rs = null;
        DVD dvd = new DVD();
        sql = "select*from dvds where codId = '" + codId + "'";
        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                dvd.setCodId(rs.getString(1));
                dvd.setTitulo(rs.getString(2));
                dvd.setDirector(rs.getString(3));
                dvd.setDuracion(rs.getString(4));
                dvd.setGenero(rs.getString(5));
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
            
            log.error("Error al crear DVD: "+e.getMessage());
        }

        return dvd;
    }

    /*
     * Busca un DVD en la base de datos por su código ID
     * Retorna El objeto DVD encontrado o un DVD vacío si no se encuentra.
     */
    
    public int modificar(DVD dvd) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        
        /* 
        Consulta SQL para buscar un DVD por su código de identificación
        */
        sql = "update dvds set titulo=?, director=?, duracion=?, genero=?  where codId=?";

        try {

            Class.forName(cn.getDriver());

            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);

            pst.setString(1, dvd.getTitulo());
            pst.setString(2, dvd.getDirector());
            pst.setString(3, dvd.getDuracion());
            pst.setString(4, dvd.getGenero());
            pst.setString(5, dvd.getCodId());

            bandera = pst.executeUpdate();
            
            con.close();
            pst.close();
           
        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al crear DVD: "+e.getMessage());
        }
        return bandera;
    }

    /*
     * Retorna Una lista de objetos que contienen los datos de los DVDs.
     */
    public ArrayList<Object[]> listar() {
        ArrayList<Object[]> lista = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs = null;
        
        /* 
        Consulta SQL para listar todos los DVDs en la base de datos
        */
        sql = "select * from dvds";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[5];

                for (int i = 0; i <= 4; i++) {
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
            log.error("Error al listar Dvds : "+e.getMessage());
        }
        log.info("Se Listaron Correctamente los Dvd " );
        return lista;
    }
    
     /*
     * Elimina un registro de DVD de la base de datos por su código ID.
     * retorna El valor de bandera que indica si la operación tuvo éxito.
     */
    public int eliminar(String codId) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        
        /* 
        Consulta SQL para eliminar un DVD por su código ID
        */

        sql = "delete from dvds where codId=?";

        try {
            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());
            pst = con.prepareStatement(sql);
            pst.setString(1, codId);

            bandera = pst.executeUpdate();

            con.close();
            pst.close();
        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al eliminar dvd : "+e.getMessage());
        }
        return bandera;
    }
}
