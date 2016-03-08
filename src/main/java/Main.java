import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;
import fr.esiea.auffret_coffin_royledoux.mouvement.Rotation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece p = new Piece();
		p.setPositionInitialX(0);
		p.setPositionInitialY(20);
		p.creerBarre();
		new Printer(p.forme);
		Rotation r = new Rotation();
		r.antiHoraire(p);
		new Printer(p.forme);
		r.antiHoraire(p);
		new Printer(p.forme);
		r.antiHoraire(p);
		new Printer(p.forme);
		r.antiHoraire(p);
		new Printer(p.forme);
		r.horaire(p);
		new Printer(p.forme);

	}

}
