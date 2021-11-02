package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Plante;

public interface PlanteRepository extends CrudRepository<Plante, Long>{
	
	public Iterable<Plante> findByEspece(String espece);
	
}
