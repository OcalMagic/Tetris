import java.util.ArrayList;
import java.util.List;

import fr.esiea.auffret_coffin_royledoux.affichage.Affiche;
import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.core.Jeu;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;
import fr.esiea.auffret_coffin_royledoux.multijoueur.Client;
import fr.esiea.auffret_coffin_royledoux.multijoueur.Serveur;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;


@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Jeu();
		
		/*String host = "127.0.0.1";

		int port = 2345;

	    Serveur ts = new Serveur();

	      ts.ouvrirServeur();
	      System.out.println("Serveur initialisé.");

	      for(int i = 0; i < 5; i++){
	         Thread t = new Thread(new Client(host, port));
	         t.start();
	      }*/
		

	}

}
