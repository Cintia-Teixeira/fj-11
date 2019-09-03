package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco2 {

	private String nome;
	private int numero;
	private List<ContaCorrente> contas;

	public Banco2(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<ContaCorrente>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < 20;) {
			if (this.contas.get(i) == null) {
			Conta cc = new ContaCorrente();
			this.contas.add(i, (ContaCorrente) cc);
			}
			break;
		}
	}

	public void mostraContas() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Conta na posição " + i + ": " + "\nTitular = " + ((Conta) this.contas).getTitular()
					+ "\nAgência = " + ((Conta) this.contas).getAgencia() + "\nNúmero = "
					+ ((Conta) this.contas).getNumero());

			System.out.println();
		}
	}

	/*
	 * public boolean contem(Conta conta) { for (int i = 0; i < this.contas.length;
	 * i++) { if (this.contas[i] == conta) { System.out.println("A conta " + conta +
	 * " pertence ao banco " + this.nome + "."); return true; } }
	 * System.out.println("A conta " + conta + " não pertence ao banco " + this.nome
	 * + "."); return false; }
	 */

	public Conta pega(int x) {
		Iterator<ContaCorrente> it = contas.iterator();
		while (it.hasNext()) {
			Conta c = it.next();
		}
		return (Conta) it;
	}

	public int pegaQuantidadeDeContas() {
		int quantidade = 0;
		for (ContaCorrente i : contas) {
			quantidade = contas.lastIndexOf(i);
		}
		System.out.println(quantidade);
		return quantidade;
	}
}