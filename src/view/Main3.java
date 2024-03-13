package view;
import controller.Metodos3;
public class Main3 {

	public static void main(String[] args) {
		int vet[] = new int[1000];
		int i;
		
		for (i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 100 + 1);		
		}
		
		for (i = 1; i < 3; i++) {
		Thread v = new Metodos3(vet, i);
		v.start();
		}
	}
}
