package fr.solutec;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.solutec.entities.Adresse;
import fr.solutec.entities.Annonce;
import fr.solutec.entities.Commentaire;
import fr.solutec.entities.Evenement;
import fr.solutec.entities.Message;
import fr.solutec.entities.Plante;
import fr.solutec.entities.Technique;
import fr.solutec.entities.User;
import fr.solutec.repository.AdresseRepository;
import fr.solutec.repository.AnnonceRepository;
import fr.solutec.repository.CommentaireRepository;
import fr.solutec.repository.EvenementRepository;
import fr.solutec.repository.MessageRepository;
import fr.solutec.repository.PlanteRepository;
import fr.solutec.repository.TechniqueRepository;
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
	@Autowired
	TechniqueRepository techRepos;
	@Autowired
	MessageRepository msgRepos;

	public static void main(String[] args) {
		SpringApplication.run(ProjetSiteWebPlanteApplication.class, args);
		System.out.println("Commande terminée");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Plante p1=new Plante(null, "fleur", "", "rosier", "Le rosier est une plante faisant pousser des roses", 200, "automne", 5, "soleil", null);
		planteRepos.save(p1);
		Plante p2=new Plante(null, "arbre", "", "bonsai", "Le bonsai est une plante ressemblant à un arbre miniature", 500, "printemps", 10, "ombre", null);
		planteRepos.save(p2);
		Plante p3=new Plante(null, "légume", "curcubitacé", "courgette", "La courgette est un légume de la famille des cucurbitacés", 100, "printemps", 7, "soleil", null);
		planteRepos.save(p3);
		Plante p4=new Plante(null, "aromatique", "", "ciboulette", "La ciboulette est une herbe utilisée pour aromatiser les plats", 50, "printemps", 10, "soleil", null);
		planteRepos.save(p4);
		Plante p5=new Plante(null, "aromatique", "", "menthe", "La menthe est une herbe utilisée pour aromatiser les plats", 50, "printemps", 10, "soleil", null);
		planteRepos.save(p5);
		Plante p6=new Plante(null, "aromatique", "", "basilic", "Le basilic est une plante aromatique très prisée et utilisée notamment pour le pesto. Elle est très convoitée pour son goût et sa facilité à pousser", 50, "printemps", 6, "ombre", null);
		planteRepos.save(p6);
		Plante p7=new Plante(null, "fruit", "fruit rouge", "framboise", "La framboise est un fruit rouge délicieux", 200, "printemps", 8, "soleil", null);
		planteRepos.save(p7);
		Plante p8=new Plante(null, "légume", "curcubitacé", "potiron", "Le potiron fait partie de la famille des courges et est originaire d'Amérique du Sud.", 100, "automne", 3, "soleil", null);
		planteRepos.save(p8);
		
		Adresse a1=new Adresse(null,"120 rue d'Assas", 75006,"Paris");
		adresseRepos.save(a1);
		Adresse a2=new Adresse(null,"87 rue de Tolbiac", 75013,"Paris");
		adresseRepos.save(a2);
		Adresse a3=new Adresse(null,"40 avenue d'Etienne", 64200,"Biarritz");
		adresseRepos.save(a3);
		Adresse a4=new Adresse(null,"22 rue Lahouze", 64100,"Anglet");
		adresseRepos.save(a4);
		

		User u1=new User(null, "Eustache", "Juliette", "eujuliette","juju","débutant",Long.parseLong("1000"),a3);
		userRepos.save(u1);
		User u2=new User(null, "Cornet", "Arthur", "coarthur","tutur","débutant",Long.parseLong("0") ,a2);
		userRepos.save(u2);
		User u3=new User(null, "Gallon", "Marie-Rose", "mrgallon","maro","débutant",Long.parseLong("0"),a1);
		userRepos.save(u3);
		User u4=new User(null, "Msaidie", "Zaher", "mszaher","zaza","Primevère hivernale",Long.parseLong("750"),a4);
		userRepos.save(u4);
		
		Annonce an1=new Annonce(null,3,"bouture","donne 3 bouture de bonsai",p2,u1);
		annonceRepos.save(an1);
		Annonce an2=new Annonce(null,1,"Greffe","Donne 1 greffe de rosier. Remise en main propre sur Paris.",p1,u2);
		annonceRepos.save(an2);
		Annonce an3=new Annonce(null,5,"graine","donne 5 graines de courgette",p3,u3);
		annonceRepos.save(an3);
		Annonce an4=new Annonce(null,2,"graine","donne 2 graines de bonsai",p2,u3);
		annonceRepos.save(an4);
		Annonce an5=new Annonce(null,2,"plants","Echange plants de ciboulette contre basilic ou autres herbes aromatiques. Remise en main propre sur Paris possible !",p4,u2);
		annonceRepos.save(an5);
		Annonce an6=new Annonce(null,40,"graine","Donne des graines de potiron déjà germées. Je peux les remettre en main propre sur Paris ou bien les envoyer par la poste. Merci de me contacter avant de passer commande svp !",p4,u2);
		annonceRepos.save(an6);

		Evenement e1=new Evenement(null,"Bouturage de rosiers","Apprendre le bouturage de rosiers anglais et de rosiers anciens.Ils sont plus compliqués à bouturer. J'utilise une ancienne technique qui évite le mastic et permet d'avoir une réussite de quasiment 100%. Nous ferons du bouturage en terre mais aussi en pot pour que chacun puisse ramener son rosier. Prenez des gants et des pots si possible!",10,"10/11/2021","16h",null,a1);
		evenementRepos.save(e1);
		Evenement e2=new Evenement(null,"Greffe de pommier","Apprendre la greffe de pommier. Février est idéal pour greffer les pommiers, nous essayerons sur un pommier melrose.Prenez un sécateur",6,"11/12/2021","10h",null,a2);
		evenementRepos.save(e2);
		Evenement e3=new Evenement(null,"Semer radis","Faire pousser des radis, cela peut être compliqué. Je propose un atlier pour bien savoir planter les radis en terre ou en jardinière",5,"20/11/2021","18h",null,a3);
		evenementRepos.save(e3);
		Evenement e4=new Evenement(null,"Tailler les rosiers","Apprendre la taille des rosiers. Les rosiers se taille en février et je souhaite partage mes connaissances en taille",20,"17/11/2021","9h",null,a4);
		evenementRepos.save(e4);
		Evenement e5=new Evenement(null,"Planter des patates","Il y a certaines techniques à savoir pour planter des pommes de terre en permaculture. Nous allons voir la technique des buttes",6,"10/11/2021","18h",null,a4);
		evenementRepos.save(e5);
		
		Commentaire c1=new Commentaire(null, "Les roses sont mes fleurs préférées", u1, p1, null, null, null);
		comRepos.save(c1);
		Commentaire c2=new Commentaire(null, "Comment s'occuper des rosiers?", u4, p1, null, null, null);
		comRepos.save(c2);
		Commentaire c3=new Commentaire(null, "Je suis intéressé !", u3, null, null, e1, null);
		comRepos.save(c3);
		Commentaire c4=new Commentaire(null, "Je suis intéressé aussi !", u2, null, null, e1, null);
		comRepos.save(c4);
		
		
		Technique t1=new Technique(null, "semis", "Le semis est une opération culturale qui consiste à mettre en terre les graines ou semences que ce soit dans un champ ou une surface de petite dimension. Le semis peut se faire à la main, ou de manière mécanisée à l'aide de semoirs.", null);
		techRepos.save(t1);
		Technique t2=new Technique(null, "bouturage", "Le bouturage est un mode de multiplication végétative de certaines plantes, consistant à donner naissance à un nouvel individu à partir d'un organe ou d'un fragment d'organe isolé (morceau de rameau, feuille, racine, tige, écaille de bulbe).\r\n"
				+ "\r\n"
				+ "Avec le bouturage, il y a d'abord séparation de l'organe végétatif, puis enracinement ; à la différence du marcottage où, cette fois, il y a enracinement puis séparation de l'organe végétatif.\r\n"
				+ "\r\n"
				+ "Le bouturage est une forme de clonage : la bouture est génétiquement identique à la plante mère, puisqu'il s'agit tout simplement d'un morceau de cette plante. La « prise » du bouturage se fait par dédifférenciation cellulaire au niveau du méristème.\r\n"
				+ "\r\n"
				+ "En tant que mode de reproduction, le bouturage peut être naturel ou artificiellement provoqué (par les jardiniers amateurs ou en pépinière). Dans ce dernier cas, on dit qu'on emploie la « technique » du bouturage pour produire de nouveaux plants, soit parce que c'est un mode opératoire simple et viable pour la plante qu'on cherche à reproduire, soit parce qu'on a spécifiquement pour objectif de réaliser un clonage (pour assurer la stabilité des caractères de la variété à reproduire).", null);
		techRepos.save(t2);
		Technique t3=new Technique(null, "greffe", "En agriculture, le greffage est un mode de reproduction végétative qui consiste à implanter dans les tissus d'une plante (nommée « porte-greffe ») un bourgeon ou un fragment quelconque (nommé « greffon »), prélevé sur une autre plante ou de la même plante, pour que celui-ci continue à croître en faisant corps avec la première. La greffe est le résultat de cette opération.", null);
		techRepos.save(t3);
		Technique t4=new Technique(null, "marcottage", "Le marcottage est une méthode de multiplication des végétaux par la rhizogenèse (développement de racines) sur une partie aérienne d'une plante mère. Certaines plantes se marcottent naturellement. En horticulture, le marcottage est souvent utilisé pour cloner les plantes ligneuses, dont le bouturage est difficile. On fait généralement le marcottage à la fin de l'été ou au début de l'automne.", null);
		techRepos.save(t4);
		
		Commentaire c5=new Commentaire(null, "J'aime cette technique", u4, null, null, null, t2);
		comRepos.save(c5);
		Commentaire c6=new Commentaire(null, "Je suis fan de bouturage", u3, null, null, null, t2);
		comRepos.save(c6);
		
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String Date1="2021-11-06 21:31:13";
		Date d1=formatter.parse(Date1);
		Message m1=new Message(null, "Message envoyé le plus ancien", d1,u4, u2);
		msgRepos.save(m1);
		Calendar cal = Calendar.getInstance();
		//Date d2=formatter.parse(formatter.format(cal.getTime()));
		Date d2=cal.getTime();
		Message m2=new Message(null, "Message envoyé le plus récent", d2,u4, u3);
		msgRepos.save(m2);
		
		Message m3=new Message(null, "Message reçu le plus ancien", d1,u1, u4);
		msgRepos.save(m3);
		Message m4=new Message(null, "Message reçu le plus récent", d2,u2, u4);
		msgRepos.save(m4);
		
		
		
	}
}
