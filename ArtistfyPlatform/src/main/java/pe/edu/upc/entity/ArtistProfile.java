package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artistProfiles")
public class ArtistProfile implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idArtistProfile;
	@Column(name="description", nullable=false, length=120)
	private String description;
	@Column(name="websiteUrl", nullable=false, length=35)
	private String websiteUrl;
	public int getIdArtistProfile() {
		return idArtistProfile;
	}
	public void setIdArtistProfile(int idArtistProfile) {
		this.idArtistProfile = idArtistProfile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	
	
	
	
}
