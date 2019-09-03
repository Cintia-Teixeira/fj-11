package br.com.caelum.contas.main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new LinkedList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		for (int i = 0; i < 30000; i++) {
			teste.get(i);
		}
		
		//usando for each
		/*for (int i : teste) {
			teste.get(i);
		}*/
		
		//usando Iterator
		/*Iterator<Integer> it = teste.iterator();
		while (it.hasNext()) {
			Integer t = it.next();
		}*/
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}

}
