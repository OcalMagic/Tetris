package fr.esiea.auffret_coffin_royledoux.generationPiece;

public class PieceFactory {
	final static int X = 5;
	final static int Y = 21;
	
	public static Piece GenerationPiece() {
		int choixPiece = (int) Math.random()*3;

		switch(choixPiece){
			case 0 :
				return new Barre(X, Y);
			case 1 :
				return new Cube(X, Y);
			case 2 :
				return new LBarre(X, Y);
			default :
				return new Barre(X, Y);
		}
	}
}
