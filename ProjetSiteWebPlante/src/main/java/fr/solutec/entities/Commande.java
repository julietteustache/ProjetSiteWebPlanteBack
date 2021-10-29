package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Commande {
	@ManyToOne
	private User user;
	
	@OneToOne
	private Annonce annonce;
	
	private int quantite;
}