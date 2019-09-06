package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHashCode {
	public static void main(String[] args) {
		Set<Conta> setContas = new HashSet<>();
		
		for (int i = 0; i <= 5; i++) {
			Conta conta = new ContaCorrente();
			conta.setTitular("Titular " + i);
			conta.setAgencia("1234");
			conta.setNumero(i);
			conta.deposita(i * 1000);
			setContas.add(conta);
		}
		
		Conta conta = new ContaCorrente();
		conta.setTitular("Thais");
		conta.setAgencia("1234");
		conta.setNumero(0);
		conta.deposita(10);
		setContas.add(conta);
		
		System.out.println(setContas);
	}
}
