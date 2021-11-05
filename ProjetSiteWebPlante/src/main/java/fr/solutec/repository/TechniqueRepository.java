package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Technique;

public interface TechniqueRepository extends CrudRepository<Technique, Long>{
	
	public Technique findByIdTechnique(Long id);
	
	public Iterable<Technique> findByNom(String nom);

}
