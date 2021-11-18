package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Publication {
	
	@Id @GeneratedValue
	private Long idPublication;
	@ManyToOne
	private User auteur;
	@Column(columnDefinition = "LONGTEXT")
	private String contenu;
	private Date date;
	@Lob
	private byte[] image;
	
	

}
