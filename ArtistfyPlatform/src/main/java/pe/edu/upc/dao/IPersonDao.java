package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Person;

public interface IPersonDao {

	public void insertar(Person person);
	public List<Person> listar();
	
	public void eliminar(int idPerson);
}
