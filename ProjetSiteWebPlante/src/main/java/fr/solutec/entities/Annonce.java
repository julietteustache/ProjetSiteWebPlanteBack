package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity

@AllArgsConstructor @Data
public class Annonce {
	@Id @GeneratedValue
	private Long id;
	private int stock;
	private String type;
	private String description;
	private Plante plante;
	@OneToMany
	private User user;
	
public Annonce() {}


}
