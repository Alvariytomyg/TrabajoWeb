package pe.edu.upc.Service;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Repository.IUserRepository;
import pe.edu.upc.entity.User;

@Named
public class UserService implements IUserService, Serializable {

	
	private static final long serialVersionUID = 1L;

	@Inject
	private IUserRepository userRepository;
	
	@Override
	public User login(User u) throws Exception {
		return userRepository.login(u);
	}
	
	

}
