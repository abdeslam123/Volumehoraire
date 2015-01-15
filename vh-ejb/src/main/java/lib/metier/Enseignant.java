package lib.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="Enseignant")
public class Enseignant {
	
	@Id
	@Column(name="ppr")
	private int ppr;
	private String nom;
	private String prenom;
	private String grade ;
	private String tel;
	private String email;
	private String sexe;
	
	@ManyToOne
	@JoinColumn(name="ref_Depart")
	private Departement departement;
	
	public int getPpr() {
		return ppr;
	}

	public void setPpr(int ppr) {
		this.ppr = ppr;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	public Enseignant(int ppr, String nom, String prenom, String grade,
			String tel, String email, String sexe) {
		super();
		this.ppr = ppr;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.tel = tel;
		this.email = email;
		this.sexe = sexe;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
