package lib.session;

import javax.ejb.Stateless;

import lib.metier.Admin;
import lib.metier.Etablissement;

@Stateless(name="VolumeHoraire")
public class VolumeHoraireImpl implements VolumeHoraireLocal,VolumeHoraireRemote {

	@Override
	public void ajouterAdmin(Admin adm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerAdmin(double id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterEtablissement(Etablissement etb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerEtablissement(int id) {
		// TODO Auto-generated method stub
		
	}
		

}
