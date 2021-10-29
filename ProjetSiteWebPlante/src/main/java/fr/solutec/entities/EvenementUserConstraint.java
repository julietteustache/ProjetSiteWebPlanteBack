package fr.solutec.entities;

import java.io.Serializable;


import lombok.Data;



 @Data
public class EvenementUserConstraint implements Serializable{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idEvenement;

	private Long idUser;
	
	public EvenementUserConstraint() {
	
	}


}
