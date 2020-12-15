package testjackson.tp1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class tp1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Entreprise.class);
		List<Entreprise> listeEntreprise = mapper.readValue(
				new File("C:/Users/cql-v/eclipse-workspace/testjackson/src/main/resources/json1.json"), collType);

		// affichage
		for (Entreprise entreprise : listeEntreprise) {
			System.out.println("entreprise : " + entreprise.getNom());
			for (Fondateur f : entreprise.getFondateur()) {
				System.out.println("fondateur nom : " + f.getNom());
				System.out.println("fondateur date de naissance : " + f.getDateNaissance());
				System.out.println("fondateur lieu de naissance : " + f.getLieuNaissance());
			}
			System.out.println("siege social site: " + entreprise.getSiegeSocial().getSite());
			System.out.println("siege social ville: " + entreprise.getSiegeSocial().getVille());
			System.out.println("siege social etat: " + entreprise.getSiegeSocial().getEtat());
			System.out.println("siege social pays: " + entreprise.getSiegeSocial().getPays());
			for (ChiffreAffaire ca : entreprise.getChiffreAffaire()) {
				System.out.println(ca.getAnnee() + " : " + ca.getChiffre() + ca.getUnite());
			}
		}

	}

}
