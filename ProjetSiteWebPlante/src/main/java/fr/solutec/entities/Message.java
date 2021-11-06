package fr.solutec.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;

import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Message {
	@Id @GeneratedValue
	private Long id_msg;
	private String message;
	private Date date;
	
	@ManyToOne
	private User expediteur;
	

	@ManyToOne
	private User destinataire;
}
