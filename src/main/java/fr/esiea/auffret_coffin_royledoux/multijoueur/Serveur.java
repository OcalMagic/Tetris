package fr.esiea.auffret_coffin_royledoux.multijoueur;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Serveur {

	private int port = 2345;
	private String host = "127.0.0.1";
	private ServerSocket serveur = null;
	private boolean isRunning = true;
	
	public Serveur() {
		
		try {
			serveur = new ServerSocket(port, 100, InetAddress.getByName(host) );
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void ouvrirServeur() {
		
		Thread t = new Thread(new Runnable(){
			
	         public void run(){
	        	 
	            while(isRunning == true){
	               try {
	                  //On attend la connexion du 2ème joueur
	                  Socket client = serveur.accept();

	                  System.out.println("Connexion établie.");   
	                  
	                  //On traite la connexion du 2ème joueur dans un thread séparé
	                  Thread t = new Thread(new ProcessClient(client));

	                  t.start();
	               } catch (IOException e) {
	                  e.printStackTrace();
	               }
	            }

	            try {
	               serveur.close();
	            } catch (IOException e) {
	               e.printStackTrace();
	               serveur = null;
	            }
	         }

	      });     
	      t.start();
	}
	
	public void fermerServeur(){
	      isRunning = false;
	}   
	
}
