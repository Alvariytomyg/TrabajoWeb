package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id; 

@Entity

@Table(name="person")

public class Person implements Serializable{
private static final long serialVersionUID=1L;
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int idPerson;
@Column(name="firstnamePerson",nullable=false,length=50)
private String firstnamePerson;
@Column(name="lastnamePerson",nullable=false,length=50)
private String lastnamePerson;
@Column(name="emailPerson",nullable=false,length=50)
private String emailPerson1;
@Column(name="phonePerson",nullable=false,length=50)
private String phonePerson;
@Column(name="dniPerson",nullable=false,length=50)
private String dniPerson;
public int getIdPerson() {
	return idPerson;
}
public void setIdPerson(int idPerson) {
	this.idPerson = idPerson;
}
public String getFirstnamePerson() {
	return firstnamePerson;
}
public void setFirstnamePerson(String firstnamePerson) {
	this.firstnamePerson = firstnamePerson;
}
public String getLastnamePerson() {
	return lastnamePerson;
}
public void setLastnamePerson(String lastnamePérson) {
	this.lastnamePerson = lastnamePérson;
}
public String getEmailPerson1() {
	return emailPerson1;
}
public void setEmailPerson1(String emailPerson1) {
	this.emailPerson1 = emailPerson1;
}
public String getPhonePerson() {
	return phonePerson;
}
public void setPhonePerson(String phonePerson) {
	this.phonePerson = phonePerson;
}
public String getDniPerson() {
	return dniPerson;
}
public void setDniPerson(String dniPerson) {
	this.dniPerson = dniPerson;
}


}
