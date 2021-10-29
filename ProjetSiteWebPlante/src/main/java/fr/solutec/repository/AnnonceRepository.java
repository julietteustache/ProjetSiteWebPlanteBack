package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Annonce;

public interface AnnonceRepository extends CrudRepository<Annonce, Long>{

}
