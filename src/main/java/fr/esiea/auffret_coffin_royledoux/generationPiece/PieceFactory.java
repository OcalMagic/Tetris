package fr.esiea.auffret_coffin_royledoux.generationPiece;

public class PieceFactory {
	
	public static Piece GenerationPiece() {
		int choixPiece = (int) Math.random()*2;

		switch(choixPiece){
			case 0 :
				return new Barre(0, 20);
			case 1 :
				return new Cube(0, 20);
			default :
				return new Barre(0, 20);
		}
	}
}
