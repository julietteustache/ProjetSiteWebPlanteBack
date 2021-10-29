package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.*;

public interface CommentaireRepository extends CrudRepository<Commentaire, Long> {
	
	public Iterable<Commentaire> findByPlante(Plante p);
	
	public Iterable<Commentaire> findByAnnonce(Annonce a);
	
	public Iterable<Commentaire> findByEvenement(Evenement e);
	
	

}
