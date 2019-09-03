package br.com.caelum.contas.main;

import java.util.Random;

public class TestaRandom {
	public static void main(String[] args) {
		// instancia um objeto da classe Random usando o construtor b�sico - os n�meros gerados v�o mudar a cada execu��o
		Random gerador = new Random();
		
		//nesse caso, os n�meros gerados ser�o sempre os mesmos
		//Random gerador = new Random(1234);

		// imprime sequ�ncia de 10 n�meros inteiros aleat�rios entre 0 e 25
		for (int i = 0; i < 10; i++) {
			System.out.println(gerador.nextInt(26));
		}
	}
}
