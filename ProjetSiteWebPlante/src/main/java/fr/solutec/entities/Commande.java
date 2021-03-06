package fr.solutec.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(AnnonceUserConstraint.class)

@NoArgsConstructor @AllArgsConstructor @Data

public class Commande implements Serializable{
	
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;


	@Id
	private Long idUser;

	@Id
	private Long idAnnonce;
	
private int quantite;

	
}