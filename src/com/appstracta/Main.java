package com.appstracta;

import com.appstracta.hilo.MiHilo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hilo principal iniciando....");

		// Creamos objeto de mihilo
		MiHilo miHilo = new MiHilo("Número 1");

		Thread hilo = new Thread(miHilo);

		// Inciamos hilo
		hilo.start();

		try {
			for (int i = 0; i < 50; i++) {
				System.out.print(" .");
			}

			// Dormimos el hilo principal
			Thread.sleep(100);
			System.out.println("MEnsaje del Hilo :: " + miHilo.getHola());
		} catch (InterruptedException ex) {
			System.out.println("Hilo principal interrumpido");
		}

		System.out.println("Hilo principal finalizado");
	}
}
