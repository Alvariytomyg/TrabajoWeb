package pe.upc.edu.pe.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IArtistProfileDao;
import pe.edu.upc.entity.ArtistProfile;

public class ArtistProfileDaoImpl implements IArtistProfileDao, Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(ArtistProfile artistProfile) {
		try {
			em.persist(artistProfile);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ArtistProfile> listar() {
		List<ArtistProfile> lista = new ArrayList<ArtistProfile>();
		try {
			Query q=em.createQuery("select ap from ArtistProfile ap");
			lista=(List<ArtistProfile>) q.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	@Transactional
	@Override
	public void eliminar (int idArtistProfile){
		ArtistProfile artp = new ArtistProfile();
		try {
			artp=em.getReference(ArtistProfile.class, idArtistProfile);
			em.remove(artp);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
