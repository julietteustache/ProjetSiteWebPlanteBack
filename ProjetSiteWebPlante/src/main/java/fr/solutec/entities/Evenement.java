package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity

@AllArgsConstructor @Data
public class Evenement {
	@Id @GeneratedValue
	private Long id;
	private String titre;
	private String description;
	private int NbParticipants;
	@OneToOne
	private User organisateur;
	@OneToOne
	private Adresse adresse;
	
}
