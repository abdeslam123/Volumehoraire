package lib.session;

import javax.ejb.Remote;

import lib.metier.Admin;
import lib.metier.Etablissement;

@Remote
public interface VolumeHoraireRemote {
	
	public void ajouterAdmin(Admin adm);
	public void supprimerAdmin(double id);
	public void ajouterEtablissement(Etablissement etb); 
	public void supprimerEtablissement(int id);
	
	
	
}
