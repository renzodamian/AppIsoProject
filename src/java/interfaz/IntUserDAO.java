/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.User;
import java.util.List;

/**
 *
 * @author renzo
 */
public interface IntUserDAO{
    void insertarUser(User objuser);
    // List<User> listarTodos();
    User leerPorId(int id);
    void actualizarUser(User objuser);
    void eliminarUser(int id);

}
