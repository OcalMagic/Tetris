package fr.esiea.auffret_coffin_royledoux.core;

import fr.esiea.auffret_coffin_royledoux.affichage.Affiche;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Jeu {

	Affiche a = new Affiche();

	private static Plateau pplateau = new Plateau();
	public static Piece pieceCourante;
	public static Plateau getPplateau() {
		return pplateau;
	}
	
	public Jeu(){
		boolean gagner = true;
		int score = 0;

		int cpt =0;
		
		while(gagner){
			
			boolean etape = true;
			boolean stop = true;
			pieceCourante = PieceFactory.GenerationPiece();


			System.out.println(cpt++);
			while(etape & stop){
				// TODO tour suivant
				Deplacement.descendre(pieceCourante);
				a.Affichage();

				//Derniere ligne on s'arrete
				stop = Stop(stop, pieceCourante);
				// TODO collision
				etape = collision(etape, pieceCourante);

				// TODO ecouter le clavier
				new InterfaceUtilisateur(pieceCourante);
				a.Affichage();

			}
			
			// TODO regle du jeu
			score = LignePleine(score);
			a.Affichage();
			gagner = Perdu(pieceCourante, gagner);
			a.Affichage();
		}
		new Sauvegarder(score);
	}
	
	private boolean Stop(boolean stop, Piece piece) {
		if(piece.getPositionY()==20){
			return false;
		}
		return true;
	}

	private boolean collision(boolean etape, Piece piece){
		//Si la case de dessous est pleine
		int[][] tab = pplateau.getTableau();
		if(tab[piece.getPositionX()+1][piece.getPositionY()] == 1){
			etape = false;
		}
		return etape;
	}
	
	private int LignePleine(int score){
		// TODO ligne pleine
		for(int i = Jeu.getPplateau().getHauteur()-1; i >= 0 ; i--){
			boolean lignePleine = true;
			
			lignePleine = LaLigneEstEllePleine(i, lignePleine);
			
			if(lignePleine){
				score++;
				// TODO affichage
			}
		}
		return score;
	}

	private boolean LaLigneEstEllePleine(int ligne, boolean lignePleine) {
		// TODO Auto-generated method stub
		int[][] tableau = Jeu.getPplateau().getTableau();
		for(int j = 0 ; j < Jeu.getPplateau().getLargeur() ; j++){
			if(tableau[ligne][j] == 0){
				lignePleine = false;
				break;
			}
		}
		return lignePleine;
	}
	
	private boolean Perdu(Piece piece, boolean gagner){
		//si collision sur la premiere ligne
		if(piece.getPositionY() < 0){
			gagner = false;
		}
		return gagner;
	}
	

}
