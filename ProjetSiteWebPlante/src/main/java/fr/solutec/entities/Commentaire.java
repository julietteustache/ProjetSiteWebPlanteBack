package fr.solutec.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Data
public class Commentaire {
	@Id @GeneratedValue
	Long idCommentaire;
	String commentaire;
	User auteur;
	Plante plante;
	Annonce annonce;
	Evenement evenement;
}
