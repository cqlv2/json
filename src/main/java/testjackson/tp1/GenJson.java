package testjackson.tp1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.type.CollectionType;

public class GenJson {

	public static void main(String[] aze) throws JsonGenerationException, JsonMappingException, IOException {

		Entreprise entrA = new Entreprise("entrepriseA", new SiegeSocial("siteA", "villeA", "etatA", "paysA"));
		entrA.getFondateur().add(new Fondateur("nomA1", LocalDate.of(2000, 5, 1), "lieuA1"));
		entrA.getFondateur().add(new Fondateur("nomA2", LocalDate.of(2010, 5, 1), "lieuA2"));
		entrA.getChiffreAffaire().add(new ChiffreAffaire(2020, 123, "M€"));
		entrA.getChiffreAffaire().add(new ChiffreAffaire(2019, 234, "M€"));
		entrA.getChiffreAffaire().add(new ChiffreAffaire(2018, 345, "M€"));
		entrA.getChiffreAffaire().add(new ChiffreAffaire(2017, 456, "M€"));

		Entreprise entrB = new Entreprise("entrepriseB", new SiegeSocial("siteB", "villeB", "etatB", "paysB"));
		entrB.getFondateur().add(new Fondateur("nomB1", LocalDate.of(2000, 6, 1), "lieuB1"));
		entrB.getFondateur().add(new Fondateur("nomA2", LocalDate.of(2010, 6, 1), "lieuA2"));
		entrB.getChiffreAffaire().add(new ChiffreAffaire(2016, 123, "M€"));
		entrB.getChiffreAffaire().add(new ChiffreAffaire(2015, 234, "M€"));
		entrB.getChiffreAffaire().add(new ChiffreAffaire(2014, 345, "M€"));
		entrB.getChiffreAffaire().add(new ChiffreAffaire(2013, 456, "M€"));

		List<Entreprise> listE = new ArrayList<Entreprise>();
		listE.add(entrA);
		listE.add(entrB);

		String target = "C:/Temp/monFichier3.json";

		// creation de l'instence de ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		// creation d'une instence de DefaultPrettyPrinter a partir de l'instence de ObjectMapper
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		// utilisation de l'instence de DefaultPrettyPrinter a la place de l'instence de ObjectMapper
		writer.writeValue(new File(target), listE);

		System.out.println("json generer a l'emplacement : " + target);
	}

}
