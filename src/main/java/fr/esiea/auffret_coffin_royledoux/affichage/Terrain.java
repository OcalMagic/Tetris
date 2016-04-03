package fr.esiea.auffret_coffin_royledoux.affichage;

import java.awt.*;
import javax.swing.*;

import fr.esiea.auffret_coffin_royledoux.core.Jeu;

class Terrain extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private int tab[][];
	
	public void paint (Graphics g){
		
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		
		g.drawRect(9,10, 112, 234); //Draws the outline of the specified rectangle.
		Image img1 = Toolkit.getDefaultToolkit().getImage("Brique.gif");
	    	    
		for(int i = 0 ; i < Jeu.getPplateau().getHauteur() ; i++){
			for(int j = 0 ; j < Jeu.getPplateau().getLargeur() ; j++){
				int[][] tableau = Jeu.getPplateau().getTableau();
				if(tableau[i][j]==1){
					g.drawImage(img1, i, j, 20, 20, this);
				}
				
			}
		}
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				if(Jeu.pieceCourante.getForme()!=null){
					tab = Jeu.pieceCourante.getForme();
					if(tab[i][j]==1){
						g.drawImage(img1, 11*Jeu.pieceCourante.getPositionX(), 11*Jeu.pieceCourante.getPositionY(), 20, 20, this);
					}
				}
			}
		}
		
		g.finalize();		
	}

}
