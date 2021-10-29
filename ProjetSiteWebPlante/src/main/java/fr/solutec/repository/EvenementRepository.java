package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Evenement;

public interface EvenementRepository extends CrudRepository<Evenement, Long>{

}
