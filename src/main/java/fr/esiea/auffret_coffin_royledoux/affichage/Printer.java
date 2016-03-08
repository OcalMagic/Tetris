package fr.esiea.auffret_coffin_royledoux.affichage;

public class Printer {
	
	public Printer(int[][] tab){
		for(int i = 0; i<4 ; i++){
			for(int j = 0; j<4 ; j++){
				System.out.print(tab[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
