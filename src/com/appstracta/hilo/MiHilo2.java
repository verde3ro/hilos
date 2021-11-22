package com.appstracta.hilo;

public class MiHilo2 extends Thread {

	public MiHilo2(String nombre) {
		// llamado al constructor padre
		super(nombre);
	}

	@Override
	public void run() {
		System.out.println("Inciando .. " + this.getName());

		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println(String.format("En %s :: %d, recuento %d", this.getName(), this.getId(), i));
			}
		} catch (InterruptedException ex) {
			System.out.println("Intterumpido " + this.getName());
		}

		System.out.println("Finalizado " + this.getName());
	}

}
