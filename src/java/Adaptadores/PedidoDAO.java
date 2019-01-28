/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptadores;

import clases.*;
import interfaz.*;
import java.sql.Connection;

import Adaptadores.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class PedidoDAO implements IntPedidoDAO {

    //Conexion c = new Conexion();

    private Connection con;

    public void setConnection(Connection con) {
        this.con = con;
    }
    public Connection getConnection(){
        if(con == null){
            con = new Conexion().getConnection();
        }
        return con;
    }
    public  void cerrarConeccion(){
        try {
            getConnection().close();
            con = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void insertarPedido(Pedido objpedido) {
        PreparedStatement stm = null;
        try {
            String sql = "INSERT INTO PEDIDO(fecha, nombre, apellido, empresa, telefono, estudio, proyecto, controlcalidad, ensayos, observaciones) values("
                    + "'" + objpedido.getFecha() + "'" + ","
                    + "'" + objpedido.getNombre() + "'" + ","
                    + "'" + objpedido.getApellido() + "'" + ","
                    + "'" + objpedido.getEmpresa() + "'" + ","
                    + "'" + objpedido.getTelefono() + "'" + ","
                    + "'" + objpedido.getEstudio() + "'" + ","
                    + "'" + objpedido.getProyecto() + "'" + ","
                    + "'" + objpedido.getControlcalidad() + "'" + ","
                    + "'" + objpedido.getEnsayos() + "'" + ","
                    + "'" + objpedido.getObservaciones() + "'" + ")" ;
            System.out.println("**** SENTENCIA  "+sql);
            
            stm = getConnection().prepareStatement(sql);
            stm.executeUpdate();//ejecuta la sentencia
            stm.close();//cierra la sentencia
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error en la conexion--- PedidoDAO");
        }
        cerrarConeccion();
    }
}
