package pe.edu.upc.Repository;

import pe.edu.upc.entity.User;

public interface IUserRepository {
	
   User login(User u)throws Exception;
}
