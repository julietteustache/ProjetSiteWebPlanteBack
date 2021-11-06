package fr.solutec.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;


import fr.solutec.entities.Message;
import fr.solutec.entities.User;

public interface MessageRepository extends CrudRepository<Message, Long>{
    public Optional<Message>findByDestinataireAndExpediteur(User destinataire,User expediteur);
    /* Je retire ça pour un test - Zaher
    public Stream<Message>findByExpediteur(User expediteur);
    public Stream<Message>findByDestinataire(User destinataire);
    */
    
    public Iterable<Message> findByExpediteur(User expediteur);
    public Iterable<Message> findByExpediteurIdUser(Long idUser);
    public Iterable<Message> findByExpediteurIdUserOrderByDateDesc(Long idUser);
    
    
    public Iterable<Message> findByDestinataire(User destinataire);
    public Iterable<Message> findByDestinataireIdUser(Long idUser);
    public Iterable<Message> findByDestinataireIdUserOrderByDateDesc(Long idUser);
    
    
    public Iterable<Message> findByDestinataireIdUserAndExpediteurIdUser(Long idExpediteur, Long idDestinataire);
}
