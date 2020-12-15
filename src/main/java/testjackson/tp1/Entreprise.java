package testjackson.tp1;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	private String nom;
	private SiegeSocial siegeSocial;
	private List<Fondateur> fondateur=new ArrayList<Fondateur>();
	private List<ChiffreAffaire> chiffreAffaire=new ArrayList<ChiffreAffaire>();

	public Entreprise() {
	
	}
	
	public Entreprise(String nom, SiegeSocial siegeSocial) {
		super();
		this.nom = nom;
		this.siegeSocial = siegeSocial;
		
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
