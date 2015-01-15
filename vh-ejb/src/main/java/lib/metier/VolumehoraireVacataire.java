package lib.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="VolumehoraireVacataire")
public class VolumehoraireVacataire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private double id;
	private int annee;
	private String fonctionnaire;
	private int ppr;
	private String nom;
	private String prenom;
	private String grade ;
	private String tel;
	private String email;
	private String sexe;
	private String niveauxenseigns;
	private int vheffectCM;
	private int vheffectTD;
	private int vheffectTP;
	private int vheffectSH;
	
	@ManyToOne
	@JoinColumn(name="ref_etab")
	private Etablissement etabl;

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getFonctionnaire() {
		return fonctionnaire;
	}

	public void setFonctionnaire(String fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}

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

	public String getNiveauxenseigns() {
		return niveauxenseigns;
	}

	public void setNiveauxenseigns(String niveauxenseigns) {
		this.niveauxenseigns = niveauxenseigns;
	}

	public int getVheffectCM() {
		return vheffectCM;
	}

	public void setVheffectCM(int vheffectCM) {
		this.vheffectCM = vheffectCM;
	}

	public int getVheffectTD() {
		return vheffectTD;
	}

	public void setVheffectTD(int vheffectTD) {
		this.vheffectTD = vheffectTD;
	}

	public int getVheffectTP() {
		return vheffectTP;
	}

	public void setVheffectTP(int vheffectTP) {
		this.vheffectTP = vheffectTP;
	}

	public int getVheffectSH() {
		return vheffectSH;
	}

	public void setVheffectSH(int vheffectSH) {
		this.vheffectSH = vheffectSH;
	}

	public Etablissement getEtabl() {
		return etabl;
	}

	public void setEtabl(Etablissement etabl) {
		this.etabl = etabl;
	}

	public VolumehoraireVacataire(int annee, String fonctionnaire, int ppr,
			String nom, String prenom, String grade, String tel, String email,
			String sexe, String niveauxenseigns, int vheffectCM,
			int vheffectTD, int vheffectTP, int vheffectSH) {
		super();
		this.annee = annee;
		this.fonctionnaire = fonctionnaire;
		this.ppr = ppr;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.tel = tel;
		this.email = email;
		this.sexe = sexe;
		this.niveauxenseigns = niveauxenseigns;
		this.vheffectCM = vheffectCM;
		this.vheffectTD = vheffectTD;
		this.vheffectTP = vheffectTP;
		this.vheffectSH = vheffectSH;
	}

	public VolumehoraireVacataire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
