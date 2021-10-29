package fr.solutec.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class Plante {
	@Id @GeneratedValue
	Long idPlante;
	String categorie;
	String sousCategorie;
	String espece;
	String description;
	int prix;
	String calendrier;
	int arrosage;
	String exposition;
}
