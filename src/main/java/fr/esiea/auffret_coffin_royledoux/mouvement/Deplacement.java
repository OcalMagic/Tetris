package fr.esiea.auffret_coffin_royledoux.mouvement;

import fr.esiea.auffret_coffin_royledoux.core.Jeu;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Deplacement {

	public static void descendre(Piece p){
		p.setPositionY(p.getPositionY()-1);
		Jeu.getPplateau().aLInterieur(p);
	}
	
	public static void droite(Piece p){
		p.setPositionX(p.getPositionX()+1);
		Jeu.getPplateau().aLInterieur(p);
	}
	
	public static void gauche(Piece p){
		p.setPositionX(p.getPositionX()-1);
		Jeu.getPplateau().aLInterieur(p);
	}

}
