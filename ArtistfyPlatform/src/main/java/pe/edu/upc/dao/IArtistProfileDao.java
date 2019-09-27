package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.ArtistProfile;

public interface IArtistProfileDao {
public void insertar(ArtistProfile artistProfile);

public List<ArtistProfile> listar();

public void eliminar(int idArtistProfile);
}
