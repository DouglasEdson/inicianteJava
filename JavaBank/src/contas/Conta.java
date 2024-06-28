package contas;

import cliente.Cliente;

//saldo, agência, número e titular.

public class Conta {

	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;

	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public boolean saca(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			System.out.println("Não há saldo suficiente, operação negada.");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			destino.deposita(valor);
			// System.out.println("O saldo atual é: " + saldo);
			System.out.println("Operação realizada com sucesso!");
			return true;
		} else {
			System.out.println("Operação negada, saldo insuficiente!");
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public double getNumero() {
		return this.numero;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
}
