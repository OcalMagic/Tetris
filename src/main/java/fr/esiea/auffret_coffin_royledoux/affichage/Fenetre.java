package fr.esiea.auffret_coffin_royledoux.affichage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Terrain terrain = new Terrain();
	
	protected Fenetre(){
		this.setTitle("Tetris");
		this.setSize(new Dimension(250, 300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	    
		JButton boutonScore = new JButton("Scores");
		JButton boutonMulti = new JButton("Multijoueurs");
		
	    boutonScore.addActionListener(new BoutonScoreListener());
	    boutonMulti.addActionListener(new BoutonMultiListener());
	    
	    boutonScore.setVisible(true);
	    boutonMulti.setVisible(true);

		
		JPanel pan=new JPanel();
		GridLayout grilleBoutons = new GridLayout(5, 1);
		grilleBoutons.setHgap(5);
		grilleBoutons.setVgap(20);
		pan.setLayout(grilleBoutons);
	    pan.add(boutonScore);
	    pan.add(boutonMulti);
	    
	    //On définit le layout à utiliser sur le content pane
	    this.setLayout(new BorderLayout());
	    
	    
	    
	    this.getContentPane().add(terrain, BorderLayout.CENTER);	    
	    this.getContentPane().add(pan, BorderLayout.EAST);

		
		//this.setContentPane(terrain);
		this.setResizable(false);
		this.setVisible(true);
	}
	

	  class BoutonScoreListener implements ActionListener
	  	{
		    public void actionPerformed(ActionEvent arg1) {
		    	System.out.println("Score");   
		    }

		  }	
	  
	  class BoutonMultiListener implements ActionListener
	  	{
		    public void actionPerformed(ActionEvent arg2) {
		    	System.out.println("Multi");   
		    }

		  }
	
}
