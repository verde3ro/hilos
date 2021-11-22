package com.appstracta;

import com.appstracta.hilo.MiHilo2;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Iniciando hilo principal..");

		MiHilo2 miHilo2 = new MiHilo2("Número 1");

		miHilo2.start();

		try {
			for (int i = 0; i < 50; i++) {
				System.out.print(" .");
			}

			Thread.sleep(100);
		} catch (InterruptedException ex) {
			System.out.println("Hilo principal interrumpido");
		}

		System.out.println("Hil principal finalizado");
	}

}
