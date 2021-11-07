package fr.solutec.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("connexion")
	public Optional<User> rechercheUser(@RequestBody User u) {
		return userRepos.findByLoginAndMdp(u.getLogin(), u.getMdp());
	}
	
	@GetMapping("user")
	public Iterable<User> getUser() {
		Iterable<User> p=userRepos.findAll();
		return p;
	}
	
	@PostMapping("inscription")
	public User saveUser(@RequestBody User p) {
		return userRepos.save(p);
	}
	
	@PutMapping("modifuser/{idUser}")
	public User modifUser(@PathVariable Long idUser, @RequestBody User p) {
		p.setIdUser(idUser);
		return userRepos.save(p);

	}
	/*@PutMapping("score/{score}") //modifier un objet  --> considere qu'on a le user complet a modifer 
	public User modifScore(@PathVariable Long score, @RequestBody User u) {
		u.setScore(score); //permet de fixer l'id du user pour ne pas avoir à le réecrire
		return userRepos.save(u);
}*/
	@GetMapping("user/{nom}/{prenom}")
	public User trvUser(@PathVariable String nom, @PathVariable String prenom) {
		return userRepos.findByNomAndPrenom(nom, prenom);
	}
	
}
