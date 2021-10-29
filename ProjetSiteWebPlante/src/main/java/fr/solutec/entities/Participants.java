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
@Getter
@Setter
@IdClass(EvenementUserConstraint.class)
@NoArgsConstructor @AllArgsConstructor @Data
public class Participants implements Serializable {

	/**
	 * 
	 */
	

	@Id
	private Long idEvenement;
	
	@Id
	private Long idUser;
}
