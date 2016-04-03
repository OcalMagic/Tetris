package fr.esiea.auffret_coffin_royledoux.mouvement;

import fr.esiea.auffret_coffin_royledoux.core.Jeu;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Deplacement {

	public static void descendre(Piece p){
		p.setPositionY(p.getPositionY()-1);
		aLInterieur(p);
	}
	
	public static void droite(Piece p){
		p.setPositionX(p.getPositionX()+1);
		aLInterieur(p);
	}
	
	public static void gauche(Piece p){
		p.setPositionX(p.getPositionX()-1);
		aLInterieur(p);
	}
	
	public static void aLInterieur(Piece piece){
		if(piece.getPositionX() < 0) { piece.setPositionX(0); }
		if(piece.getPositionX() >= Jeu.getPplateau().getHauteur()) { piece.setPositionX(Jeu.getPplateau().getHauteur()-1); }
		if(piece.getPositionY() < 0) { piece.setPositionY(0); }
		if(piece.getPositionY() >= Jeu.getPplateau().getLargeur()) { piece.setPositionY(Jeu.getPplateau().getLargeur()-1); }
	}

}
