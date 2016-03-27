package fr.esiea.auffret_coffin_royledoux.core;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Jeu {
	
	public static int score = 0;
	public static Piece pieceCourante;
	PieceFactory generationPiece;
	
	public Jeu(){
		boolean gagner = true;
		
		// TODO creer une piece
		piece();
		
		while(gagner){
			
			// TODO tour suivant
			Deplacement.descendre(pieceCourante);
			
			// TODO ecouter le clavier
			InterfaceUtilisateur UI = new InterfaceUtilisateur(pieceCourante);
			
			// TODO collision
			gagner = collision(gagner);
			
			// TODO regle du jeu
			new RegleDuJeu();
		}

	}
	
	private void piece(){
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
	}
	
	private boolean collision(boolean gagner){
		//Si la case de dessous est pleine
		if(Plateau.tableau[pieceCourante.getPositionY()+1][pieceCourante.getPositionX()] == 1){
			gagner = false;
		}
		return gagner;
	}
}
