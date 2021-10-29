package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Commentaire;

public interface CommentaireRepository extends CrudRepository<Commentaire, Long> {

}
