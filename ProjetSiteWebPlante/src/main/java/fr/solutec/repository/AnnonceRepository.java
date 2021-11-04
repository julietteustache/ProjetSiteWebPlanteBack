package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Annonce;
import fr.solutec.entities.User;

public interface AnnonceRepository extends CrudRepository<Annonce, Long>{
	
	public List<Annonce> findByPlanteCategorie(String categorie);

	public List<Annonce> findByPlanteSousCategorie(String sousCategorie);

	public List<Annonce> findByPlanteEspece(String espece);

	public List<Annonce> findByType(String type);

}
