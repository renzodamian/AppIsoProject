  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptadores;

import clases.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import interfaz.*;

/**
 *
 * @author Usuario
 */
public class AdminDAO implements IntAdminDAO{
    
    private Connection con;
    Conexion c = new Conexion();
    
    
    public void setConnection(Connection con){
        this.con = con;
    }
    
    public Connection getConnection(){
        if(con == null){
            con =  new Conexion().getConnection();
        }
        return con;
    }
    
    @Override
    public Administrador login(String usuario, String clave) {
        System.out.println("USUSARIO: "+ usuario);
        System.out.println("CLAVE: "+ clave);
        Administrador admin = null;
        try {
            PreparedStatement st = getConnection().prepareStatement("SELECT * FROM admin WHERE USUARIO = '" + usuario + "' AND CLAVE ='" + clave + "'");
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                admin = new Administrador();
                admin.setNombre(rs.getString("NOMBRE"));
                admin.setApellido(rs.getString("APELLIDO"));
                admin.setUsuario(rs.getString("USUARIO"));
                admin.setClave(rs.getString("CLAVE"));
            }
        } catch (Exception e) {
        }
        System.out.println("se inserto................-----------------------");
        return admin;
    }

 
    
}
