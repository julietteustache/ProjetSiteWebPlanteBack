package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Annonce;
import fr.solutec.entities.User;
import fr.solutec.repository.AnnonceRepository;
@RestController @CrossOrigin("*")

public class AnnonceRest {
	@Autowired
	private AnnonceRepository annonceRepos;
	
	@GetMapping("/annonce")  
	public Iterable<Annonce> getAllAnnonce(){ 
		return annonceRepos.findAll();
	}
		
	@PostMapping("/annonce") //
	public Annonce saveUser(@RequestBody Annonce a) {
		return annonceRepos.save(a);
	}
}
	


