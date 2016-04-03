package fr.esiea.auffret_coffin_royledoux.terrain;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Plateau {
	
	private int hauteur = 21;
	private int largeur = 10;
	private int tableau[][] = new int[hauteur][largeur];

	public void aLInterieur(Piece p){
		if(p.getPositionX() < 0) { p.setPositionX(0); }
		if(p.getPositionX() >= largeur) { p.setPositionX(largeur-1); }
		if(p.getPositionY() < 0) { p.setPositionY(0); }
		if(p.getPositionY() >= hauteur) { p.setPositionY(hauteur-1); }
	}
	
	public int getHauteur(){
		return this.hauteur;
	}
	
	public int getLargeur(){
		return this.largeur;
	}
	
	public int[][] getTableau(){
		return this.tableau;
	}
}
