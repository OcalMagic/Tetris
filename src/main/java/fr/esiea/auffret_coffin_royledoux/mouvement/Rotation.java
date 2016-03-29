package fr.esiea.auffret_coffin_royledoux.mouvement;

import java.util.ListIterator;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Rotation {

	public void horaire(Piece p){
		//ListIterator<int[][]> li = p.position.listIterator();

		for(int i = 0 ; i<p.position.size() ; i++){
			if(p.forme == p.position.get(i) ){
				if(i != (p.position.size()-1)){
					p.forme = p.position.get(i++);
					System.out.println("1OUIIII+++++++++++"+i);
					break;

				}else{
					i=0;
					p.forme = p.position.get(i);
					System.out.println("1NONNN+++++++++++"+i);
					break;
				}
			}
			
		}
	}
	
	public void antiHoraire(Piece p){
		//ListIterator<int[][]> li = p.position.listIterator();

		for(int i = 0 ; i<p.position.size() ; i++){

			if(p.forme == p.position.get(i) ){
				if(i != 0){
					p.forme = p.position.get(i--);
					System.out.println("2OUIIII---------"+i);
					break;

				}else{
					i=(p.position.size()-1);
					p.forme = p.position.get(i);
					System.out.println("2NONNN--------"+i);
					break;
				}
			}
		}
	}
}
