package lib.metier;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="Etablissement")
public class Etablissement implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	private String code;
	private String libcort;
	private String liblng;
	
	public Etablissement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etablissement(String code, String libcort, String liblng) {
		super();
		this.code = code;
		this.libcort = libcort;
		this.liblng = liblng;
		
	}
	
	@OneToMany(targetEntity=AdminEtab.class,mappedBy="etablissement")
	private Collection<AdminEtab> adminEtab;
	
	@OneToMany(targetEntity=Departement.class,mappedBy="etablissements")
	private Collection<Departement> departements;
	
	@OneToMany(targetEntity=VolumehorairePermanent.class,mappedBy="etab")
	private Collection<VolumehorairePermanent> volumehorairePermanent;

	@OneToMany(targetEntity=VolumehoraireVacataire.class,mappedBy="etabl")
	private Collection<VolumehoraireVacataire> volumehoraireVacataire;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibcort() {
		return libcort;
	}
	public void setLibcort(String libcort) {
		this.libcort = libcort;
	}
	public String getLiblng() {
		return liblng;
	}
	public Collection<AdminEtab> getAdminEtab() {
		return adminEtab;
	}
	public void setAdminEtab(Collection<AdminEtab> adminEtab) {
		this.adminEtab = adminEtab;
	}
	public void setLiblng(String liblng) {
		this.liblng = liblng;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Collection<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(Collection<Departement> departements) {
		this.departements = departements;
	}
	public Collection<VolumehorairePermanent> getVolumehorairePermanent() {
		return volumehorairePermanent;
	}
	public void setVolumehorairePermanent(
			Collection<VolumehorairePermanent> volumehorairePermanent) {
		this.volumehorairePermanent = volumehorairePermanent;
	}
	public Collection<VolumehoraireVacataire> getVolumehoraireVacataire() {
		return volumehoraireVacataire;
	}
	public void setVolumehoraireVacataire(
			Collection<VolumehoraireVacataire> volumehoraireVacataire) {
		this.volumehoraireVacataire = volumehoraireVacataire;
	}

	

}
