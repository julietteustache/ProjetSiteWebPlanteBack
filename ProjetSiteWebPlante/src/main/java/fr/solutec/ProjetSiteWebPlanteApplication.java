package fr.solutec;


import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Adresse;
import fr.solutec.entities.Annonce;
import fr.solutec.entities.Plante;
import fr.solutec.entities.User;
import fr.solutec.repository.AdresseRepository;
import fr.solutec.repository.AnnonceRepository;
import fr.solutec.repository.PlanteRepository;
import fr.solutec.repository.UserRepository;

@SpringBootApplication
public class ProjetSiteWebPlanteApplication implements CommandLineRunner {
	@Autowired
	PlanteRepository planteRepos;
	@Autowired
	AnnonceRepository annonceRepos;
	@Autowired
	UserRepository userRepos;
	@Autowired
	AdresseRepository adresseRepos;

	public static void main(String[] args) {
		SpringApplication.run(ProjetSiteWebPlanteApplication.class, args);
		System.out.println("Commande terminée");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Plante p1=new Plante(null, "rose", "rose", "rosier", "Le rosier est une plante faisant pousser des roses", 200, "automne", 5, "soleil");
		planteRepos.save(p1);
		
		Plante p2=new Plante(null, "bonsai", "bonsai", "bonsai", "Le bonsai est une plante ressemblant à un arbre miniature", 500, "printemps", 10, "ombre");
		planteRepos.save(p2);
		Plante p3=new Plante(null, "légume", "curcubitacé", "courgette", "La courgette est un légume de la famille des cucurbitacés", 100, "printemps", 7, "soleil");
		planteRepos.save(p3);
		Plante p4=new Plante(null, "plante", "aromatique", "ciboulette", "La ciboulette est une herbe utilisée pour aromatiser les plats", 50, "printemps", 10, "soleil");
		planteRepos.save(p4);
		
		Adresse a1=new Adresse(null,"120 rue d'Assas", 75006,"Paris");
		adresseRepos.save(a1);
		Adresse a2=new Adresse(null,"87 rue de Tolbiac", 75013,"Paris");
		adresseRepos.save(a2);
		Adresse a3=new Adresse(null,"40 avenue d'Etienne", 64200,"Biarritz");
		adresseRepos.save(a3);
		Adresse a4=new Adresse(null,"22 rue Lahouze", 64100,"Anglet");
		adresseRepos.save(a4);
		
		User u1=new User(null, "Eustache", "Juliette", "eujuliette","juju","débutant",null,a3);
		userRepos.save(u1);
		User u2=new User(null, "Cornet", "Arthur", "coarthur","tutur","débutant",null,a2);
		userRepos.save(u2);
		User u3=new User(null, "Gallon", "Marie-Rose", "mrgallon","maro","débutant",null,a1);
		userRepos.save(u3);
		User u4=new User(null, "Msaidie", "Zaher", "mszaher","zaza","débutant",null,a4);
		userRepos.save(u4);
		
		Annonce an1=new Annonce(null,3,"bouture","donne 3 bouture de bonsai",p2,u1);
		annonceRepos.save(an1);
		Annonce an2=new Annonce(null,1,"greffe","donne 1 greff de rosier",p1,u2);
		annonceRepos.save(an2);
		Annonce an3=new Annonce(null,5,"graine","donne 5 graines de courgette",p3,u3);
		annonceRepos.save(an3);
		Annonce an4=new Annonce(null,2,"graine","donne 2 graines de bonsai",p2,u3);
		annonceRepos.save(an4);


		
	}
	
	

	
	

}
