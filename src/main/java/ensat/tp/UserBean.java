package ensat.tp;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;





public class UserBean {
	
	/**
     * Creates a new instance of UserBean
     */
    
    private String prenom;
    private String nom;
    private Date datenaissance;
    private String email;
    private String genre;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prénom) {
        this.prenom = prénom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Il est possible de définir votre propre méthode de validation (du code Java) : 
    //cela se fait directement sur la classe de « backing bean » utilisée par votre formulaire.
    //Une telle méthode doit respecter une signature bien précise imposée par le framework JSF.
    
   public void validateEmail(FacesContext context, UIComponent toValidate,
            Object value) throws ValidatorException{
        
        String eMail =(String) value;
        if (eMail.indexOf("@") < 0){
            FacesMessage message =new FacesMessage("Adresse Email invalide !");
            throw new ValidatorException(message);
        }
    }
    

}
