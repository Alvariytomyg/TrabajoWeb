package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.entity.ArtistProfile;

public interface IArtistProfileService {
public void insertar(ArtistProfile artistProfile);

public List<ArtistProfile> listar();

public void eliminar(int idArtistProfile);

}
