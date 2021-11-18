package fr.solutec.rest;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Publication;
import fr.solutec.repository.PublicationRepository;

@RestController @CrossOrigin("*")
public class PublicationRest {
	@Autowired
	private PublicationRepository publiRepos;
	
	@GetMapping("publications/{idUser}")
	public Iterable<Publication> getPublications(@PathVariable Long idUser) {
		return publiRepos.findByAuteurIdUserOrderByIdPublicationDesc(idUser);
	}
	
	@PostMapping("nv_publication")
	public Publication newPublication(@RequestBody Publication p) {
		Calendar cal = Calendar.getInstance();
		p.setDate(cal.getTime());
		return publiRepos.save(p);
	}
	
	@DeleteMapping("suppPubli/{idPublication}")
	public void suppPubli(@PathVariable Long idPublication) {
		publiRepos.deleteByIdPublication(idPublication);
	}
	
	@GetMapping("allpublis")
	public Iterable<Publication> getAllPublis() {
		return publiRepos.findAllByOrderByIdPublicationDesc();
	}
	
	

}
