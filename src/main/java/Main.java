import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.generationPiece.CreerBarre;
import fr.esiea.auffret_coffin_royledoux.generationPiece.CreerCube;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece p = new CreerBarre(0, 20);
		Piece c = new CreerCube(0, 20);
		//p.setPositionX(0);
		//p.setPositionY(20);
		//p.creerBarre();
		new Printer(p.getForme());
		Rotation r = new Rotation();
		r.horaire(p);
		new Printer(p.getForme());
		r.horaire(p);
		new Printer(p.getForme());
		r.antiHoraire(p);
		new Printer(p.getForme());
		Deplacement d = new Deplacement();
		d.descendre(c);
		new Printer(Plateau.tableau);

	}

}
