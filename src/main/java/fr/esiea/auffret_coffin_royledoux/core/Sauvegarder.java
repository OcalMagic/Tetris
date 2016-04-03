package fr.esiea.auffret_coffin_royledoux.core;

import java.io.*;

class Sauvegarder {
	
	Sauvegarder(int score){
		//ecriture du fichier sauvegarder
		FileWriter fichier;
		try {
			fichier = new FileWriter("sauvegarde.txt");
			//ecriture dans le fichier
			fichier.write(score);
			fichier.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*

*/