/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Models.Dao.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author renzo
 */
public class ConexionJdbc {

    private Connection con;
    private String user = "administrador";
    private String password = "administrador";
    private String url = "jdbc:derby://localhost:1527/usuario";
    private String driverClass = "org.apache.derby.jdbc.ClientDriver";

    public ConexionJdbc(String user, String password, String url, String driverClass) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.driverClass = driverClass;
        conectar();

    }

    public ConexionJdbc() {

    }

    private void conectar() {
        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return con;
    }
}
