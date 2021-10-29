package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Plante;
import fr.solutec.repository.PlanteRepository;

@RestController @CrossOrigin("*")
public class PlanteRest {
	@Autowired
	private PlanteRepository planteRepos;
	
	@PostMapping("plante")
	public Iterable<Plante> rechercheNomPlantes(@RequestBody String espece){
		Iterable<Plante> p=planteRepos.findByEspece(espece);
		return p;
	}
	
	@GetMapping("plante")
	public Iterable<Plante> getPlantes() {
		Iterable<Plante> p=planteRepos.findAll();
		return p;
	}
	
	

}
