package fr.esiea.auffret_coffin_royledoux.core;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;

public class Jeu {
	
	public static Piece pieceCourante;
	PieceFactory generationPiece;
	
	public Jeu(){
		// TODO creer une piece

		int choixPiece = (int) Math.random()*2;

		switch(choixPiece){
			case 0 :
				pieceCourante = generationPiece.Barre();
				break;
			case 1 :
				pieceCourante = generationPiece.Cube();
				break;
			default :
				pieceCourante = generationPiece.Barre();
				break;
		}

		
		// TODO ecouter le clavier
		
		InterfaceUtilisateur UI = new InterfaceUtilisateur(pieceCourante);
		
		// TODO collision
		// TODO regle du jeu
	}
}
