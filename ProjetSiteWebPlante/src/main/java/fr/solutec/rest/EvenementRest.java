package fr.solutec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Evenement;
import fr.solutec.entities.User;
import fr.solutec.repository.EvenementRepository;

@RestController @CrossOrigin("*")
public class EvenementRest {

	@Autowired
	private EvenementRepository EvenRepos;
	
	@GetMapping("event") // pour que les utilisteurs aient acces aux données (pour le front) 
	public Iterable<Evenement> getAllEvenement(){ // iterable un peu comme une liste avc fonctionnalité en +
		return EvenRepos.findAll();}
		
	@PostMapping("insertEvent")
	public Evenement saveEvenement(@RequestBody Evenement e) {
		return EvenRepos.save(e);}
	
	@PutMapping("event/{Nb}") //modifier un objet  --> considere qu'on a le user complet a modifer 
	public Evenement modifEvent(@PathVariable int Nb, @RequestBody Evenement e) {
		e.setNbParticipants(Nb); //permet de fixer l'id du user pour ne pas avoir à le réecrire
		return EvenRepos.save(e);
	}
	
	@GetMapping("eventville/{ville}")
	public List<Evenement>getByVille(@PathVariable String ville){
		return EvenRepos.findByAdresseVille(ville);
	
}}
