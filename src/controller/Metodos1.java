package controller;

public class Metodos1 extends Thread {
			
		public Metodos1 () {
		}
		@Override
		public void run () {
			int id = (int) getId();
			System.out.println("TID #" + id);
		}
		

}
