package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco2 {

	private String nome;
	private int numero;
	private List<Conta> contas;
	private Map<String, Conta> mapa;

	public Banco2(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		// this.contas = new ArrayList<Conta>();
		this.mapa = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		// contas.add(c);
		mapa.put(c.getTitular(), c);
	}

	/*
	 * public boolean contem(Conta conta) { for (int i = 0; i < this.contas.length;
	 * i++) { if (this.contas[i] == conta) { System.out.println("A conta " + conta +
	 * " pertence ao banco " + this.nome + "."); return true; } }
	 * System.out.println("A conta " + conta + " não pertence ao banco " + this.nome
	 * + "."); return false; }
	 */

	public Conta pega(int x) {
		for (Conta conta : contas) {
			if (conta.getNumero() == x) {
				System.out.println(conta);
			}
		}
		return null;
	}

	public int pegaQuantidadeDeContas() {
		int i = contas.size();
		System.out.println(i);
		return i;
	}

	// busca titular usando o for
	/*
	 * public Conta buscaPorTitular(String nome) { for (Conta conta : contas) { if
	 * (conta.getTitular().equals(nome)) { System.out.println(conta); return conta;
	 * } } return null; }
	 */

	//busca titular usando o Map
	public Conta buscaPorTitular(String nome) {
		for (String titular : mapa.keySet()) {
		Conta c = mapa.get(nome);
		System.out.println(c);
		
		return c;
	}
		return null;
	}
}