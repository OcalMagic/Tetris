import fr.esiea.auffret_coffin_royledoux.affichage.Printer;
import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece p = new Piece();
		p.setPositionInitialX(0);
		p.setPositionInitialY(20);
		p.creerBarre();
		new Printer(p.forme);

	}

}
