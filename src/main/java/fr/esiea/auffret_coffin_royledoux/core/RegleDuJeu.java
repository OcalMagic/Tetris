package fr.esiea.auffret_coffin_royledoux.core;


class RegleDuJeu {

	protected RegleDuJeu(){
		LignePleine();
		Perdu();
		
	}
	
	private void LignePleine(){
		// TODO ligne pleine
		for(int i = Jeu.getPplateau().getHauteur()-1; i >= 0 ; i--){
			boolean lignePleine = true;
			
			lignePleine = LaLigneEstEllePleine(i, lignePleine);
			
			if(lignePleine){
				Jeu.setScore(Jeu.getScore()+1);
				// TODO affichage
			}
		}
	}

	private boolean LaLigneEstEllePleine(int ligne, boolean lignePleine) {
		// TODO Auto-generated method stub
		int[][] tableau = Jeu.getPplateau().getTableau();
		for(int j = 0 ; j < Jeu.getPplateau().getLargeur() ; j++){
			if(tableau[ligne][j] == 0){
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
