package br.com.caelum.contas.modelo;

import java.util.List;

/**
 * Classe respons�vel por moldar as contas do Banco.
 * 
 * @author Cintia Teixeira
 */

public abstract class Conta implements Comparable<Conta> {
	protected static double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public abstract String getTipo();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "[titular= " + titular.toUpperCase() + ", n�mero= " + numero + ", ag�ncia= " + agencia + "]";
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nN�mero: " + this.numero;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		// dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou depositar um valor negativo");
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
