package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {
		List<Conta> lc = new ArrayList<Conta>();
		//List<Conta> lc = new LinkedList<Conta>();
		Random aleatorio = new Random();
		
		for (int i = 0; i < 10; i++) {
			ContaCorrente cc = new ContaCorrente();
			cc.setTitular("Titular: " + i);
			cc.setAgencia("123");
			cc.setNumero(i);
			cc.deposita(aleatorio.nextInt(50));
			lc.add(i, cc);
			
		//	System.out.println("Posição " + i
		//			+ "\n" + cc + "\n" + cc.getSaldo());	
			
		
		}

		System.out.println(lc);
		
	
	}

}
