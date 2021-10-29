package fr.solutec;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Plante;
import fr.solutec.repository.PlanteRepository;

@SpringBootApplication
public class ProjetSiteWebPlanteApplication implements CommandLineRunner {
	@Autowired
	PlanteRepository planteRepos;

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


		
	}
	
	

	
	

}
