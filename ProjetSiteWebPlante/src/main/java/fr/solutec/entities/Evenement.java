package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor @AllArgsConstructor @Data
public class Evenement {
	@Id @GeneratedValue
	private Long idEvenement;
	private String titre;
	private String description;
	private int NbParticipants;
	@ManyToOne
	private User organisateur;
	@ManyToOne
	private Adresse adresse;
}
