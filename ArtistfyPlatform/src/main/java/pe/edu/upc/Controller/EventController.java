package pe.edu.upc.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.Service.EventService;
import pe.edu.upc.entity.Event;

@Named
@SessionScoped
public class EventController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EventService eventService;
	
	private List<Event> events;
	private Event event;

	@PostConstruct
	public void init() {
		events = new ArrayList<>();
		event = new Event();
		this.getAllEvents();
	}

	private void getAllEvents() {
	     events=eventService.getAllEvents();
	}
	
	public String newEvent() {
		return "newEvent?faces-redirect=true";
	}
    
	public String saveEvent() {
		String rpta="";
		try {
			eventService.saveEvent(event);
			this.getAllEvents();
			rpta="index?faces-redirect=true";
		}catch(Exception e) {
			
		}
		return rpta;
	}
	public EventService getEventService() {
		return eventService;
	}

	public void setEventService(EventService eventService) {
		this.eventService = eventService;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	
	
}
