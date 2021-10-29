package fr.solutec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor @AllArgsConstructor @Data
public class Adresse {
	@Id @GeneratedValue
	private Long idAdresse;
	private String rue;
	private int cp;
	private String ville;

}
