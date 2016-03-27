package fr.esiea.auffret_coffin_royledoux.mouvement;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Deplacement {

	int[] position = new int[2];

	
	public static void descendre(Piece p){
		p.setPositionY(p.getPositionY()-1);
		Plateau.aLInterieur(p);
	}
	
	public static void droite(Piece p){
		p.setPositionX(p.getPositionX()+1);
		Plateau.aLInterieur(p);
	}
	
	public static void gauche(Piece p){
		p.setPositionX(p.getPositionX()-1);
		Plateau.aLInterieur(p);
	}
	

}
