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
		List<Entreprise> listeEntreprise = mapper.readValue(new File("C:/Users/cql-v/eclipse-workspace/testjackson/src/main/resources/json1.json"), collType);
		
		
		
		
		for (Entreprise entreprise : listeEntreprise) {
			System.out.println(entreprise.getNom());
			System.out.println(entreprise.getChiffreAffaire().get(0).getChiffre());
			
		}
		
		
	}


	
	
}
