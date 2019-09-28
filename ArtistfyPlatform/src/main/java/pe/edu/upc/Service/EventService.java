package pe.edu.upc.Service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Repository.EventRepository;
import pe.edu.upc.entity.Event;

@Named
public class EventService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EventRepository eventRepository;

	public void saveEvent(Event e) {
		eventRepository.save(e);
	}
    
	public List<Event> getAllEvents(){
		return eventRepository.findAll();
	}
}
