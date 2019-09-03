package br.com.caelum.contas.main;

import java.util.Random;

public class TestaRandom {
	public static void main(String[] args) {
		// instancia um objeto da classe Random usando o construtor básico - os números gerados vão mudar a cada execução
		Random gerador = new Random();
		
		//nesse caso, os números gerados serão sempre os mesmos
		//Random gerador = new Random(1234);

		// imprime sequência de 10 números inteiros aleatórios entre 0 e 25
		for (int i = 0; i < 10; i++) {
			System.out.println(gerador.nextInt(26));
		}
	}
}
