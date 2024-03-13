package view;
import controller.Metodos4;
import controller.RaceController;

public class Main4 {

	public static void main(String[] args) {
		int puloMax, distancia;
		puloMax = 10;
		distancia = 100;
		RaceController race = new RaceController();
		System.out.println("Distancia maxima de pulo: " + puloMax + "\nDistancia da corrida: " + distancia + "\n\n");
		for (int i = 0; i < 5 ; i++) {
			Thread corrida = new Metodos4(puloMax , distancia, (i+1),race);
			corrida.start();
		}
	}
}
