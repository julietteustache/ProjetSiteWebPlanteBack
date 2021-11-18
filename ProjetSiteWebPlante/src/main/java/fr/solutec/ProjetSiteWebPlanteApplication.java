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
import fr.solutec.entities.Publication;
import fr.solutec.entities.Technique;
import fr.solutec.entities.User;
import fr.solutec.repository.AdresseRepository;
import fr.solutec.repository.AnnonceRepository;
import fr.solutec.repository.CommentaireRepository;
import fr.solutec.repository.EvenementRepository;
import fr.solutec.repository.MessageRepository;
import fr.solutec.repository.PlanteRepository;
import fr.solutec.repository.PublicationRepository;
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
	@Autowired
	PublicationRepository publiRepos;

	public static void main(String[] args) {
		SpringApplication.run(ProjetSiteWebPlanteApplication.class, args);
		System.out.println("Commande terminée");
	}

	@Override
	public void run(String... args) throws Exception {
		
		Plante p1=new Plante(null, "plante", "", "rosier", "Le Rosier, ou Églantier, est un genre de plantes, le genre Rosa de la famille des Rosaceae, originaires des régions tempérées et subtropicales de l'hémisphère nord. Ce sont des arbustes et arbrisseaux sarmenteux et épineux. Suivant les avis souvent divers des botanistes, le genre Rosa comprend de 100 à 200 espèces qui s'hybrident facilement entre elles.\r\n"
				+ "\r\n"
				+ "Plusieurs espèces et de nombreux cultivars, issus de mutations ou de croisements, sont cultivés comme plantes ornementales pour leurs fleurs, les roses. Celles-ci constituent la plus importante catégorie des fleurs coupées, vendues chez les fleuristes2, mais les rosiers sont aussi cultivés pour la production d'essence de parfumerie.", 200, "automne", 5, "soleil", null);
		planteRepos.save(p1);
		Plante p2=new Plante(null, "arbre", "", "bonsai", "Le bonsaï ou bonzaï, culture miniaturisée de végétaux, est un art traditionnel japonais dérivé de l'art originaire chinois du penjing. Cette pratique se retrouve également dans les cultures d'autres pays de cette région du monde comme le Vietnam ou la Corée sous l'influence chinoise.\r\n"
				+ "\r\n"
				+ "La plante ou l'arbre qui en est l'objet est miniaturisé par application de différentes techniques (taille des branches et racines, gestion des apports nutritifs...) et modelage de la forme (par ligature). Le but en est une recherche esthétique et la ressemblance de l'arbre avec la nature.", 500, "printemps", 10, "ombre", null);
		planteRepos.save(p2);
		Plante p3=new Plante(null, "légume", "curcubitacé", "courgette", "La courgette est une plante herbacée de la famille des Cucurbitaceae, c'est aussi le fruit comestible de la plante du même nom.\r\n"
				+ "\r\n"
				+ "La courgette est un fruit courant en été, la fleur de courgette est aussi utilisée en cuisine. Les différentes variétés de courgettes sont des cultivars de l'espèce Cucurbita pepo, et de la sous-espèce Cucurbita pepo subsp. pepo dont fait partie aussi la citrouille véritable", 100, "printemps", 7, "soleil", null);
		planteRepos.save(p3);
		Plante p4=new Plante(null, "plante", "aromatique", "ciboulette", "La ciboulette ou civette (Allium schoenoprasum L.) est une plante aromatique de la famille des Amaryllidacées (anciennement Liliacées ou Alliacées), cultivée pour ses feuilles souvent utilisées comme condiment.\r\n"
				+ "\r\n"
				+ "Autres noms vernaculaires : appétit (poitevin), branlette, brelette, chiboulette. Dans d'autres langues, allemand : Schnittlauch, anglais : chives, espagnol : cebollino, italien : erba cipollina.\r\n"
				+ "\r\n"
				+ "La ciboulette fait partie des plantes dont la culture est recommandée dans les domaines royaux par Charlemagne dans le capitulaire De Villis (fin du viiie ou début du ixe siècle).", 50, "printemps", 10, "soleil", null);
		planteRepos.save(p4);
		Plante p5=new Plante(null, "plante", "aromatique", "menthe", "Les menthes forment un genre (Mentha) de plantes herbacées vivaces de la famille des Lamiacées (Labiées), sous-famille des Nepetoideae, tribu des Mentheae, sous-tribu des Menthinae. Ce genre comprend de nombreuses espèces, dont beaucoup sont cultivées comme plantes aromatiques et condimentaires, ornementales ou médicinales. Le principal producteur est le Maroc notamment pour la préparation du thé à la menthe1.\r\n"
				+ "\r\n"
				+ "Si les menthes sont connues et appréciées pour leurs qualités aromatiques depuis l'Antiquité, certaines ont acquis une grande valeur économique depuis quelques décennies. Des 18 espèces de menthes actuellement acceptées, seulement trois (Mentha aquatica, M. canadensis, M. spicata) et leurs hybrides (M. x gracilis, M. x piperita, M. x villosonervata) dominent le marché mondial pour la production d'huile essentielle", 50, "printemps", 10, "soleil", null);
		planteRepos.save(p5);
		Plante p6=new Plante(null, "plante", "aromatique", "basilic", "Le Basilic ou Basilic romain (Ocimum basilicum L.) est une espèce de plantes herbacées thérophytes de la famille des Lamiacées (labiacées, labiées), cultivée comme plante aromatique et condimentaire. La plante est parfois appelée Basilic commun, Basilic aux sauces, Herbe royale1 ou Grand Basilic. Le Basilic commun est largement employé dans la cuisine italienne, d'autres variétés de basilic sont répandues dans certaines cuisines asiatiques : Taïwan, Thaïlande, Viêt Nam, Cambodge et Laos. Cette plante a eu plusieurs synonymes scientifiques dont Ocimum basilicum var. glabratum Benth, Ocimum basilicum var. majus Benth.\r\n"
				+ "\r\n"
				+ "Le mot basilic peut parfois désigner d'autres espèces appartenant au genre Ocimum dont le basilic citron (Ocimum canum L .), le basilic de Ceylan (Ocimum gratissimum) ou encore le basilic sacré (Ocimum sanctum L .)", 50, "printemps", 6, "ombre", null);
		planteRepos.save(p6);
		Plante p7=new Plante(null, "plante", "fruit", "framboise", "La framboise est un fruit rouge issu du framboisier (Rubus idaeus), un arbrisseau de la famille des rosacées. Selon qu'il s'agit de framboisiers sauvages ou cultivés, la framboise pèse de 4 à 10 g, mesure jusqu'à 2,5 cm et compte de 40 à 80 drupéoles. "
				+ "\r\n Ce fruit rouge-rose est issu de la transformation de la quarantaine de minuscules carpelles d'une seule et même fleur, qui se transforment en drupéoles semi-soudées. C'est à la fois un « faux syncarpe », car les carpelles sont attachés mais non fusionnés et une « polydrupe » car chaque drupéole, remplie d'une pulpe juteuse et contenant une graine, a la même structure qu'une drupe. La face externe du fruit est recouverte de poils microscopiques, ce qui donne à la framboise son aspect velouté.\r\n"
				+ "\r\n"
				+ "Le framboisier forme naturellement une touffe dont les rameaux se renouvellent annuellement par émission de nouveaux rejets. La multiplication se fait par ces drageons racinés qui sont généralement plantés à l'automne.\r\n"
				+ "\r\n"
				+ "Sur les variétés remontantes, une première petite fructification se fait dès la première année ; mais remontantes ou non remontantes, la grande fructification se fait sur les rameaux de l'année précédente, qui après fructification, se dessèchent et meurent.\r\n"
				+ "\r\n"
				+ "De forme ovoïde ou conique, elle a une saveur sucrée accompagnée, selon les variétés, d'une pointe d'acidité. Fruit fragile et délicat, il est généralement présenté en barquettes pour le protéger des chocs et des manipulations.", 200, "printemps", 8, "soleil", null);
		planteRepos.save(p7);
		Plante p8=new Plante(null, "légume", "curcubitacé", "potiron", "Le potiron est une plante de la famille des Cucurbitacées originaire des régions tropicales d'Amérique du Sud.\r\n"
				+ "\r\n"
				+ "Le potiron est largement cultivé comme plante potagère pour son fruit comestible à maturité. Le terme désigne aussi ce fruit consommé comme légume. C'est l'une des cinq espèces de courges les plus couramment cultivées.", 100, "automne", 3, "soleil", null);
		planteRepos.save(p8);
		
		Adresse a1=new Adresse(null,"120 rue d'Assas", 75006,"Paris");
		adresseRepos.save(a1);
		Adresse a2=new Adresse(null,"87 rue de Tolbiac", 75013,"Paris");
		adresseRepos.save(a2);
		Adresse a3=new Adresse(null,"40 avenue d'Etienne", 64200,"Biarritz");
		adresseRepos.save(a3);
		Adresse a4=new Adresse(null,"22 rue Lahouze", 64100,"Anglet");
		adresseRepos.save(a4);
		

		User u1=new User(null, "Eustache", "Juliette", "eujuliette","juju","Buisson ardent",Long.parseLong("1000"),a3);
		userRepos.save(u1);
		User u2=new User(null, "Cornet", "Arthur", "coarthur","tutur","Petit cactus",Long.parseLong("0") ,a2);
		userRepos.save(u2);
		User u3=new User(null, "Gallon", "Marie-Rose", "mrgallon","maro","Grand chêne",Long.parseLong("2000"),a1);
		userRepos.save(u3);
		User u4=new User(null, "Msaidie", "Zaher", "mszaher","zaza","Tulipe printanière",Long.parseLong("750"),a4);
		userRepos.save(u4);
		
		Annonce an1=new Annonce(null,3,"bouture","On m'a offert 4 magnifiques bonsais, en ayant plus que prévu, je vous propose 3 boutures afin que vous puissiez vous aussi profiter de cette magnifique plante qui égaillera votre salon j'en suis sûre!",p2,u1);
		annonceRepos.save(an1);
		Annonce an2=new Annonce(null,3,"plante","J'ai eu la chance de voir mes rosiers pousser manifiquement bien, je ne pensais pas en avoir autant alors je donne quelques uns de pieds, merci d'en prendre soin :)",p1,u2);
		annonceRepos.save(an2);
		Annonce an3=new Annonce(null,10,"graine","Après cette magnifique année, mes framboisiers sont arrivés à maturité, je n'en ai jamais mangé d'aussi bonnes ! Alors je veux que vous puissiez vous aussi d'en profiter, je donne donc 10 graines :)",p7,u3);
		annonceRepos.save(an3);
		Annonce an4=new Annonce(null,3,"plante","Je ne pensais pas que la ciboulette poussait si vite et en aussi grande quantité ! Bien que très contente de ce résultat, j'en ai bien trop pour moi seul alors je souhaite en faire profiter les autres :)   ",p4,u3);
		annonceRepos.save(an4);
		Annonce an5=new Annonce(null,2,"plants","Echange plants de ciboulette contre basilic ou autres herbes aromatiques. Remise en main propre sur Paris possible !",p4,u2);
		annonceRepos.save(an5);
		Annonce an6=new Annonce(null,40,"graine","Donne des graines de potiron déjà germées. Je peux les remettre en main propre sur Paris ou bien les envoyer par la poste. Merci de me contacter avant de passer commande svp !",p8,u2);
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
		Message m1=new Message(null, "Bonjour, avez vous toujours des boutures de rosier?", d1,u4, u2);
		msgRepos.save(m1);
		Calendar cal = Calendar.getInstance();
		//Date d2=formatter.parse(formatter.format(cal.getTime()));
		Date d2=cal.getTime();
		Message m2=new Message(null, "Bonjour, encore merci pour l'atelier de la semaine dernière, j'ai beaucoup appris !", d2,u4, u3);
		msgRepos.save(m2);
		
		Message m3=new Message(null, "Bonjour, avez vous toujours des boutures de rosier?", d1,u1, u4);
		msgRepos.save(m3);
		Message m4=new Message(null, "Bonjour, encore merci pour l'atelier de la semaine dernière, j'ai beaucoup appris !", d2,u2, u1);
		msgRepos.save(m4);
		
		Publication pu1=new Publication(null, u4, "J'ai réussi à faire pousser un bonsaï !", d1, null);
		publiRepos.save(pu1);
		Publication pu2=new Publication(null, u4, "Regardez mon rosier !", d2, null);
		publiRepos.save(pu2);
		
		
	}
}
