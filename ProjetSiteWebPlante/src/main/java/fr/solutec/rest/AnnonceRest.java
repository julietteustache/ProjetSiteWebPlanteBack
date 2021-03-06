package fr.solutec.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Annonce;
import fr.solutec.entities.Evenement;
import fr.solutec.repository.AnnonceRepository;
@RestController @CrossOrigin("*")

public class AnnonceRest {
	@Autowired
	private AnnonceRepository annonceRepos;
	
	@GetMapping("/annonce")  
	public Iterable<Annonce> getAllAnnonce(){ 
		return annonceRepos.findAll();
	}
		
	@PostMapping("/newAnnonce") //
	public Annonce saveAnnonce(@RequestBody Annonce a) {
		return annonceRepos.save(a);
	}
	
	
	
	@GetMapping("annonce_categorie/{categorie}") //avoir des données
	public List<Annonce> getAnnonceByCategorie(@PathVariable String categorie){
		return annonceRepos.findByPlanteCategorie(categorie);
	}
	
	@GetMapping("annonce_souscategorie/{sousCategorie}") //avoir des données
	public List<Annonce> getAnnonceBySousCategorie(@PathVariable String sousCategorie){
		return annonceRepos.findByPlanteSousCategorie(sousCategorie);
	}
	
	@GetMapping("annonce_espece/{espece}") //avoir des données
	public List<Annonce> getAnnonceByEspece(@PathVariable String espece){
		return annonceRepos.findByPlanteEspece(espece);
	}
	
	@GetMapping("annonce_type/{type}") //avoir des données
	public List<Annonce> getAnnonceByType(@PathVariable String type){
		return annonceRepos.findByType(type);
	}

	@PutMapping("annonce/{stock}") //modifier un objet  --> considere qu'on a le user complet a modifer 
	public Annonce modifAnnonce(@PathVariable int stock, @RequestBody Annonce a) {
		a.setStock(stock); //permet de fixer l'id du user pour ne pas avoir à le réecrire
		return annonceRepos.save(a);
	}
	
	
	@DeleteMapping("annonce/{idAnnonce}")  
	public boolean suppAnnonce(@PathVariable Long idAnnonce ) {
		if(annonceRepos.findById(idAnnonce).isPresent())
		{
			annonceRepos.deleteById(idAnnonce);
			return true;
		}
		else
		{
			return false;
		}}

	@GetMapping("rechercheA")
	public Annonce getIdEvenementMax() {
		int a =0;
		Long idmax=Long.valueOf(a);
		Annonce annonce1=new Annonce();
		Iterable<Annonce> e = annonceRepos.findAll();
		for (Annonce annonce : e) {
			Long id=annonce.getIdAnnonce();
			if (id>idmax) {
				idmax=id;
				annonce1=annonce;
			}
		}
		
		return annonce1;

	}
	
	
}
	


