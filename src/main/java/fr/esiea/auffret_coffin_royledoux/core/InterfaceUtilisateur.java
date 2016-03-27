package fr.esiea.auffret_coffin_royledoux.core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;

class InterfaceUtilisateur {
	
	InterfaceUtilisateur(final Piece piece){
		new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				switch (e.getKeyCode()){
					case KeyEvent.VK_RIGHT:
						Deplacement.droite(piece);
						break;
					case KeyEvent.VK_LEFT:
						Deplacement.gauche(piece);
						break;
					case KeyEvent.VK_DOWN:
						Deplacement.descendre(piece);
						break;
					case KeyEvent.VK_A:
						Rotation.antiHoraire(piece);
						break;
					case KeyEvent.VK_Z:
						Rotation.horaire(piece);
						break;
					default:
						break;
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		};
	}
}
