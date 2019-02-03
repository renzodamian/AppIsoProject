/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Usuario
 */
public class Conexion{
    private Connection con;
    private String user = "adminapp";
    private String password = "adminapp";
    private String url = "jdbc:derby://localhost:1527/testapplication";/*Iso9001*/
    private String driverClass = "org.apache.derby.jdbc.ClientDriver";

    public Conexion(String user, String password, String url, String driverClass){
        this.user = user;
        this.password = password;
        this.url = url;
        this.driverClass = driverClass;  
        conectar();
    }
    
    public Conexion(){
        conectar();
    }
   
    public void conectar(){
        try {
            Class.forName(driverClass);
            con = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException a) {
            System.out.println("----- ERROR DE CONEXION");
            a.printStackTrace();
        }catch(SQLException e){    
            System.out.println("---- ERROR DE SQL");
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
