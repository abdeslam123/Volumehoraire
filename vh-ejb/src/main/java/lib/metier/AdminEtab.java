package lib.metier;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("ETAB")
public class AdminEtab  extends Admin implements Serializable {
	
	public AdminEtab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminEtab(String nom, String prenom, String login, String passe,
			Etablissement etablissement) {
		super(nom, prenom, login, passe);
		this.etablissement = etablissement;
	}

	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	@ManyToOne
	@JoinColumn(name="ref_etab")
	private Etablissement etablissement;
	
	
}
