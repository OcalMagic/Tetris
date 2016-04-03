package fr.esiea.auffret_coffin_royledoux.core;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Jeu {
	
	private static int SCORE = 0;
	public static int getScore() {
		return SCORE;
	}

	public static void setScore(int score) {
		SCORE = score;
	}

	private Piece pieceCourante = PieceFactory.GenerationPiece();;
	public Piece getPieceCourante() {
		return pieceCourante;
	}

	private static Plateau pplateau = new Plateau();
	
	public Jeu(){
		boolean gagner = true;
				
		while(gagner){
			
			// TODO tour suivant
			Deplacement.descendre(pieceCourante);
			
			// TODO ecouter le clavier
			new InterfaceUtilisateur(pieceCourante);
			
			// TODO collision
			gagner = collision(gagner);
			
			// TODO regle du jeu
			new RegleDuJeu();
		}

	}
	
	
	private boolean collision(boolean gagner){
		//Si la case de dessous est pleine
		int[][] tab = getPplateau().getTableau();
		if(tab[pieceCourante.getPositionY()+1][pieceCourante.getPositionX()] == 1){
			gagner = false;
		}
		return gagner;
	}

	public static Plateau getPplateau() {
		return pplateau;
	}

}
