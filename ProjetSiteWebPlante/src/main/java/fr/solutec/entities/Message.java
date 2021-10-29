package fr.solutec.entities;

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
	private Long message;
	
	@ManyToOne
	private User expediteur;
	

	@OneToOne

	@ManyToOne

	private User destinataire;
}
