package Adaptadores;

import clases.User;
import interfaz.IntUserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ButtonType;

/**
 *
 * @author renzo
 */
public class UserDAO implements IntUserDAO {

    private Connection con;

    public void setConnection(Connection con) {
        this.con = con;
    }

    public Connection getConnection() {
        if (con == null) {
            con = new Conexion().getConnection();
        }
        return con;
    }

    public void cerrarConeccion() {
        try {
            getConnection().close();
            con = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertarUser(User objuser) {
        PreparedStatement stm = null;
        try {
            String sql = "INSERT INTO usuarios( nombre, apellido, cedula, email, usuario, password) values("
                    + "'" + objuser.getNombreU() + "'" + ","
                    + "'" + objuser.getApellidoU() + "'" + ","
                    + "'" + objuser.getCedulaU() + "'" + ","
                    + "'" + objuser.getCorreoU() + "'" + ","
                    + "'" + objuser.getUsuarioU() + "'" + ","
                    + "'" + objuser.getContrasenaU() + "'" + ")";
            System.out.println("**** SENTENCIA User  " + sql);

            stm = getConnection().prepareStatement(sql);
            stm.executeUpdate();//ejecuta la sentencia
            stm.close();//cierra la sentencia
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la conexion--- UserDAO");
        }
        cerrarConeccion();
    }

    @Override
    public List<User> listar() {
        List<User> lista = new ArrayList<User>();
        try {
            Statement stmt = null;
            stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT *FROM usuarios");
            while (resultado.next()) {
                User user = new User();
                user.setIdU(resultado.getInt("id"));
                user.setNombreU(resultado.getString("nombre"));
                user.setApellidoU(resultado.getString("apellido"));
                user.setCedulaU(resultado.getString("cedula"));
                user.setCorreoU(resultado.getString("email"));
                user.setUsuarioU(resultado.getString("usuario"));
                user.setContrasenaU(resultado.getString("password"));
                
                lista.add(user);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            cerrarConeccion();
        }
        return lista;
    }

    @Override
    public User BuscarPorId(int id) {
          return null;
    }

    @Override
    public void eliminarUser(User objuser) {
          return ;
    }

}
