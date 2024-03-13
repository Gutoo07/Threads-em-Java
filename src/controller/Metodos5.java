package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Metodos5 extends Thread {
	String site;
	
	public Metodos5 (String site) {
		this.site = site;
	}
	
	public void run() {
		try {
			Process p = Runtime.getRuntime().exec(site);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader (leitor);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
