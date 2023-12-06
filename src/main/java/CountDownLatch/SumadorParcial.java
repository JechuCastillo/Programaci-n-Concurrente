package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class SumadorParcial implements Runnable {

	private static int[] arreglo;
	private static int total = 0;
	private int indiceIni;
	private int indiceFinal;
	private int resultadoSumaParcial;
	private final CountDownLatch latch;

	public SumadorParcial(int indiceIni, int indiceFinal, CountDownLatch latch) {
		this.indiceIni = indiceIni;
		this.indiceFinal = indiceFinal;
		this.resultadoSumaParcial = 0;
		this.latch = latch;
	}

	public static void setArreglo(int[] numeros) {
		arreglo = numeros;
	}

	public static int getTotal() {
		return total;
	}

	private synchronized void actualizarTotal() {
		total += resultadoSumaParcial;
	}

	@Override
	public void run() {

		for (int i = indiceIni; i <= indiceFinal; i++) {
			resultadoSumaParcial += arreglo[i];
		}
		actualizarTotal();
		System.out.println(resultadoSumaParcial);
		latch.countDown();
	}
}
