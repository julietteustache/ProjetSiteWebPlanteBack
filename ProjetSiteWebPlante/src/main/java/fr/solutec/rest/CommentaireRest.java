package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.repository.CommentaireRepository;
import fr.solutec.entities.*;

@RestController @CrossOrigin("*")
public class CommentaireRest {
	@Autowired
	private CommentaireRepository comRepos;
	
	@PostMapping("newcom")
	public Commentaire saveCommentaire(@RequestBody Commentaire c) {
		return comRepos.save(c);
	}
	
	@GetMapping("getcomplante/{idPlante}")
	public Iterable<Commentaire> getComPlante(@PathVariable Long idPlante) {
		return comRepos.findByPlanteIdPlante(idPlante);
	}
	
	@GetMapping("getcomtechnique/{idTechnique}")
	public Iterable<Commentaire> getComTechnique(@PathVariable Long idTechnique) {
		return comRepos.findByTechniqueIdTechnique(idTechnique);
	}
	
	@PostMapping("getcomannonce")
	public Iterable<Commentaire> getComAnnonce(@RequestBody Annonce a) {
		return comRepos.findByAnnonce(a);
	}
	
	@PostMapping("getcomevt")
	public Iterable<Commentaire> getComEvt(@RequestBody Evenement e) {
		return comRepos.findByEvenement(e);
	}
	

}
