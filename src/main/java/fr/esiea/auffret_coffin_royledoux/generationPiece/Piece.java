package fr.esiea.auffret_coffin_royledoux.generationPiece;

public class Piece {
	
	public int[][] forme = new int[4][4];
	int positionInitialX, positionInitialY;

	public void setPositionInitialX(int x){
		this.positionInitialX = x;
	}
	
	public int getPositionInitialX(){
		return this.positionInitialX;
	}
	
	public void setPositionInitialY(int y){
		this.positionInitialY = y;
	}
	
	public int getPositionInitialY(){
		return this.positionInitialY;
	}
	
	public void creerBarre(){
		int[][] Position1 = {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}};
		int[][] Position2 = {{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position3 = {{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}};
		int[][] Position4 = {{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		forme = Position1;
	}
	
	public void creerCube() {
		int[][] Position1 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position2 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position3 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position4 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		forme = Position1;
	}


}
