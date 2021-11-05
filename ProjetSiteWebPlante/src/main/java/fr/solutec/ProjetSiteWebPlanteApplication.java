package fr.solutec;



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
		
		Plante p1=new Plante(null, "fleur", "", "rosier", "Le rosier est une plante faisant pousser des roses", 200, "automne", 5, "soleil");
		planteRepos.save(p1);
		Plante p2=new Plante(null, "arbre", "", "bonsai", "Le bonsai est une plante ressemblant à un arbre miniature", 500, "printemps", 10, "ombre");
		planteRepos.save(p2);
		Plante p3=new Plante(null, "légume", "curcubitacé", "courgette", "La courgette est un légume de la famille des cucurbitacés", 100, "printemps", 7, "soleil");
		planteRepos.save(p3);
		Plante p4=new Plante(null, "aromatique", "", "ciboulette", "La ciboulette est une herbe utilisée pour aromatiser les plats", 50, "printemps", 10, "soleil");
		planteRepos.save(p4);
		Plante p5=new Plante(null, "aromatique", "", "menthe", "La menthe est une herbe utilisée pour aromatiser les plats", 50, "printemps", 10, "soleil");
		planteRepos.save(p5);
		Plante p6=new Plante(null, "aromatique", "", "basilic", "Le basilic est une plante aromatique très prisée et utilisée notamment pour le pesto. Elle est très convoitée pour son goût et sa facilité à pousser", 50, "printemps", 6, "ombre");
		planteRepos.save(p6);
		Plante p7=new Plante(null, "fruit", "fruit rouge", "framboise", "La framboise est un fruit rouge délicieux", 200, "printemps", 8, "soleil");
		planteRepos.save(p7);
		
		Adresse a1=new Adresse(null,"120 rue d'Assas", 75006,"Paris");
		adresseRepos.save(a1);
		Adresse a2=new Adresse(null,"87 rue de Tolbiac", 75013,"Paris");
		adresseRepos.save(a2);
		Adresse a3=new Adresse(null,"40 avenue d'Etienne", 64200,"Biarritz");
		adresseRepos.save(a3);
		Adresse a4=new Adresse(null,"22 rue Lahouze", 64100,"Anglet");
		adresseRepos.save(a4);
		
		User u1=new User(null, "Eustache", "Juliette", "eujuliette","juju","débutant",Long.parseLong("1200"),a3);
		userRepos.save(u1);
		User u2=new User(null, "Cornet", "Arthur", "coarthur","tutur","débutant",Long.parseLong("0") ,a2);
		userRepos.save(u2);
		User u3=new User(null, "Gallon", "Marie-Rose", "mrgallon","maro","débutant",Long.parseLong("0"),a1);
		userRepos.save(u3);
		User u4=new User(null, "Msaidie", "Zaher", "mszaher","zaza","débutant",Long.parseLong("0"),a4);
		userRepos.save(u4);
		
		Annonce an1=new Annonce(null,3,"bouture","donne 3 bouture de bonsai",p2,u1);
		annonceRepos.save(an1);
		Annonce an2=new Annonce(null,1,"greffe","donne 1 greff de rosier",p1,u2);
		annonceRepos.save(an2);
		Annonce an3=new Annonce(null,5,"graine","donne 5 graines de courgette",p3,u3);
		annonceRepos.save(an3);
		Annonce an4=new Annonce(null,2,"graine","donne 2 graines de bonsai",p2,u3);
		annonceRepos.save(an4);

		Evenement e1=new Evenement(null,"Bouturage de rosiers","Apprendre le bouturage de rosiers anglais et de rosiers anciens.Ils sont plus compliqués à bouturer. J'utilise une ancienne technique qui évite le mastic et permet d'avoir une réussite de quasiment 100%. Nous ferons du bouturage en terre mais aussi en pot pour que chacun puisse ramener son rosier. Prenez des gants et des pots si possible!",10,null,a1);
		evenementRepos.save(e1);
		Evenement e2=new Evenement(null,"Greffe de pommier","Apprendre la greffe de pommier. Février est idéal pour greffer les pommiers, nous essayerons sur un pommier melrose.Prenez un sécateur",6,null,a2);
		evenementRepos.save(e2);
		Evenement e3=new Evenement(null,"Semer radis","Faire pousser des radis, cela peut être compliqué. Je propose un atlier pour bien savoir planter les radis en terre ou en jardinière",5,null,a3);
		evenementRepos.save(e3);
		Evenement e4=new Evenement(null,"Tailler les rosiers","Apprendre la taille des rosiers. Les rosiers se taille en février et je souhaite partage mes connaissances en taille",20,null,a4);
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
