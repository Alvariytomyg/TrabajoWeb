/**
 * 
 */
package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Alvaro
 *
 */
@Entity
@Table(name = "person")
public class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String FirstName;
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
    System.out.println("Al");
	}

}
