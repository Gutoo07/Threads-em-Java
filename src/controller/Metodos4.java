package controller;
import controller.RaceController;

public class Metodos4 extends Thread {
	int puloMax, distancia, sapo;
	RaceController race;
	
	public Metodos4(int puloMax, int distancia, int sapo, RaceController race) {
		this.race = race;
		this.puloMax = puloMax;
		this.distancia = distancia;
		this.sapo = sapo;
	}
	
	public void run() {
		int pulo = 0;		

		while (pulo < distancia) {
			pulo = pulo + (int) (Math.random() * 11);			
			System.out.println("SAPO-" + sapo + " " + pulo + "m");
			
			if (pulo >= distancia) {
				System.out.println("Sapo " + sapo + " terminou em " + race.getPosition());
			}
		}		
	}	
}
