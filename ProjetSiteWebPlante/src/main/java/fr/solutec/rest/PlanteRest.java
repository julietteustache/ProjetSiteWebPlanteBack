package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Plante;
import fr.solutec.repository.PlanteRepository;

@RestController @CrossOrigin("*")
public class PlanteRest {
	@Autowired
	private PlanteRepository planteRepos;
	
	@PostMapping("plante")
	public Iterable<Plante> rechercheNomPlantes(@RequestBody Plante u) {
		Iterable<Plante> p=planteRepos.findByEspece(u.getEspece());
		return p;
	}
	
	@GetMapping("plante")
	public Iterable<Plante> getPlantes() {
		Iterable<Plante> p=planteRepos.findAll();
		return p;
	}
	
	@GetMapping("plante/{idPlante}") 
		public Plante getPlanteId(@PathVariable Long idPlante, Plante p) {
			return planteRepos.findByIdPlante(idPlante);
		}
	
	@PostMapping("creerplante")
	public Plante savePlante(@RequestBody Plante p) {
		return planteRepos.save(p);
	}
	
	@PutMapping("modifplante/{idPlante}")
	public Plante modifPlante(@PathVariable Long idPlante, @RequestBody Plante p) {
		return planteRepos.save(p);
	}
	
	@GetMapping("plante/{categorie}")
	public Iterable<Plante> getPlanteCategorie(@PathVariable String categorie) {
		return planteRepos.findByCategorie(categorie);
	}
	/*
	@GetMapping("plante/categories")
	public Iterable<Plante> getCategories(){
		return planteRepos.findDistinctCategorie();
	}
	*/
	
	
	

}
