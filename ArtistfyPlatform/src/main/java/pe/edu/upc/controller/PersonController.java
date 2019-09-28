package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Service.PersonService;
import pe.edu.upc.entity.Person;

public class PersonController implements Serializable{
@Named
@RequestScoped
	private static final long serialVersionUID = 1L;

	@Inject
	private PersonService pService;
	private Person person;
	List<Person> listaPersonas;
	
	@PostConstruct
	public void init() {
		this.listaPersonas= new ArrayList<Person>();
		this.person=new Person();
		this.listar();
	}
	

	public String nuevoPerson() {
		this.setPerson(new Person());
		return "person.xhtml";		
	}
	
	public void insertar() {
		try {
			pService.insertar(person);
				limpiarPerson();
			this.listar();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public void listar() {
		try {listaPersonas=pService.listar();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
	public void limpiarPerson() {
		this.init();
	}
	
	public void eliminar(Person pe) {
		try {
			pService.eliminar(pe.getIdPerson());
			listar();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person=person;
	}
	
	public List<Person> getListaPersonas(){
		return listaPersonas;
	}
	
	public void setListaPersonas(List<Person> listaPersonas) {
		this.listaPersonas=listaPersonas;
	}
}
