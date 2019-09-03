package br.com.caelum.contas.modelo;

import java.util.List;

/**
 * Classe responsável por moldar as contas do Banco.
 * 
 * @author Cintia Teixeira
 */

public abstract class Conta implements Comparable<Conta> {
	protected static double saldo;
	private String titular;
	private int numero;
	private String agencia;

	// public abstract String getTipo();

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}


	@Override
	public String toString() {
		return "[titular= " + titular.toUpperCase() + ", número= " + numero + ", agência= " + agencia + "]";
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		// dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
	
	public void reverseOrder(List<Conta> contas) {
		reverseOrder(contas);
	}
}
