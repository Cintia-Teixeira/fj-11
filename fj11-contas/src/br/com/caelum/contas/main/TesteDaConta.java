package br.com.caelum.contas.main;

import java.io.PrintStream;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteDaConta {
	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		c1.setAgencia("9876");
		c1.setNumero(123456);
		c1.setTitular("Cintia");
		
		System.out.println(c1);
		
		/*String palavra = "fj11";
		palavra = palavra.toUpperCase().replace("1", "3");
		//System.out.println(outra);
		String pl = "fj21";
		//int x = palavra.compareTo(outra);
		//palavra = palavra.replace("1", "2");
		
		System.out.println(palavra);*/
	}
} 