package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity

@AllArgsConstructor @Data
public class Annonce {
	@Id @GeneratedValue
	private Long idUser;
	private int stock;
	private String type;
	private String description;
	private Plante plante;
	@ManyToOne
	private User user;
	



}
