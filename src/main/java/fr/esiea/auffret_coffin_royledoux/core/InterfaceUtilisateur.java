package fr.esiea.auffret_coffin_royledoux.core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;


public class InterfaceUtilisateur implements KeyListener {
	
	Piece p;
	Rotation r;
	
	public void keyTyped(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
			case KeyEvent.VK_LEFT: 
				if (p != null)
				 r.antiHoraire(p);
				
			case KeyEvent.VK_RIGHT:
				if (p != null)
				r.horaire(p);
			//default:
						
		}
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
