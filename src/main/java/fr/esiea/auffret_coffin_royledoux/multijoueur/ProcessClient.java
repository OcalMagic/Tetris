package fr.esiea.auffret_coffin_royledoux.multijoueur;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class ProcessClient implements Runnable{
	
	private Socket sock;
	private PrintWriter writer = null;

	ProcessClient(Socket pSock){
	      sock = pSock;
	 }

	 public void run(){

		 System.err.println("Lancement du traitement de la connexion cliente");

	      while(!sock.isClosed()){

	         try {
	            writer = new PrintWriter(sock.getOutputStream());

	            //On attend la demande du 2ème joueur
	            InetSocketAddress remote = (InetSocketAddress)sock.getRemoteSocketAddress();

	            String debug = "";
	            debug = "Thread : " + Thread.currentThread().getName() + ". ";
	            debug += "Demande de l'adresse : " + remote.getAddress().getHostAddress() +".";
	            debug += " Sur le port : " + remote.getPort() + ".\n";

	            System.err.println("\n" + debug);

	            String toSend = "HELLO";

	            writer.write(toSend);

	            writer.flush();
	         }catch(SocketException e){
	            System.err.println("CONNEXION INTERROMPUE ! ");
	            break;
	         } catch (IOException e) {
	            e.printStackTrace();
	         }         

	      }

	   }

}
