package fr.solutec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.solutec.entities.User;
import fr.solutec.repository.UserRepository;

@RestController @CrossOrigin("*")
public class UserRest {
	@Autowired
	private UserRepository userRepos;
	
	@PostMapping("user")
	public Iterable<User> rechercheUser(@RequestBody User u) {
		Iterable<User> p=userRepos.findByLogin(u.getLogin());
		return p;
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
		return userRepos.save(p);
	}
}
