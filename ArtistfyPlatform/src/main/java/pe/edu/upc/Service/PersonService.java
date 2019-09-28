package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.entity.Person;

public interface PersonService {
	public void insertar(Person person);
	public List<Person> listar();
	
	public void eliminar(int idPerson);
}
