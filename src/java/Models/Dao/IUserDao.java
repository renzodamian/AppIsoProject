/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.Dao;

import Models.Entity.User;
import java.util.List;

/**
 *
 * @author renzo
 */
public interface IUserDao {
     public List<User>listar();
    public User buscarPorId(int id);
    public void guardar(User user);
    public void eliminar (User user);

    
}
