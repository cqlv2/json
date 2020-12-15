package testjackson.tp1;

import java.util.List;

public class Entreprise {
	private String nom;
	private SiegeSocial siegeSocial;
	private List<Fondateur> fondateur;
	private List<ChiffreAffaire> chiffreAffaire;

	public Entreprise() {
	
	}
	
	public Entreprise(String nom, SiegeSocial siegeSocial, List<Fondateur> fondateur,
			List<ChiffreAffaire> chiffreAffaire) {
		super();
		this.nom = nom;
		this.siegeSocial = siegeSocial;
		this.fondateur = fondateur;
		this.chiffreAffaire = chiffreAffaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public SiegeSocial getSiegeSocial() {
		return siegeSocial;
	}

	public void setSiegeSocial(SiegeSocial siegeSocial) {
		this.siegeSocial = siegeSocial;
	}

	public List<Fondateur> getFondateur() {
		return fondateur;
	}

	public void setFondateur(List<Fondateur> fondateur) {
		this.fondateur = fondateur;
	}

	public List<ChiffreAffaire> getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(List<ChiffreAffaire> chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

}
