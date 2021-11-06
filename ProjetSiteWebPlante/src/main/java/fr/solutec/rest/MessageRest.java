package fr.solutec.rest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.entities.User;
import fr.solutec.repository.MessageRepository;

@RestController @CrossOrigin("*")
public class MessageRest {
	@Autowired
	private MessageRepository messageRepos;
	
	/* Je retire ça pour un test - Zaher
	@GetMapping("message")
	public Stream <Message> getMess(@RequestBody User expediteur,@RequestBody User destinataire) {
		return Stream.concat(messageRepos.findByExpediteur(expediteur),messageRepos.findByDestinataire(destinataire));
	}
	*/
	
	@GetMapping("messages/{idUser}/{idDestinataire}")
	public Iterable<Message> getMessagesByDestinataire(@PathVariable Long idUser, @PathVariable Long idDestinataire) {
		return messageRepos.findByDestinataireIdUserAndExpediteurIdUser(idUser, idDestinataire);
	}
	
	@GetMapping("expediteur/{idUser}") //Tous les messages dont idUser est l'expéditeur
	public Iterable<Message> getMsgExpediteur(@PathVariable Long idUser) {
		return messageRepos.findByExpediteurIdUser(idUser);
	}
	
	@GetMapping("destinataire/{idUser}")
	public Iterable<Message> getMsgDestinataire(@PathVariable Long idUser) {
		return messageRepos.findByDestinataireIdUser(idUser);
	}

}
