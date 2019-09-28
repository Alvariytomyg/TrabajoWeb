package pe.upc.edu.pe.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPersonDao;
import pe.edu.upc.entity.Person;


public class PersonDaoImpl implements IPersonDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	@Override
	public void insertar(Person person) {
	try {
		em.persist(person);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

	@SuppressWarnings("unchecked")
	@Override

	public List<Person> listar() {
		List<Person> lista = new ArrayList<Person>();
		try {
			Query q=em.createQuery("select p from person p");
			lista=(List<Person>) q.getResultList();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idPerson) {
		Person per=new Person();
		try {
			per=em.getReference(Person.class, idPerson);
			em.remove(per);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
