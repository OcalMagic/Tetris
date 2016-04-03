package fr.esiea.auffret_coffin_royledoux.affichage;

public class Affiche {
	
	Fenetre frame = new Fenetre();

	public Affiche(){
		frame.setVisible(true);
	}
	
	public void Affichage(){
		frame.terrain.repaint();
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
