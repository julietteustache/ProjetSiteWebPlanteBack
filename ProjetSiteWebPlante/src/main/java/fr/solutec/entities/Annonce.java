package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import javax.persistence.ManyToOne;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor @AllArgsConstructor @Data
public class Annonce {
	@Id @GeneratedValue

	private Long idUser;

	private Long idAnnonce;

	private int stock;
	private String type;
	private String description;

	private Plante plante;
	@ManyToOne
	private User user;

	@ManyToOne
	private Plante plante;
	@ManyToOne
	private User user;



}
