package pe.edu.upc.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.entity.Event;

@Named
public class EventRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "ArtistfyPlatform")
	private EntityManager em;
	
    public void save(Event e) {
    	em.persist(e);
    }
    
    @SuppressWarnings("unchecked")
	public List<Event> findAll(){
    	List<Event> events = new ArrayList<>();
    	
    	try {
    		Query query = em.createQuery("SELECT e FROM Event e");
    		events = (List<Event>) query.getResultList();
    	}catch(Exception e){
    		
    	}
    	return events;
    }
}
