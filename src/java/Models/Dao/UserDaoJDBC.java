/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Dao.IConexion;
import Models.Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Models.Dao.IUserDao;
import Util.ConexionJdbc;

/**
 *
 * @author renzo
 */
public class UserDaoJDBC implements IUserDao {

    private Connection con;

    public Connection getConnection() {
        if (con == null) {
            con = new ConexionJdbc().getConnection();
        }
        return con;
    }

    public void CerrarConexion() {
        try {
            getConnection().close();
            con = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<User> listar() {
        List<User> lista = new ArrayList<User>();

        try {
            Statement stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM usuarios");
            while (resultado.next()) {
                User user = new User();
                user.setId(resultado.getInt("id"));
                user.setUsuario(resultado.getString("usuario"));
                user.setClave(resultado.getString("clave"));
                user.setEmail(resultado.getString("email"));
                user.setVal1(resultado.getInt("val1"));
                user.setVal2(resultado.getInt("val2"));

                lista.add(user);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CerrarConexion();
        }
        return lista;
    }

    @Override
    public User buscarPorId(int id) {
        User user = null;
        try {
            PreparedStatement stmt = getConnection().prepareStatement("SELECT *FROM usuarios WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                user = new User();
                user.setId(resultado.getInt("id"));
                user.setUsuario(resultado.getString("usuario"));
                user.setClave(resultado.getString("clave"));
                user.setEmail(resultado.getString("email"));
                user.setVal1(resultado.getInt("val1"));
                user.setVal2(resultado.getInt("val2"));
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CerrarConexion();
        }
        return user;
    }

    @Override
    public void guardar(User user) {
        try {
            PreparedStatement stmt = null;
            if (user.getId() > 0) {
                String sql = "UPDATE usuarios SET usuario=?,clave=?,email=?, val1=?, val2=? WHERE id=? ";
                stmt = getConnection().prepareStatement(sql);
                stmt.setInt(6, user.getId());
            } else {
                String sql = "INSERT INTO usuarios(usuario,clave,email,val1,val2) VALUES (?,?,?,?,?)";
                stmt.getConnection().prepareStatement(sql);
            }
            stmt.setString(1, user.getUsuario());
            stmt.setString(2, user.getClave());
            stmt.setString(3, user.getEmail());
            stmt.setInt(4, user.getVal1());
            stmt.setInt(5, user.getVal2());

            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CerrarConexion();
        }

    }

    @Override
    public void eliminar(User user) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(
                    "DELETE FROM usuarios WHERE id=?");
            stmt.setInt(1, user.getId());
            stmt.executeUpdate();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CerrarConexion();
        }
    }

}
