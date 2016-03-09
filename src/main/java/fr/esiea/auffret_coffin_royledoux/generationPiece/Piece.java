package fr.esiea.auffret_coffin_royledoux.generationPiece;

import java.util.List;
import java.util.ArrayList;

public class Piece {

	int[][] position0 = null;
	int[][] position1 = null;
	int[][] position2 = null;
	int[][] position3 = null;
	public List<int[][]> position = new ArrayList<int[][]>();

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
		position.add(position0 = new int[][]{{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}});
		position.add(position1 = new int[][]{{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}});
		position.add(position2 = new int[][]{{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}});
		position.add(position3 = new int[][]{{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}});
		forme = position0;
	}
	
	public void creerCube() {
		position.add(position0 = new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}});
		position.add(position1 = new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}});
		position.add(position2 = new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}});
		position.add(position3 = new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}});
		forme = position0;
	}


}
