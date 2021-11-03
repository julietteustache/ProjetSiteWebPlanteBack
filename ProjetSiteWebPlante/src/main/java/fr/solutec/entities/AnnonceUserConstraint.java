package fr.solutec.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class AnnonceUserConstraint implements Serializable{



	/**
	 * 
	 */
	


	private static final long serialVersionUID = 1L;




	private Long idAnnonce;

	
	private Long idUser;
	
	public AnnonceUserConstraint() {
//création du couple de clé primaire	
	}

	


}
