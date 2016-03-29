package fr.esiea.auffret_coffin_royledoux.generationPiece;

public class PieceFactory {

	public Piece Cube(){
		return new Cube(0, 20);
	}
	
	public Piece Barre(){
		return new Barre(0, 20);
	}
}
