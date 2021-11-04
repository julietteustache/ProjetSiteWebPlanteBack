package fr.solutec.rest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;

import fr.solutec.entities.Message;
import fr.solutec.entities.User;
import fr.solutec.repository.MessageRepository;

public class MessageRest {
	@Autowired
	private MessageRepository messageRepos;
	@GetMapping("message")
	public Stream <Message> getMess(@RequestBody User expediteur,@RequestBody User destinataire) {
		return Stream.concat(messageRepos.findByExpediteur(expediteur),messageRepos.findByDestinataire(destinataire));
	}

}
