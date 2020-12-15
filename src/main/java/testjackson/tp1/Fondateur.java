package testjackson.tp1;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Fondateur {
	private String nom;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)	private LocalDate dateNaissance;
	private String lieuNaissance;

	public Fondateur() {
		
	}
	
	public Fondateur(String nom, LocalDate dateNaissance, String lieuNaissance) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

}
