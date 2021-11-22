package com.appstracta;

import com.appstracta.hilo.MultiHilo;

public class MainMulti {

	public static void main(String[] args) {
		System.out.println("Hilo principal iniciado.");

		MultiHilo.crearYComenzar("Número 1");
		MultiHilo.crearYComenzar("Número 2");
		MultiHilo.crearYComenzar("Número 3");

		try {
			for (int i = 0; i < 50; i++) {
				System.out.print(" .");
			}
			// Dormimos el hilo principal
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			System.out.println("Hilo principal interrumpido");
		}

		System.out.println("Hilo principal finalizado");
	}

}
