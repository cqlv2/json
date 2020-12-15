package testjackson.tp1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.github.lalyos.jfiglet.FigletFont;

public class tp1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Entreprise.class);
		List<Entreprise> listeEntreprise = mapper.readValue(
				new File("C:/Users/cql-v/eclipse-workspace/testjackson/src/main/resources/json1.json"), collType);

		
		
		
		// affichage
		for (Entreprise entreprise : listeEntreprise) {
			System.err.println("        "+FigletFont.convertOneLine(entreprise.getNom()));
			
			System.out.println("       FONDATEUR(S)      ");
			System.out.println("--------------------------");

			
			
			for (Fondateur f : entreprise.getFondateur()) {
				System.out.print(f.getNom());
				System.out.print(" (" + f.getDateNaissance()+" - ");
				System.out.println(f.getLieuNaissance()+")");
			}
			
			
			System.out.println("       Siege Social      ");
			System.out.println("-------------------------");
			
			System.out.println(entreprise.getSiegeSocial().getSite());
			System.out.println(entreprise.getSiegeSocial().getVille());
			System.out.println(entreprise.getSiegeSocial().getEtat());
			System.out.println(entreprise.getSiegeSocial().getPays());
			System.out.println("       chiffre d'affaire      ");
			System.out.println("-------------------------------");
			
			for (ChiffreAffaire ca : entreprise.getChiffreAffaire()) {
				System.out.println(ca.getAnnee() + " : " + ca.getChiffre() + ca.getUnite());
			}
		}

	}

}
