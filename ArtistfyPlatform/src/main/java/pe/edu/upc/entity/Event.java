package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Events")
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEvent;
	
	@Column(name = "name", nullable = false, length = 30)
	private String name;
	
	@Column(name = "description", nullable = false, length = 30)
	private String description;
	
	@Column(name = "price", nullable = false, length = 30)
	private Double price;
	
	public Integer getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Integer idEvent) {
		this.idEvent = idEvent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
