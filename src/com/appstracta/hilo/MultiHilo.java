package com.appstracta.hilo;

public class MultiHilo implements Runnable{
	private String nombre;

	public MultiHilo(String nombre) {
		this.nombre = nombre;
	}

	public static void crearYComenzar(String nombre) {
		MultiHilo multiHilo = new MultiHilo(nombre);
		Thread hilo = new Thread(multiHilo);
		hilo.start();
	}

	@Override
	public void run() {
		System.out.println("Inciando .. " + nombre);

		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println(String.format("En %s :: recuento %d",nombre, i));

				if (nombre.contains("2")) {
					throw new InterruptedException("Yo lo trone");
				}
			}
		} catch (InterruptedException ex) {
			System.out.println("Intterumpido " + nombre);
		}

		System.out.println("Finalizado " + nombre);
	}

}
