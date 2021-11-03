package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.Evenement;
import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;
@RestController @CrossOrigin("*")
public class UserRest {
	@Autowired
	private UserRepository userRepos;
	@PutMapping("score/{score}") //modifier un objet  --> considere qu'on a le user complet a modifer 
	public User modifScore(@PathVariable Long score, @RequestBody User u) {
		u.setScore(score); //permet de fixer l'id du user pour ne pas avoir à le réecrire
		return userRepos.save(u);
	}
}
