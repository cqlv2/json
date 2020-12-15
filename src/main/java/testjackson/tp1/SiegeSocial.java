package testjackson.tp1;

public class SiegeSocial {
	private String site;
	private String ville;
	private String etat;
	private String pays;

	public SiegeSocial() {
		
	}
	
	public SiegeSocial(String site, String ville, String etat, String pays) {
		super();
		this.site = site;
		this.ville = ville;
		this.etat = etat;
		this.pays = pays;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}
