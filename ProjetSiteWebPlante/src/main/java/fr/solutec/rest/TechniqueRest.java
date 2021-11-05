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
import fr.solutec.entities.Technique;
import fr.solutec.repository.TechniqueRepository;

@RestController @CrossOrigin("*")
public class TechniqueRest {
	
	@Autowired
	private TechniqueRepository techRepos;
	
	@GetMapping("techniques")
	public Iterable<Technique> getTechniques() {
		return techRepos.findAll();
	}
	
	@GetMapping("techniques/{idTechnique}")
	public Technique getTechniqueId(@PathVariable Long idTechnique, Technique t) {
		return techRepos.findByIdTechnique(idTechnique);
	}
	
	@PutMapping("modiftechnique/{idTechnique}")
		public Technique modifTechnique(@PathVariable Long idTechnique, @RequestBody Technique t) {
			t.setIdTechnique(idTechnique);
			return techRepos.save(t);
	}
	
	@PostMapping("creertechnique")
	public Technique creerTechnique(@RequestBody Technique t) {
		return techRepos.save(t);
}
	

}
