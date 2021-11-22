package com.appstracta;

public class MainHilo {

	public static void main(String[] args) {
		System.out.println("Inicio hilo principal");

		// Thread inner class (clase interna) y lamda
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Con clase interna para crear un objeto, como un hilo para ejecutar código");
			}
		}).start();

		System.out.println("finaliza hilo principal");
	}
}
