package fr.solutec.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@IdClass(EvenementUserConstraint.class)
@NoArgsConstructor @AllArgsConstructor @Data
public class Participants implements Serializable {

	@Id
	@ManyToOne
	private Evenement evenement;
	
	@Id
	@OneToMany
	private User participant;
}
