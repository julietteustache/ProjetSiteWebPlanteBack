package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.*;
@Entity

@AllArgsConstructor @NoArgsConstructor @Data
public class Commentaire {
	@Id @GeneratedValue
	Long idCommentaire;
	String commentaire;
	
	@ManyToOne
	User auteur;
	Plante plante;
	Annonce annonce;
	Evenement evenement;
}
