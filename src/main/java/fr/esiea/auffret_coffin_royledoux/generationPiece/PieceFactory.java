package fr.esiea.auffret_coffin_royledoux.generationPiece;

public class PieceFactory {
	final static int X = 5;
	final static int Y = 0;
	
	public static Piece GenerationPiece() {
		int choixPiece = (int) Math.random()*4;

		switch(choixPiece){
			case 0 :
				return new Barre(X, Y);
			case 1 :
				return new Cube(X, Y);
			case 2 :
				return new LBarre(X, Y);
			case 4 :
				return new LInvBarre(X, Y);
			default :
				return new Barre(X, Y);
		}
	}
}
