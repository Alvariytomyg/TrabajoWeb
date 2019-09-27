package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.Service.IArtistProfileService;
import pe.edu.upc.dao.IArtistProfileDao;
import pe.edu.upc.entity.ArtistProfile;

public class ArtistProfileServiceImpl implements IArtistProfileService, Serializable{

	

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IArtistProfileDao apD;
	
	@Override
	public void insertar(ArtistProfile artistProfile) {
		apD.insertar(artistProfile);
	}

	@Override
	public List<ArtistProfile> listar() {
		// TODO Auto-generated method stub
		return apD.listar();
	}

	@Override
	public void eliminar(int idArtistProfile) {
		apD.eliminar(idArtistProfile);
		// TODO Auto-generated method stub
		
	}

}
