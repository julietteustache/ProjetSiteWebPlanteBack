package fr.solutec.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import javax.persistence.ManyToOne;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


@AllArgsConstructor @NoArgsConstructor @Data



public class Annonce {
	@Id @GeneratedValue
	private Long idAnnonce;
	private int stock;
	private String type;
	@Column(columnDefinition = "LONGTEXT")
	private String description;
    @ManyToOne
	private Plante plante;
	@ManyToOne
	private User user;





}
