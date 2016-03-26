package fr.esiea.auffret_coffin_royledoux.mouvement;

import fr.esiea.auffret_coffin_royledoux.generationPiece.Piece;

public class Rotation {

	public void horaire(Piece p){
		for(int i = 0 ; i<4 ; i++){
			if(p.getForme() == p.getPosition().get(i) ){
				if(i==3){
					i=0;
					p.setForme(p.getPosition().get(i));
					break;
				}else{
					p.setForme(p.getPosition().get(i+1));
					break;
				}
			}
		}
	}
	
	public void antiHoraire(Piece p){
		for(int i = 0 ; i<4 ; i++){
			if(p.getForme() == p.getPosition().get(i) ){
				if(i==0){
					i=3;
					p.setForme(p.getPosition().get(i));
					break;
				}else{
					p.setForme(p.getPosition().get(i-1));
					break;
				}
			}
		}
	}
}
