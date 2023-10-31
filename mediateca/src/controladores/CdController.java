
package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Cd;
import org.apache.log4j.Logger;


public class CdController {
    
    /* Logger para el controlador de CD*/
    
    private static final Logger log = Logger.getLogger(CdController.class);
    Conexion cn = new Conexion();
    String sql = "";
    
    /**
     * Crea un nuevo registro de CD en la base de datos.
     * Regresa El valor de bandera que indica si la operación tuvo éxito.
     */
    
    public int Crear(Cd cd){
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        
        /* 
        Consulta SQL para insertar un CD en la base de datos
        */
        sql = "insert into cds values(?, ?, ?, ?, ?, ?, ?)";
        
        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, cd.getCodId());
            pst.setString(2, cd.getTitulo());
            pst.setString(3, cd.getArtista());
            pst.setString(4, cd.getGenero());
            pst.setString(5, cd.getDuracion());
            pst.setInt(6, cd.getNoCanciones());
            pst.setInt(7, cd.getUnidades());

            bandera = pst.executeUpdate();

            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {
             /* 
            Manejo de excepciones en caso de error al crear un CD
            */
            log.error("Error al Crear: "+ e.getMessage());
        }
        return bandera;
    }
    
    public Cd buscarByCoId(String codId) {
        Connection con;
        Statement st = null;
        ResultSet rs = null;
        Cd cd = new Cd();
        sql = "select*from cds where codId = '" + codId + "'";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cd.setCodId(rs.getString(1));
                cd.setTitulo(rs.getString(2));
                cd.setArtista(rs.getString(3));
                cd.setGenero(rs.getString(4));
                cd.setDuracion(rs.getString(5));
                cd.setNoCanciones(rs.getInt(6));
                cd.setUnidades(rs.getInt(7));
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
            
            log.error("Error Buscar: "+e.getMessage());
        }

        return cd;
    }
    /*
     * Busca un CD en la base de datos por su código ID
     * Retorna El objeto CD encontrado o un CD vacío si no se encuentra.
     */
    
    public int modificar(Cd cd) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        /* 
        Consulta SQL para buscar un DVD por su código ID
        */
        sql = "update cds set titulo=?, artista=?, genero=?, durancion=?, numero_canciones=?, unidades=?  where codId=?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);

            pst.setString(1, cd.getTitulo());
            pst.setString(2, cd.getArtista());
            pst.setString(3, cd.getGenero());
            pst.setString(4, cd.getDuracion());
            pst.setInt(5, cd.getNoCanciones());
            pst.setInt(6, cd.getUnidades());
            pst.setString(7, cd.getCodId());

            bandera = pst.executeUpdate();

            con.close();
            pst.close();

        } catch (SQLException | ClassNotFoundException e) {
            
            log.error("Error en Modificar: "+ e.getMessage());
            
        }
        return bandera;
    }
    
    /*
     * Retorna Una lista de objetos que contienen los datos de los CD.
     */
    public ArrayList<Object[]> listar() {
        ArrayList<Object[]> lista = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs = null;
        /* 
        Consulta SQL para listar todos los CD en la base de datos
        */
        String sql = "select * from cds";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[7];

                for (int i = 0; i <= 6; i++) {
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
            log.info("Se Listaron Correctamente los CD " );

        } catch (SQLException | ClassNotFoundException e) {

            log.error("Error al Listar: "+ e.getMessage());

        } finally {
            return lista;
        }
    }
    
    /*
     * Elimina un registro de CD de la base de datos por su código ID.
     * retorna El valor de bandera que indica si la operación tuvo éxito.
     */
    public int eliminar(String codId) {
        int bandera = 0;
        Connection con;
        PreparedStatement pst;
        
        /* 
        Consulta SQL para eliminar un CD por su código ID
        */
        sql = "delete from cds where codId=?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, codId);

            bandera = pst.executeUpdate();
            con.close();
            pst.close();
            
        } catch (SQLException | ClassNotFoundException e) {
            log.error("Error en Eliminar: " + e.getMessage());
        }
        return bandera;
    }
    
}
