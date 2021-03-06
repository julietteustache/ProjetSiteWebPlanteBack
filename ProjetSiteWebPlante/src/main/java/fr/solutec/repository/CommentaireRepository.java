package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.*;

public interface CommentaireRepository extends CrudRepository<Commentaire, Long> {
	
	public Iterable<Commentaire> findByPlante(Plante p);
	
	public Iterable<Commentaire> findByAnnonce(Annonce a);
	
	public Iterable<Commentaire> findByTechnique(Technique t);
	
	public Iterable<Commentaire> findByEvenement(Evenement e);
	
	public Iterable<Commentaire> findByPlanteIdPlante(Long idPlante);
	
	public Iterable<Commentaire> findByTechniqueIdTechnique(Long idTechnique);
	
	public Iterable<Commentaire> findByPlanteIdPlanteOrderByIdCommentaireDesc(Long idPlante);
	
	public Iterable<Commentaire> findByTechniqueIdTechniqueOrderByIdCommentaireDesc(Long idTechnique);
	
	

}
