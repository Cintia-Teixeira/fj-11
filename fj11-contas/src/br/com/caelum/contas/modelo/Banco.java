package br.com.caelum.contas.modelo;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] == null) {
				this.contas[i] = c;
				break;
			}
		}
	}

	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			System.out.println("Conta na posi��o " + i + ": " + "\nTitular = " + this.contas[i].getTitular()
					+ "\nAg�ncia = " + this.contas[i].getAgencia() + "\nN�mero = " + this.contas[i].getNumero());

			System.out.println();
		}
	}

	public boolean contem(Conta conta) {
		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] == conta) {
				System.out.println("A conta " + conta + " pertence ao banco " + this.nome + ".");
				return true;
			}
		}
		System.out.println("A conta " + conta + " n�o pertence ao banco " + this.nome + ".");
		return false;
	}
}
