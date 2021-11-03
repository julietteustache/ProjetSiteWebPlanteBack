package fr.solutec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Evenement;

public interface EvenementRepository extends CrudRepository<Evenement, Long>{
	
	public List<Evenement>findByAdresseVille(String ville);
  
}
