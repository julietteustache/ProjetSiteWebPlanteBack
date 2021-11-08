package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Adresse;
import fr.solutec.entities.User;
import fr.solutec.repository.AdresseRepository;

@RestController @CrossOrigin("*")
public class AdresseRest {
	@Autowired
	private AdresseRepository AdresseRepos;
	@PutMapping("modifadresse/{idAdresse}")
	public Adresse modifUser(@PathVariable Long idAdresse, @RequestBody Adresse a) {
		a.setIdAdresse(idAdresse);
		return AdresseRepos.save(a);
	}
	
	@PostMapping("nv_adresse")
	public Adresse saveAdresse(@RequestBody Adresse a) {
		return AdresseRepos.save(a);
	}



}
