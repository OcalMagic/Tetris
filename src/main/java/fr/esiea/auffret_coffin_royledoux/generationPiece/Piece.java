package fr.esiea.auffret_coffin_royledoux.generationPiece;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Piece {

	int[][] position1 = null;
	int[][] position2 = null;
	int[][] position3 = null;
	int[][] position4 = null;
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
		position.add(position1 = new int[][]{{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}});
		position.add(position2 = new int[][]{{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}});
		position.add(position3 = new int[][]{{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}});
		position.add(position4 = new int[][]{{1,1,1,1},{0,0,0,0},{0,0,0,0},{0,0,0,0}});
		forme = position1;
	}
	
	public void creerCube() {
		int[][] Position1 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position2 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position3 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		int[][] Position4 = {{0,1,1,0},{0,1,1,0},{0,0,0,0},{0,0,0,0}};
		forme = Position1;
	}


}
