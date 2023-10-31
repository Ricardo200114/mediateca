
package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Revista;
import org.apache.log4j.Logger;


public class RevistaController {
    /* Logger para el controlador de Revista*/
    private static final Logger log = Logger.getLogger(CdController.class);
    Conexion cn = new Conexion();
    String sql = "";
    
    /**
     * Crea un nuevo registro de Revista en la base de datos.
     * Regresa El valor de bandera que indica si la operación tuvo éxito.
     */

    public int crear(Revista revista) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        /* 
        Consulta SQL para insertar una Revista en la base de datos
        */
        sql = "insert into revistas values(?, ?, ?, ?, ?, ?)";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, revista.getCodId());
            pst.setString(2, revista.getTitulo());
            pst.setString(3, revista.getEditorial());
            pst.setString(4, revista.getPeriodicidad());
            pst.setString(5, revista.getFecha());
            pst.setInt(6, revista.getUnidades());

            bandera = pst.executeUpdate();
            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {
             /* 
            Manejo de excepciones en caso de error al crear una Revista
            */
            log.error("Error al crear: "+e.getMessage());
        }
        return bandera;
    }

 
    public Revista buscarRevistaByCodId(String codId) {
        Connection con;
        Statement st = null;
        ResultSet rs = null;
        Revista revista = new Revista();
        sql = "select*from revistas where codId = '" + codId + "'";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                revista.setCodId(rs.getString(1));
                revista.setTitulo(rs.getString(2));
                revista.setEditorial(rs.getString(3));
                revista.setPeriodicidad(rs.getString(4));
                revista.setFecha(rs.getString(5));
                revista.setUnidades(rs.getInt(6));
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
            log.error("Error al buscar : "+e.getMessage());
        }

        return revista;
    }

    /*
     * Busca una revista en la base de datos por su código ID
     * Retorna El objeto revista encontrado o una revista vacío si no se encuentra.
     */
    public int modificar(Revista revista) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        /* 
        Consulta SQL para buscar un libro por su código ID
        */
        sql = "update revistas set titulo=?, editorial=?, periodicidad=?, fecha=?, unidades=?  where codId=?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);

            pst.setString(1, revista.getTitulo());
            pst.setString(2, revista.getEditorial());
            pst.setString(3, revista.getPeriodicidad());
            pst.setString(4, revista.getFecha());
            pst.setInt(5, revista.getUnidades());
            pst.setString(6, revista.getCodId());

            bandera = pst.executeUpdate();
            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al modificar Revista : "+e.getMessage());
        }
        return bandera;
    }
    
    /*
     * Retorna Una lista de objetos que contienen los datos de las revistas.
     */

    public ArrayList<Object[]> listar() {
        ArrayList<Object[]> lista = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs = null;
        /* 
        Consulta SQL para listar todos las revistas en la base de datos
        */
        sql = "select * from revistas";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[6];

                for (int i = 0; i <= 5; i++) {
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

            log.error("Error al listar revista : "+e.getMessage());

        }
        log.info("Se Listaron Correctamente las Revista " );
        return lista;
    }
    
    /*
     * Elimina un registro de las revistas de la base de datos por su código ID.
     * retorna El valor de bandera que indica si la operación tuvo éxito.
     */

    public int eliminar(String codId) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        /* 
        Consulta SQL para eliminar una revista por su código ID
        */
        sql = "delete from revistas where codId=?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, codId);

            bandera = pst.executeUpdate();
            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error al eliminar Revista : "+e.getMessage());
        }
        return bandera;
    }
    
}
