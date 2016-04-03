package fr.esiea.auffret_coffin_royledoux.terrain;


public class Plateau {
	
	private int hauteur = 21;
	private int largeur = 10;
	private int tableau[][] = new int[hauteur][largeur];
	
	public int getHauteur(){
		return this.hauteur;
	}
	
	public int getLargeur(){
		return this.largeur;
	}
	
	public int[][] getTableau(){
		return this.tableau;
	}
}
