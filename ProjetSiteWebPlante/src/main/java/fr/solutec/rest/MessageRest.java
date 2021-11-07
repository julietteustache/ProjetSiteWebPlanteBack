package fr.solutec.rest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Message;
import fr.solutec.entities.User;
import fr.solutec.repository.MessageRepository;
import fr.solutec.repository.UserRepository;

@RestController @CrossOrigin("*")
public class MessageRest {
	@Autowired
	private MessageRepository messageRepos;
	@Autowired
	private UserRepository userRepos;
	
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
		return messageRepos.findByExpediteurIdUserOrderByDateDesc(idUser);
	}
	
	@GetMapping("destinataire/{idUser}") //Tous les messages dont idUser est le destinataire
	public Iterable<Message> getMsgDestinataire(@PathVariable Long idUser) {
		return messageRepos.findByDestinataireIdUserOrderByDateDesc(idUser);
	}
	/*
	@PostMapping("nvMsg/{idUser}")
	public Message nvMsg(@PathVariable Long idUser, String nom, String prenom, String message) {
		User user=userRepos.findByNomAndPrenom(nom, prenom);
		Calendar cal = Calendar.getInstance();
		if (user==null) {
			return null;
		}
		else {
			Long destinataire=user.getIdUser();
			Date dateMsg=cal.getTime();
			User expediteur=userRepos.findById(idUser);
			String msg=message;
			Message nvMsg= new Message(null, msg, dateMsg, expediteur, user);
			return messageRepos.save(nvMsg);
		}
		
	}
	*/
	
	@PostMapping("nvMsg")
	public Message saveMsg(@RequestBody Message m) {
		Calendar cal = Calendar.getInstance();
		m.setDate(cal.getTime());
		return messageRepos.save(m);
	}

}
