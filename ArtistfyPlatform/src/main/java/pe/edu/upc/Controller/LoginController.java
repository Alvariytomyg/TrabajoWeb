package pe.edu.upc.Controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Service.IUserService;
import pe.edu.upc.entity.Role;
import pe.edu.upc.entity.User;


@Named
@ViewScoped
public class LoginController implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUserService userService;
	private User user;
    
	@PostConstruct
	public void init() {
		this.user = new User();
	}
	
	public String login() {
		String redirect = null;
		try {
			User user = this.userService.login(this.user);
			
			if(user != null) {
				if(user.getRole().equals(Role.ROLE_ORGANIZER)) {
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user); 
					redirect = "organizer/categorys?faces-redirect=true";
				}else if(user.getRole().equals(Role.ROLE_ARTIST)) {
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
					redirect = "artist/reportProducts?faces-redirect=true";
				}
			}else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Credenciales incorrectas", "Credenciales incorrectas"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return redirect;
	}
	
	public void checkSesion() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			User user = (User) context.getExternalContext().getSessionMap().get("user");
			
			if(user == null) {
				context.getExternalContext().redirect("../index.xhtml");
			}
		}catch(Exception e) {
			
		}
	}
	
	public void closeSesion() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
