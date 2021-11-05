package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @ AllArgsConstructor @Data
public class Technique {
	@Id @GeneratedValue
	private Long idTechnique;
	private String nom;
	private String description;

}
