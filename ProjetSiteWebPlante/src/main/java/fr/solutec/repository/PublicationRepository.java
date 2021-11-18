package fr.solutec.repository;

import org.springframework.data.repository.CrudRepository;

import fr.solutec.entities.Publication;
import fr.solutec.entities.User;

public interface PublicationRepository extends CrudRepository<Publication, Long> {
	
	public Iterable<Publication> findByAuteur(User u);
	
	public Iterable<Publication> findByAuteurIdUserOrderByIdPublicationDesc(Long idUser);
	
	public void deleteByIdPublication(Long idPublication);
	
	public Iterable<Publication> findAllByOrderByIdPublicationDesc();	
	

}
