import java.util.ArrayList;
import java.util.List;

import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Barre;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Cube;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.generationPiece.PieceFactory;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Piece p = new Barre(0, 20);
		//Piece c = new Cube(0, 20);
		PieceFactory pf = new PieceFactory();
		Piece a = pf.Barre();
		List<Piece> liste = new ArrayList<Piece>();
		liste.add(a);
		//p.setPositionX(0);
		//p.setPositionY(20);
		//p.creerBarre();
		
		//new Printer(liste.get(2).getForme());
		Rotation r = new Rotation();

		/*r.antiHoraire(a);
		new Printer(a.forme);
		r.horaire(a);
		new Printer(a.forme);
		r.antiHoraire(a);
		new Printer(a.forme);
		r.antiHoraire(a);
		new Printer(p.forme);
		r.antiHoraire(p);
		new Printer(p.forme);
		r.antiHoraire(p);
		new Printer(p.forme);*/

		r.horaire(a);
		new Printer(a.getForme());
		r.horaire(a);
		new Printer(a.getForme());
		r.antiHoraire(a);
		new Printer(a.getForme());
		Deplacement d = new Deplacement();
		d.descendre(a);
		new Printer(Plateau.tableau);

	}

}
