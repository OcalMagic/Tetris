package fr.esiea.auffret_coffin_royledoux.generationPiece;

class LInvBarre extends Piece {
	
	private int[][] position0 = new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
	private int[][] position1 = new int[][]{{0,0,1,0},{1,1,1,0},{0,0,0,0},{0,0,0,0}};
	private int[][] position2 = new int[][]{{0,1,0,0},{0,1,0,0},{0,1,1,0},{0,0,0,0}};
	private int[][] position3 = new int[][]{{1,1,1,0},{1,0,0,0},{0,0,0,0},{0,0,0,0}};

	LInvBarre(int x, int y) {
		super(x, y);
		position.add(position0);
		position.add(position1);
		position.add(position2);
		position.add(position3);
		setForme(position0);
	}
}
