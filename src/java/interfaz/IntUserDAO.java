package interfaz;

import clases.User;
import java.util.List;

/**
 *
 * @author renzo
 */
public interface IntUserDAO{
    void insertarUser(User objuser);
    List<User> listar();
    User BuscarPorId(int id);
  
    
    void eliminarUser(User objuser);

}
