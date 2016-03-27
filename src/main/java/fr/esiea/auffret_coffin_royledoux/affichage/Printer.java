package fr.esiea.auffret_coffin_royledoux.affichage;


/*
 * Classe ephemere pour afficher dans la console
 */

public class Printer {
	
	public Printer(int[][] tab){
		for(int i = 0; i<tab.length ; i++){
			for(int j = 0; j<tab[i].length ; j++){
				System.out.print(tab[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
