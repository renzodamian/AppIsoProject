/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Administrador;

/**
 *
 * @author Usuario
 */
public interface IntAdminDAO {
    public Administrador login(String usuario, String clave);
}
