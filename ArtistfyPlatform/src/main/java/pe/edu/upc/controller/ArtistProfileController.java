package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Service.IArtistProfileService;
import pe.edu.upc.entity.ArtistProfile;

@Named
@RequestScoped
public class ArtistProfileController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IArtistProfileService apService;
	private ArtistProfile artistProfile;
	List<ArtistProfile> listaArtistProfile;
	
	@PostConstruct
	public void init() {
		this.listaArtistProfile=new ArrayList<ArtistProfile>();
		this.artistProfile=new ArtistProfile();
		this.listar();
	}
	
	public String nuevoArtistProfile() {
		this.setArtistProfile(new ArtistProfile());
		return "artistProfile.xhtml";
	}
	
	
	public void insertar() {
		try {
			
			apService.insertar(artistProfile);
			limpiarArtistProfile();
			
			this.listar();
		}catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listar() {
		try {
			listaArtistProfile=apService.listar();
		}catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void limpiarArtistProfile() {
		this.init();
	}
	
	public void eliminar (ArtistProfile ap) {
		try {
			apService.eliminar(ap.getIdArtistProfile());
			listar();
		}catch (Exception e) {
			e.getMessage();
		}
	}


//get y set 
	
	

	public ArtistProfile getArtistProfile() {
		return artistProfile;
	}

	public void setArtistProfile(ArtistProfile artistProfile) {
		this.artistProfile = artistProfile;
	}

	public List<ArtistProfile> getListaArtistProfile() {
		return listaArtistProfile;
	}

	public void setListaArtistProfile(List<ArtistProfile> listaArtistProfile) {
		this.listaArtistProfile = listaArtistProfile;
	}	

}
