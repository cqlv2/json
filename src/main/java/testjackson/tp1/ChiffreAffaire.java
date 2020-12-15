package testjackson.tp1;

public class ChiffreAffaire {
	private int annee;
	private float chiffre;
	private String unite;

	public ChiffreAffaire() {
		
	}
	
	public ChiffreAffaire(int annee, float chiffre, String unite) {
		super();
		this.annee = annee;
		this.chiffre = chiffre;
		this.unite = unite;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public float getChiffre() {
		return chiffre;
	}

	public void setChiffre(float chiffre) {
		this.chiffre = chiffre;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

}
