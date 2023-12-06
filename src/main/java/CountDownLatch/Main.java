package CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Solicita datos al usuario
		int cantElementos = Integer
				.valueOf(JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo: "));
		int cantHilos = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el número hilos: "));

		Thread[] hilos = new Thread[cantHilos];
		CountDownLatch latch = new CountDownLatch(cantHilos);
		
		int[] numeros = new int[cantElementos]; 
		int longitudSegmento = cantElementos / cantHilos;	
		int aux1 = 0;
		int aux2 = longitudSegmento;

		// Genera los numeros del arreglo
		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(10) + 1;
		}
		
		SumadorParcial.setArreglo(numeros);

		// Se crean los hilos
		Runnable sumador;
		for (int i = 0; i < cantHilos; i++) {
			if (i == cantHilos - 1) {
				sumador = new SumadorParcial(aux1, numeros.length - 1, latch);
			} else {
				sumador = new SumadorParcial(aux1, aux2, latch);
			}
			hilos[i] = new Thread(sumador);
			aux1 = aux2 + 1;
			aux2 += longitudSegmento;
		}

		// Se inicializan los hilos
		for (int i = 0; i < cantHilos; i++) {
			hilos[i].start();
		}

		// Se efectua la suma secuencial de los numeros del arreglo
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Suma parcial: " + SumadorParcial.getTotal());
		System.out.println("Suma total: " + suma);
	}
}
