package fr.solutec.rest;

import java.util.Optional;

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
	public Optional <Message> getMessOptional(@RequestBody User expediteur) {
		return messageRepos.findByExpediteur(expediteur);
	}

}
