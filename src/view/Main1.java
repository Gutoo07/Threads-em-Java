package view;
import controller.Metodos1;

public class Main1 {

	public static void main(String[] args) {
		for (int Id = 0; Id < 5; Id ++) {
			Thread id = new Metodos1();		
			id.start();
					
		}
	}

}
