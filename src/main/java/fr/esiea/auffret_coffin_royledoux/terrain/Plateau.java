package fr.esiea.auffret_coffin_royledoux.terrain;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Plateau {
	
	public static int hauteur = 30;
	public static int largeur = 10;
	public static int tableau[][] = new int[hauteur][largeur];

	public void aLInterieur(Piece p){
		if(p.getPositionX() < 0) { p.setPositionX(0); }
		if(p.getPositionX() >= largeur) { p.setPositionX(largeur-1); }
		if(p.getPositionY() < 0) { p.setPositionY(0); }
		if(p.getPositionY() >= hauteur) { p.setPositionY(hauteur-1); }
	}
}
