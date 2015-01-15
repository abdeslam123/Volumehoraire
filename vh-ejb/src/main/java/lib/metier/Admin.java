package lib.metier;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
@DiscriminatorColumn(name="type_admin",length=4)
public class Admin {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private double id;
	private String nom; 
	private String prenom;
	private String login;
	private String passe;
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasse() {
		return passe;
	}
	public void setPasse(String passe) {
		this.passe = passe;
	}
	public Admin(String nom, String prenom, String login, String passe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.passe = passe;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
