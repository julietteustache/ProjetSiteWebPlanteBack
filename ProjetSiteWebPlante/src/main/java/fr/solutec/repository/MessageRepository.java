package fr.solutec.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import fr.solutec.entities.Message;
import fr.solutec.entities.User;

public interface MessageRepository extends CrudRepository<Message, Long>{
    public Optional<Message>findByDestinataireAndExpediteur(User destinataire,User expediteur);
    public Optional<Message>findByExpediteur(User expediteur);
}
