# Tetris
fr.esiea.auffret_coffin_royledoux

Trinôme: Benoit Auffret, Olivier Coffin, Florence Roy-Ledoux

Exercice Architecture:
	
	En premier nous avons défini les cas d'utilisation du programme:
		- Mode solo: 1 seul joueur en local
		- Mode multijoueur: 2 joueurs en réseau avec connexion TCP
		
	Puis déterminer les principaux composants:
		- Unité de traitement des informations du clavier, des fonctionnalités
		- Interface pour accéder/intéragir avec cette unité
		- Dépendances vers d'autres composants
		
	A ce stade du projet, nous avons pu définir l'architecture utilisée: MVC (modèle, vue, controleur)
	Les différents éléments sont bien visibles dans notre architecture.
		Modèle: Les données observables: Barre.java, Cube.java, lBarre.java, Terrain.java, Plateau.java
		
		Vue: L'affichage des données du modèle affichables et l'interface utilisateur (ici Fenetre.java): 
		Affiche.java, Printer.java
			
		Controleur: Ce qui permet de faire le lien entre les modèles et la vue, également, synchronise les 
			la modifications des données du modèle et l'affichage: Deplacement.java et Rotation.java qui 
			modifient l'affichage des pièces, InterfaceUtilisateur.java qui prend en compte les intéractions
			avec le clavier, Jeu.java et Sauvegarder.java qui gèrent les fonctionnalités et règles principales du jeu.
			
	Nous avons utilisé cette architecture car elle est appropriée pour un système intéractif tel qu'un jeu, nécessitant
	des modifications répétées des données affichable. Chaque données va passer par un controleur pour pouvoir
	être affichée.
	
	
Exercice Design Pattern/SOLID:

	FACTORY: PieceFactory.java
		Cette classe permet de créer des pieces sans avoir à toucher au classes Piece ou ses classes filles. Cela permet de n'avoir aucuns problèmes avec ces classes.
		
	SOLID / SRP : Main.java
		Le main à une seule et unique fonction : lancer le jeu.
		Ça permet d'être sur que seule la classe appelé est lancé.
	
	SOLID / OCP : Barre.java
		Cette classe définit ce qu'est une pièce, elle ne peut se modifié mais est ouverte à l'extension.
		
	

			
			
			
			

			
		