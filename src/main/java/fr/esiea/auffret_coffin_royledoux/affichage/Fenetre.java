package fr.esiea.auffret_coffin_royledoux.affichage;

import java.awt.Dimension;

import javax.swing.*;

class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Terrain terrain = new Terrain();
	
	protected Fenetre(){
		this.setTitle("Tetris");
		this.setSize(new Dimension(200, 300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(terrain);
		this.setResizable(false);
		this.setVisible(true);
	}
}
