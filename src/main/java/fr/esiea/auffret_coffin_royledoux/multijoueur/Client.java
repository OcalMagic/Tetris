package fr.esiea.auffret_coffin_royledoux.multijoueur;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable {

	private Socket connexion = null;
	private PrintWriter writer = null;
	private BufferedInputStream reader = null;

	private String commande = "HELLOOO";
	private static int count = 0;
	private String name = "Client-";   

	public Client(String host, int port) {

		name += ++count;

	    try {
	         connexion = new Socket(host, port);
	      } catch (UnknownHostException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	   }

	   public void run(){

	      for(int i =0; i < 10; i++){

	         try {
	            Thread.currentThread().sleep(1000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }

	         try {
	            writer = new PrintWriter(connexion.getOutputStream(), true);
	            reader = new BufferedInputStream(connexion.getInputStream());

	            writer.write(commande);
	            writer.flush();  
	            System.out.println("Commande " + commande + " envoyée au serveur");

	         } catch (IOException e1) {
	            e1.printStackTrace();
	         }

	         

	         try {
	            Thread.currentThread().sleep(1000);

	         } catch (InterruptedException e) {

	            e.printStackTrace();

	         }

	      }
	      writer.write("CLOSE");
	      writer.flush();
	      writer.close();

	   }

	
}
