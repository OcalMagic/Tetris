package fr.esiea.auffret_coffin_royledoux.mouvement;

import java.util.ListIterator;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Rotation {

	public void horaire(Piece p){
		for(int i = 0 ; i<4 ; i++){
			if(p.forme == p.position.get(i) ){
				if(i==3){
					i=0;
					p.forme = p.position.get(i);
					System.out.println("1NONNN+++++++++++"+i);
					break;
				}else{
					p.forme = p.position.get(i+1);
					System.out.println("1OUIIII+++++++++++"+(i+1));
					break;
				}
			}
			
		}
	}
	
	public void antiHoraire(Piece p){
		for(int i = 0 ; i<4 ; i++){
			if(p.forme == p.position.get(i) ){
				if(i==0){
					i=3;
					p.forme = p.position.get(i);
					System.out.println("2NONNN--------"+i);
					break;
				}else{
					p.forme = p.position.get(i-1);
					System.out.println("2OUIIII---------"+(i-1));
					break;
				}
			}
		}
	}
}
