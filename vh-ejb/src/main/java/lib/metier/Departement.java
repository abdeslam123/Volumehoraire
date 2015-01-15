package lib.metier;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity 
@Table(name="Departement")
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private double id;
	private String libdip;
	
	@ManyToOne
	@JoinColumn(name="ref_etab")
	private Etablissement etablissements;
	
	@OneToMany(targetEntity=Enseignant.class,mappedBy="departement")
	private Collection<Enseignant> enseignant;
	
	public String getLibdip() {
		return libdip;
	}

	public void setLibdip(String libdip) {
		this.libdip = libdip;
	}
	
	
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public Etablissement getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(Etablissement etablissements) {
		this.etablissements = etablissements;
	}

	public Departement(String libdip) {
		super();
		this.libdip = libdip;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<Enseignant> getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Collection<Enseignant> enseignant) {
		this.enseignant = enseignant;
	}
	
	
}
