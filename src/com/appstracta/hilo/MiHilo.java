package com.appstracta.hilo;

public class MiHilo implements Runnable {
	private String nombreHilo;
	private  String hola;

	public MiHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	// Ejecución del hilo con el metodo run
	@Override
	public void run() {
		System.out.println("Comenzando:: " + nombreHilo);

		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(400);
				System.out.println(String.format("En %s, recuento %d", nombreHilo, i));
				this.hola = "Como estas";
				// throw new InterruptedException("aqui");
			}
		} catch (InterruptedException ex){
			System.out.println("Ocurrio un error :: " + nombreHilo);
		}

		System.out.println("Terminado :: " + nombreHilo);
	}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
}
