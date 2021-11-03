package fr.solutec;


import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Adresse;
import fr.solutec.entities.Annonce;
import fr.solutec.entities.Commentaire;
import fr.solutec.entities.Evenement;
import fr.solutec.entities.Plante;
import fr.solutec.entities.User;
import fr.solutec.repository.AdresseRepository;
import fr.solutec.repository.AnnonceRepository;
import fr.solutec.repository.CommentaireRepository;
import fr.solutec.repository.EvenementRepository;
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
	@Autowired
	EvenementRepository evenementRepos;
	@Autowired
	CommentaireRepository comRepos;

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

		Evenement e1=new Evenement(null,"Bouturage","Apprendre le bouturage",10,null,a1);
		evenementRepos.save(e1);
		Evenement e2=new Evenement(null,"Greffe","Apprendre la greffe",6,null,a2);
		evenementRepos.save(e2);
		Evenement e3=new Evenement(null,"Semer radis","Faire pousser des radis",5,null,a3);
		evenementRepos.save(e3);
		Evenement e4=new Evenement(null,"Tailler les rosiers","Apprendre la taille des rosiers",20,null,a4);
		evenementRepos.save(e4);
		
		Commentaire c1=new Commentaire(null, "Les roses sont mes fleurs préférées", u1, p1, null, null);
		comRepos.save(c1);
		Commentaire c2=new Commentaire(null, "Comment s'occuper des rosiers?", u4, p1, null, null);
		comRepos.save(c2);
		Commentaire c3=new Commentaire(null, "Je suis intéressé !", u3, null, null, e1);
		comRepos.save(c3);
		Commentaire c4=new Commentaire(null, "Je suis intéressé aussi !", u2, null, null, e1);
		comRepos.save(c4);
		Commentaire c5=new Commentaire(null, "Les roses sont mes fleurs préférées", u4, null, an4, null);
		comRepos.save(c5);
		Commentaire c6=new Commentaire(null, "Les roses sont mes fleurs préférées", u3, null, an4, null);
		comRepos.save(c6);
		
	}
}
