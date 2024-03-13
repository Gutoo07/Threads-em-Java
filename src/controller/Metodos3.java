package controller;

public class Metodos3 extends Thread {
	
	int vet[];
	int i;
	
		public Metodos3(int vet[], int i) {
			this.vet = vet;
			this.i = i;
		}
		
		public void run() {
			if (i==2) {
				long tempoInicial = System.nanoTime();
				for (i = 0; i < vet.length; i++) {					
				}
				long tempoFinal = System.nanoTime();
				long tempoTotal = tempoFinal - tempoInicial;
				System.out.println("Vetor par: " + tempoTotal +" nanossegundos = " + (tempoTotal/1000000000) + "s");					
			} else {
				long tempoInicial = System.nanoTime();
				for (int num : vet) {					
				}
				long tempoFinal = System.nanoTime();
				long tempoTotal = tempoFinal - tempoInicial;				
				System.out.println("Vetor impar: " + tempoTotal +" nanossegundos = " + (tempoTotal/1000000000) + "s");					
			}			
		}
}
