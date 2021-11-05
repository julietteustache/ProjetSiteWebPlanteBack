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
	@ManyToOne
	Plante plante;
	@ManyToOne
	Annonce annonce;
	@ManyToOne
	Evenement evenement;
	@ManyToOne
	Technique technique;
}
