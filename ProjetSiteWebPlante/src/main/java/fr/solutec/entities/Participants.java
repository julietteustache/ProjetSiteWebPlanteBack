package fr.solutec.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity




@NoArgsConstructor @AllArgsConstructor @Data
@IdClass(EvenementUserConstraint.class)
public class Participants implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id

	@ManyToOne
	private Evenement evenement;

	private Long idEvenement;
	

	@Id
	private Long idUser;
}
