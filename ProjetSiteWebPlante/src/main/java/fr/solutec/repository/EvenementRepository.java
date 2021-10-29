package fr.solutec.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Evenement;

public interface EvenementRepository extends CrudRepository<Evenement, Long>{
	
	//public Optional<Evenement>FindByIdEvenement();
  
}
