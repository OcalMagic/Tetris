package fr.esiea.auffret_coffin_royledoux.mouvement;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Deplacement {

	int[] position = new int[2];

	/*
	public Deplacement(Piece p){
		position[0] = p.getPositionX();
		position[1] = p.getPositionY();
	}
	*/
	
	public static void descendre(Piece p){
		p.setPositionY(p.getPositionY()-1);
	}
	
	public static void droite(Piece p){
		p.setPositionX(p.getPositionX()+1);
	}
	
	public static void gauche(Piece p){
		p.setPositionX(p.getPositionX()-1);
	}
	

}
