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
@Table(name="VolumehorairePermanent")
public class VolumehorairePermanent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private double id;
	private int annee;
	private String niveauxenseigns;
	private int vheffectCM;
	private int vheffectTD;
	private int vheffectTP;
	private int vhlegSH;
	private int vhsuppCM;
	private int vhsuppTD;
	private int vhsuppTP;
	private int vhsuppSH;
	private int vhmobfoncCM;
	private int vhmobfoncTD;
	private int vhmobfoncTP;
	private int vhmobfoncSH;
	private int etabmodilfonct;
	
	@ManyToOne
	@JoinColumn(name="ref_etab")
	private Etablissement etab;

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

	public int getVhlegSH() {
		return vhlegSH;
	}

	public void setVhlegSH(int vhlegSH) {
		this.vhlegSH = vhlegSH;
	}

	public int getVhsuppCM() {
		return vhsuppCM;
	}

	public void setVhsuppCM(int vhsuppCM) {
		this.vhsuppCM = vhsuppCM;
	}

	public int getVhsuppTD() {
		return vhsuppTD;
	}

	public void setVhsuppTD(int vhsuppTD) {
		this.vhsuppTD = vhsuppTD;
	}

	public int getVhsuppTP() {
		return vhsuppTP;
	}

	public void setVhsuppTP(int vhsuppTP) {
		this.vhsuppTP = vhsuppTP;
	}

	public int getVhsuppSH() {
		return vhsuppSH;
	}

	public void setVhsuppSH(int vhsuppSH) {
		this.vhsuppSH = vhsuppSH;
	}

	public int getVhmobfoncCM() {
		return vhmobfoncCM;
	}

	public void setVhmobfoncCM(int vhmobfoncCM) {
		this.vhmobfoncCM = vhmobfoncCM;
	}

	public int getVhmobfoncTD() {
		return vhmobfoncTD;
	}

	public void setVhmobfoncTD(int vhmobfoncTD) {
		this.vhmobfoncTD = vhmobfoncTD;
	}

	public int getVhmobfoncTP() {
		return vhmobfoncTP;
	}

	public void setVhmobfoncTP(int vhmobfoncTP) {
		this.vhmobfoncTP = vhmobfoncTP;
	}

	public int getVhmobfoncSH() {
		return vhmobfoncSH;
	}

	public void setVhmobfoncSH(int vhmobfoncSH) {
		this.vhmobfoncSH = vhmobfoncSH;
	}

	public int getEtabmodilfonct() {
		return etabmodilfonct;
	}

	public void setEtabmodilfonct(int etabmodilfonct) {
		this.etabmodilfonct = etabmodilfonct;
	}

	public Etablissement getEtab() {
		return etab;
	}

	public void setEtab(Etablissement etab) {
		this.etab = etab;
	}

	public VolumehorairePermanent(int annee, String niveauxenseigns,
			int vheffectCM, int vheffectTD, int vheffectTP, int vhlegSH,
			int vhsuppCM, int vhsuppTD, int vhsuppTP, int vhsuppSH,
			int vhmobfoncCM, int vhmobfoncTD, int vhmobfoncTP, int vhmobfoncSH,
			int etabmodilfonct) {
		super();
		this.annee = annee;
		this.niveauxenseigns = niveauxenseigns;
		this.vheffectCM = vheffectCM;
		this.vheffectTD = vheffectTD;
		this.vheffectTP = vheffectTP;
		this.vhlegSH = vhlegSH;
		this.vhsuppCM = vhsuppCM;
		this.vhsuppTD = vhsuppTD;
		this.vhsuppTP = vhsuppTP;
		this.vhsuppSH = vhsuppSH;
		this.vhmobfoncCM = vhmobfoncCM;
		this.vhmobfoncTD = vhmobfoncTD;
		this.vhmobfoncTP = vhmobfoncTP;
		this.vhmobfoncSH = vhmobfoncSH;
		this.etabmodilfonct = etabmodilfonct;
	}

	public VolumehorairePermanent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
