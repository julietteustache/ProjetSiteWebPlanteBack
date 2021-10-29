package fr.solutec.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@IdClass(AnnonceUserConstraint.class)
@NoArgsConstructor @AllArgsConstructor @Data
public class Commande implements Serializable{
	
	/**
	 * 
	 */


	@Id
	@ManyToOne
	private User user;
	
	@Id
	@OneToOne
	private Annonce annonce;
	
	private int quantite;
}