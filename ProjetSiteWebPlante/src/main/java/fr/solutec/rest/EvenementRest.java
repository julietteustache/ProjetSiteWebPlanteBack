package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Evenement;

import fr.solutec.repository.EvenementRepository;

@RestController @CrossOrigin("*")
public class EvenementRest {

	@Autowired
	private EvenementRepository EvenRepos;
	
	@GetMapping("event") // pour que les utilisteurs aient acces aux données (pour le front) 
	public Iterable<Evenement> getAllEvenement(){ // iterable un peu comme une liste avc fonctionnalité en +
		return EvenRepos.findAll();}
	
	/*@GetMapping("event/{id}")
	public Optional<Evenement>getEvenementById(){
		return EvenRepos.FindByIdEvenement();
	}*/
		
	@PostMapping("insertEvent")
	public Evenement saveEvenement(@RequestBody Evenement e) {
		return EvenRepos.save(e);}
	
	
	
}
