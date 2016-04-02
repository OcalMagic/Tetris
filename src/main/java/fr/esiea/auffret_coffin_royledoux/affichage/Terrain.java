package fr.esiea.auffret_coffin_royledoux.affichage;

import java.awt.*;
import javax.swing.*;

import fr.esiea.auffret_coffin_royledoux.core.Jeu;


class Terrain extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Terrain g = new Terrain();
	
	protected Terrain(){
		this.setBackground(Color.BLUE);
		this.add(g);
		this.setVisible(true); 
	}
	
	public void paint (Graphics g){
		
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		
		TableauVide(g);
		
	}

	private void TableauVide(Graphics g) {
		for(int i = 0 ; i < Jeu.getPplateau().getHauteur() ; i++){
			for(int j = 0 ; j < Jeu.getPplateau().getLargeur() ; j++){
				g.fillRect(5*i, 5*j, 5, 5);
			}
		}
	}
}
