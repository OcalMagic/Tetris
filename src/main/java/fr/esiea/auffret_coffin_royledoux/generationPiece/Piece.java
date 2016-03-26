package fr.esiea.auffret_coffin_royledoux.generationPiece;

import java.util.List;
import java.util.ArrayList;

public class Piece {
	protected List<int[][]> position = new ArrayList<int[][]>() ;
	private int forme[][];
	private int positionX, positionY;

	Piece (int x , int y){
		this.positionX = x;
		this.positionY = y;
		}
	
	public void setPositionX(int x){
		this.positionX = x;
	}
	
	public int getPositionX(){
		return this.positionX;
	}
	
	public void setPositionY(int y){
		this.positionY = y;
	}
	
	public int getPositionY(){
		return this.positionY;
	}

	public List<int[][]> getPosition() {
		return position;
	}

	public int[][] getForme() {
		return forme;
	}

	public void setForme(int[][] forme2) {
		this.forme = forme2;
	}
	
}
