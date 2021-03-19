package view;

import java.util.concurrent.Semaphore;

import controller.IngressoController;

public class principal {

	public static void main(String[] args) {

			final int permissao = 1;
			Semaphore semaforo = new Semaphore(permissao);
			
			for (int i = 1; i < 4; i++) {
				Thread t = new IngressoController(i, semaforo);
				t.start();
			}
		}
}

