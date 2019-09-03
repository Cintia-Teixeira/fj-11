package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco2;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco2 {
	public static void main(String[] args) {
			Banco2 banco2 = new Banco2("CintiaBank", 013);
			
			ContaCorrente c1 = new ContaCorrente();
			c1.setTitular("Thais");
			c1.setAgencia("1234");
			c1.setNumero(56798);
			c1.deposita(500.0);
			banco2.adiciona(c1);
			
			ContaCorrente c2 = new ContaCorrente();
			c2.setTitular("Maria");
			c2.setAgencia("1234");
			c2.setNumero(97875);
			c2.deposita(250.0);
			banco2.adiciona(c2);
			
			ContaCorrente c3 = new ContaCorrente();
			c3.setTitular("Talita");
			c3.setAgencia("1234");
			c3.setNumero(56484);
			c3.deposita(1500.0);
			banco2.adiciona(c3);
		
			
			for (int i = 0; i < 7; i++) {
				ContaCorrente conta = new ContaCorrente();
				conta.setTitular("Titular " + i);
				conta.setAgencia("1234");
				conta.setNumero(i);
				conta.deposita(i * 1000);
				banco2.adiciona(conta);
			}
			
			ContaCorrente c4 = new ContaCorrente();
			c4.setTitular("Gabriel");
			c4.setAgencia("1234");
			c4.setNumero(87985);
			c4.deposita(10000.0);
			banco2.adiciona(c4);
			
			
			banco2.mostraContas();
			
	}
	
	
}
