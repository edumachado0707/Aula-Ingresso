package controller;

import java.util.concurrent.Semaphore;

public class ingresso {

	public static void main(String[] args) {
		
	public class IngressoController extends Thread {
		
		private int countPessoas = 0;
		private int countLogin = 0;
		private int countIngresso = 0;
		private int countCompra = 0;
		
	public IngressoController(int idThread, Semaphore semaforo) {
			this.idThread = idThread;
			this.semaforo = semaforo;
		
			@Override
			public void run() {
				Ingresso();
			}

			private void Pessoa() {
				if (idThread % 1 == 0) {
					pessoa = (int) ((Math.random() * 300) + 300);
					String pessoa = "Quantidade de Pessoa ";
					try {
						int pessoa = pessoa/300;
						System.out.println("Pessoa: Pessoa iniciada pela thread #" + idThread + " e o total " + pessoa + " quantidade de pessoas.");
						while (countIngresso < 5) {
							
							sleep(60);
							countLogin += tempo / 60;
							System.out.println("O login da thread " + idThread +  " está: " + countLogin + "% concluído");
							if(countlogin >= 120) {
							System.out.println("O login da thread " + idThread +  " está 100% concluído");
							}
					
					
			private void Compra() {	
				if(idThreadCompra >=4) {
					compra = (int) ((Math.random()*4)-4);
					String compra = " Compra de ";
					try {
						int compra = compra-4;
						System.out.println(Compra: Compra iniciada pela thread #" + idThread + " e o total " + compra + " quantidade de compra.");
						while (countCompra < 5) {
							
							sleep(180);
							countCompra += tempo / 60;
							System.out.println("A compra da thread " + idThread +  " está: " + countCompra + "% concluído");
							if(countlogin >= 120) {
							System.out.println("A compra da thread " + idThread +  " está 100% concluído");
							
				if (countCompra >= 180)	
					System.out.println(" Compra não podera ser efetuada" : );
							}
						
						}	
				
			
				
            private void ValidacaoCompra() {
            	if(idThread ValidacaoCompra <=100) {
					Validacaocompra = (int) ((Math.random()*100)-4);
					String compra = " Compra de Validada";
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					semaforo.release();
					try {
            }
            	
  }
				
				
				
			
