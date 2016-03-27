package fr.esiea.auffret_coffin_royledoux.core;

import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

class RegleDuJeu {

	protected RegleDuJeu(){
		LignePleine();
		Perdu();
		
	}
	
	private void LignePleine(){
		// TODO ligne pleine
		for(int i = Plateau.hauteur-1; i >= 0 ; i--){
			boolean lignePleine = true;
			
			lignePleine = LaLigneEstEllePleine(i, lignePleine);
			
			if(lignePleine){
				Jeu.score++;
				// TODO affichage
			}
		}
	}

	private boolean LaLigneEstEllePleine(int ligne, boolean lignePleine) {
		// TODO Auto-generated method stub
		for(int j = 0 ; j < Plateau.largeur ; j++){
			if(Plateau.tableau[ligne][j] == 0){
				lignePleine = false;
				break;
			}
		}
		return lignePleine;
	}
	
	
	// TODO perdu
	private void Perdu(){
		//si collision sur la premiere ligne
	}
}
