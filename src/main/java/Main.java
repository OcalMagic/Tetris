import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.mouvement.Deplacement;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;
import fr.esiea.auffret_coffin_royledoux.terrain.Plateau;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece p = new Piece();
		p.setPositionX(0);
		p.setPositionY(20);
		p.creerBarre();
		//new Printer(p.forme);
		Deplacement d = new Deplacement();
		d.descendre(p);
		new Printer(Plateau.tableau);

	}

}
