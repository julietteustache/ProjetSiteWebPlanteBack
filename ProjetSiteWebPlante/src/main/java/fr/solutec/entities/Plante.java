package fr.solutec.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Plante {
	@Id @GeneratedValue
	Long idPlante;
	String categorie;
	String sousCategorie;
	String espece;
	@Column(columnDefinition = "LONGTEXT")
	String description;
	int prix;
	String calendrier;
	int arrosage;
	String exposition;
	
	@Lob
	private byte[] image;
	
}
