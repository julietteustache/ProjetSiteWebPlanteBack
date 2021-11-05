package fr.solutec.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Plante;

public interface PlanteRepository extends CrudRepository<Plante, Long>{
	
	public Iterable<Plante> findByEspece(String espece);
	
	public Plante findByIdPlante (Long id);
	
	public Iterable<Plante> findByCategorie(String categorie);
/*
	public List<String> findCategorie();
*/

}
