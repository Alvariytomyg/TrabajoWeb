package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.Service.PersonService;
import pe.edu.upc.dao.IPersonDao;
import pe.edu.upc.entity.Person;

public class PersonServiceImpl implements PersonService, Serializable {


	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPersonDao pD;

	public void insertar(Person person) {
		// TODO Auto-generated method stub
		pD.insertar(person);
	}

	public List<Person> listar() {
		// TODO Auto-generated method stub
		return pD.listar();
	}

	public void eliminar(int idPerson) {
		// TODO Auto-generated method stub
		pD.eliminar(idPerson);
	}

}
