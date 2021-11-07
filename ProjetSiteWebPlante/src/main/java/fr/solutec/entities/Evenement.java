package fr.solutec.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


@AllArgsConstructor @Data @NoArgsConstructor

public class Evenement {
	@Id @GeneratedValue
	private Long idEvenement;
	private String titre;
	@Column(columnDefinition = "LONGTEXT")
	private String description;
	private int NbParticipants;
	private String date;
	private String heure;
	@ManyToOne
	private User organisateur;
	@ManyToOne
	private Adresse adresse;
}
